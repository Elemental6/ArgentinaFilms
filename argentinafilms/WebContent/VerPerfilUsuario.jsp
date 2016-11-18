<jsp:include page="MasterPageCabecera.jsp" />
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<c:import url="/ServletVerPerfilUsuario" /> <!-- llamo servlet al cargar pagina -->

<c:if test="${not empty usuarioSelect}">


<div class="contenido" style="margin-top: 50px;">
	<div class="content-wrap">
		<div class="cagamargin"></div>
		<section id="profile-header">
			<div class="profile-summary">
				<span class="avatar avatar-60">
					<img src="<%=request.getContextPath()%>/${usuarioSelect.avatar}" width="60" height="60">

				</span>
				<div class="profile-person-info followable" style="width: 497px; max-width: 497px;">
					<div class="profile-name-wrap">
						<h1>
							${usuarioSelect.usuario}
						</h1>
						<span class="badge badge-patron">
							${usuarioSelect.rango}
						</span>
					</div>
					
					<c:if test="${usuarioSelect.usuario == userLogueado.usuario}">
					<div class="follow-button-wrapper" style="visibility: visible;">
						<a href="Javascript:showEdit();" class="has-icon icon-16 icon-edit"><span class="icon"></span><b>Modificar Perfil</b></a>
					</div>
					</c:if>
					<ul>
						<li class="has-icon icon-16 icon-location"><span class="icon"></span>
							<div id="nomyape">${usuarioSelect.nombre} ${usuarioSelect.apellido}</div>
						</li>
					</ul>
				</div>
				<ul class="stats">
					<li><p class="thousands">
						<strong>
							${fn:length(lasPeliculas)}
						</strong>
						<span>
							Peliculas
						</span></p>
					</li>
	 				<li><p>
	 					<strong>
							${fn:length(lasResenias)}
	 					</strong>
	 					<span>
	 						Reseñas
	 					</span></p>
	 				</li>
				</ul>
			</div>
			<section id="profile-nav">
				<nav>
					<ul>
						<li id="li-nav-one" class="selected">
							<a href="javascript:showResenias();">
								Reseñas
							</a>
						</li>
						<li id="li-nav-two" class="hide-for-owner">
							<a href="javascript:showPeliculas();">
								Peliculas
							</a>
						</li>
					</ul>
				</nav>
			</section>
		</section>
		<div class="cols-2">
			<div class="col-20">
				<section id="peliculas-section" class="section grid-150 grid-single-row" style="display:none;">
					<h2 class="section-heading">
						Peliculas que agregó
					</h2>
					
					<c:if test="${lasPeliculas.size() == 0 || lasPeliculas == null}">
						<div style="font-size: 18px!important; color: #A9E2F3; font-style:italic">(Este usuario no agregó ninguna película)</div>
					</c:if>
					
					<c:if test="${not empty lasPeliculas}">
					
					<ul class="posters posters-150 clear horizontal-list">

						<c:forEach items="${lasPeliculas}" var="pelicula">
						<li class="poster-container film-not-watched">
							<div class="react-component film-poster film-poster-240344 poster linked-film-poster removed-from-watchlist">
								<div>
									<img src="${pelicula.poster}" width="150" height="225">
									<a href="VerPelicula.jsp?pelicula_id=${pelicula.id_pelicula}" class="frame has-menu">
										<span class="overlay"></span>
									</a>
								</div>
							</div>
						</li>
						</c:forEach>
						
					
					</ul>
					</c:if>
				</section>		
				<section id="resenias-section" class="section">
					<h2 class="section-heading">
						Reseñas realizadas
					</h2>
					
					<c:if test="${lasResenias.size() == 0 || lasResenias == null}">
						<div style="font-size: 18px!important; color: #A9E2F3; font-style:italic">(Este usuario no hizo ninguna reseña)</div>
					</c:if>
					
					<c:if test="${not empty lasResenias}">
					
					<ul class="posters clear posters-70 film-details-list no-title">
						<c:forEach items="${lasResenias}" var="resenia">
						<li class="film-detail film-not-watched">
							<div class="react-component film-poster film-poster-209381 poster linked-film-poster removed-from-watchlist">
								<div>
									<img src="${resenia.pelicula.poster}" alt="${resenia.pelicula.nombre}" width="70" height="105">
									<a href="VerPelicula.jsp?pelicula_id=${resenia.pelicula.id_pelicula}" class="frame has-menu fm-amazon-streaming-availability">
										<span class="overlay"></span>
									</a>
								</div>
							</div>
							<div class="">
								<h2 class="film-title prettify">
									<a href="VerPelicula.jsp?pelicula_id=${resenia.pelicula.id_pelicula}">
										${resenia.pelicula.nombre}
									</a>
									<small>
										${resenia.pelicula.anio}
									</small>
								</h2>
								<div class="text collapsible-text">
									<p>
										${resenia.resenia}
									</p>
								</div>
							</div>
						</li>
						</c:forEach>
					</ul>
					
					</c:if>
				</section>
			</div>
		</div>
	</div>
</div>
	<div id="cboxOverlay" style="opacity: 0.7; display: none;"></div>
	<div id="colorbox" class="" style="display: none; visibility: visible; position: fixed; width: 380px; height: 286px; overflow: hidden; opacity: 1; cursor: auto; margin: auto; top: 0; left: 0; bottom: 0; right: 0;">
		<div id="cboxWrapper" style="height: 386px; width: 380px;">
			<div>
				<div id="cboxTopLeft" style="float: left;"></div>
				<div id="cboxTopCenter" style="float: left; width: 344px;"></div>
				<div id="cboxTopRight" style="float: left;"></div>
			</div>
			<div style="clear: left;">
				<div id="cboxMiddleLeft" style="float: left; height: 250px;"></div>
				<div id="cboxContent" style="float: left; width: 344px; height: 250px;">
					<div id="cboxLoadedContent" style="width: 344px; overflow: auto; height: 250px;">
						<form action="ModificarUsuario" role="form" class="login form-horizontal" style="width:250px;" method="POST">
							<label style="font-size: large; margin-top: 15px;">Modificar Perfil:</label>
							<label class="control-label col-sm-2">Nombre:</label>
							<input type="text" class="form-control login" name="txtNombre" id="txtNombre" placeholder="Ingrese su nombre real" pattern=".{2,100}" required title="Nombre debe contener de 2 a 100 caracteres." maxlength="100">
							<label class="control-label col-sm-2">Apellido:</label>
							<input type="text" class="form-control login" name="txtApellido" id="txtApellido" placeholder="Ingrese su apellido real" pattern=".{2,100}" required title="Apellido debe contener de 2 a 100 caracteres." maxlength="100">
							<button type="submit" class="btn btn-success" id="btnRegistrar" style="margin-top:20px;">Guardar Cambios</button>
						</form>
					</div>
					<div id="cboxTitle" style="float: left; display: block;"></div>
					<div id="cboxCurrent" style="float: left; display: none;"></div>
					<div id="cboxNext" style="float: left; display: none;"></div>
					<div id="cboxPrevious" style="float: left; display: none;"></div>
					<div id="cboxSlideshow" style="float: left; display: none;"></div>
					<div id="cboxClose" style="float: left;" onclick="javascript:hideEdit();">close</div>
				</div>
				<div id="cboxMiddleRight" style="float: left; height: 250px;"></div>
			</div>
			<div style="clear: left;">
				<div id="cboxBottomLeft" style="float: left;"></div>
				<div id="cboxBottomCenter" style="float: left; width: 344px;"></div>
				<div id="cboxBottomRight" style="float: left;"></div>
			</div>
		</div>
		<div style="position: absolute; width: 9999px; visibility: hidden; display: none;"></div>
	</div>


</c:if>


     <c:if test="${empty usuarioSelect}">
     	<c:redirect url="Error404.jsp"/>
     </c:if>  


<jsp:include page="MasterPageFooter.jsp" />