<jsp:include page="MasterPageCabecera.jsp" />
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/ServletVerPelicula" />
<!-- llamo servlet al cargar pagina -->

<c:if test="${not empty selectPelicula}">

	<div id="contenido" class="film backdropped logged-out backdrop-loaded"
		style="margin-top: 110px;">
		<div class="content-wrap">
			<div id="film-page-wrapper" class="cols-3 overflow">
				<div>
				
				<c:if test="${not empty PuedeEditarPelicula}">


								<c:if test="${PuedeEditarPelicula == 'OK'}">

									<a style="font-size: 18px; color: #F7819F" href="ModificarPelicula.jsp?pelicula_id=${selectPelicula.id_pelicula}"
										class="has-icon icon-16 icon-edit"><span class="icon"></span><b>Editar Pel�cula</b></a>
									<br>
									<br>
								</c:if>


							</c:if>
				
					<div id="poster-col"
						class="col-6 gutter-right-1 col-poster-large is_stuck"
						style="position: /*fixed*/;">
						<section class="posters posters-230 no-hover el col">
							<div
								class="react-component film-poster film-poster-209381 poster">
								<img src="${selectPelicula.poster}"
									alt="${selectPelicula.nombre}" height="345" width="230">

							</div>

			

							<div class="film-stats">
								<ul>
									<li class="filmstat-watches">
										<div class="star-rating" id="star-rating">


											<div style="font-size: 16px; font-weight: bold;">
											<input type=hidden id="puntTotalVieja" value="${selectPelicula.puntuacion_total}">
											Puntuaci�n: <span id="puntTotalActual" countpuntos="${selectCountPelicula}" totalpuntos="${selectTotalPelicula}">${selectPelicula.puntuacion_total}/5 (${selectCountPelicula} votos)</span>	
											</div>

											<c:if
												test="${not empty userLogueado && empty puntajeUserLogueado}">
												<label
													onclick="javascript:PuntuarPelicula(5, ${selectPelicula.id_pelicula});"
													style="cursor: pointer;" id="fiveStars">&#9733;</label>
												<label
													onclick="javascript:PuntuarPelicula(4, ${selectPelicula.id_pelicula});"
													style="cursor: pointer;" id="fourStars">&#9733;</label>
												<label
													onclick="javascript:PuntuarPelicula(3, ${selectPelicula.id_pelicula});"
													style="cursor: pointer;" id="threeStars">&#9733;</label>
												<label
													onclick="javascript:PuntuarPelicula(2, ${selectPelicula.id_pelicula});"
													style="cursor: pointer;" id="twoStars">&#9733;</label>
												<label
													onclick="javascript:PuntuarPelicula(1, ${selectPelicula.id_pelicula});"
													style="cursor: pointer;" id="oneStar">&#9733;</label>
											</c:if>

										</div>

										<div class="star-rating-voted" id="star-rating-voted">
											<c:if
												test="${not empty userLogueado && not empty puntajeUserLogueado}">

												<c:if test="${puntajeUserLogueado.puntuacion == 1}">
													<label>&#9733;</label>
													<label>&#9733;</label>
													<label>&#9733;</label>
													<label>&#9733;</label>
													<label style="color: #FFFF00;">&#9733;</label>
												</c:if>

												<c:if test="${puntajeUserLogueado.puntuacion == 2}">
													<label>&#9733;</label>
													<label>&#9733;</label>
													<label>&#9733;</label>
													<label style="color: #FFFF00;">&#9733;</label>
													<label style="color: #FFFF00;">&#9733;</label>
												</c:if>

												<c:if test="${puntajeUserLogueado.puntuacion == 3}">
													<label>&#9733;</label>
													<label>&#9733;</label>
													<label style="color: #FFFF00;">&#9733;</label>
													<label style="color: #FFFF00;">&#9733;</label>
													<label style="color: #FFFF00;">&#9733;</label>
												</c:if>


												<c:if test="${puntajeUserLogueado.puntuacion == 4}">
													<label>&#9733;</label>
													<label style="color: #FFFF00;">&#9733;</label>
													<label style="color: #FFFF00;">&#9733;</label>
													<label style="color: #FFFF00;">&#9733;</label>
													<label style="color: #FFFF00;">&#9733;</label>
												</c:if>


												<c:if test="${puntajeUserLogueado.puntuacion == 5}">
													<label style="color: #FFFF00;">&#9733;</label>
													<label style="color: #FFFF00;">&#9733;</label>
													<label style="color: #FFFF00;">&#9733;</label>
													<label style="color: #FFFF00;">&#9733;</label>
													<label style="color: #FFFF00;">&#9733;</label>
												</c:if>
											</c:if>

										</div> <c:if test="${empty userLogueado}">
											<a href="IniciarSesion.jsp" style="color: #F3F781;">(Inici�
												sesi�n para votar esta pel�cula)</a>
										</c:if>

									</li>
								</ul>
							</div>
						</section>
						<section class="watch-panel js-watch-panel">
							<h3 class="title">Trailer</h3>
							<p class="js-watch-panel-trailer">
								<a class="label -text track-event js-trailer-zoom cboxElement"
									onclick='javascript:showTrailer("${selectPelicula.trailer}");'>
									<span class="icon -play"></span> <span class="name">Ver</span>
								</a>
							</p>
						</section>
						<div class="follow-button-wrapper" style="visibility: visible;">

						</div>
					</div>
				</div>

				<div class="col-17" Style="top: 10%;">
					<section id="featured-film-header">
						<h1 class="film-title prettify">${selectPelicula.nombre}</h1>
						<p>
							<small> ${selectPelicula.anio} </small>
						</p>
					</section>
					<section class="section col-10 col-main">
						<section>
							<div class="review text text-large">
								<h4 class="tagline">Sinopsis</h4>
								<div class="truncate">
									<p>${selectPelicula.synopsis}</p>
								</div>
							</div>
						</section>
						<section>
							<div class="review text text-large">
								<br>
								<h4 class="tagline">Duraci�n</h4>
								<div class="truncate">
									<p>${selectPelicula.duracion} minutos</p>
								</div>
							</div>
						</section>
						<div id="tabbed-content">
							<header>
								<ul>
									<li>
										<h4 class="tagline">Director</h4>
									</li>
								</ul>
							</header>
							<div id="tab-cast">
								<div class="cast-list box-link-list">
									<p>
										<a
											href="VerPerfilDirector.jsp?id=${selectPelicula.director.id_director}"
											class="box-link"> <span>${selectPelicula.director.nombre}
												${selectPelicula.director.apellido}</span>
										</a>
									</p>
								</div>
							</div>
						</div>
						<div id="tabbed-content">
							<header>
								<ul>
									<li>
										<h4 class="tagline">Actores</h4>
									</li>
								</ul>
							</header>
							<div id="tab-cast">
								<div class="cast-list box-link-list">
									<p>
										<c:forEach items="${selectPelicula.actores}" var="actor">
											<a href="VerPerfilActor.jsp?id=${actor.id_actor}"
												class="box-link"> <span>${actor.nombre}
													${actor.apellido}</span>
											</a>
										</c:forEach>
									</p>
								</div>
							</div>
						</div>
					</section>
					<section class="film-recent-reviews">
						<section id="viewings-list">
							<h2 class="section-heading">Rese�as</h2>

							<div class="${tipoMensaje}">
								<b>${mensajeResultado}</b>
							</div>
							<c:if test="${!empty userLogueado}">
								<form action=ServletRegistrarResenia role="form"
									class="login form-horizontal" method="POST">


									<div class="form-group">
										<label class="control-label col-sm-2">Agregar nueva
											rese�a: </label>
										<div class="col-sm-10">
											<div>
												<div>
													<div>
														<textarea class="form-control" name="resenia" cols="40"
															rows="5" required
															title="Resenia debe contener de 10 a 250 caracteres."
															maxlength="250"></textarea>

													</div>
												</div>
											</div>
										</div>
									</div>


									<div class="form-group">
										<div class="col-sm-offset-2 col-sm-10">
											<div>
												<div>
													<div>
														<button type="submit" class="btn btn-success"
															id="btnAgregarResenia">Agregar rese�a</button>
													</div>
												</div>
											</div>
										</div>
									</div>

								</form>
							</c:if>

							<ul class="posters posters-70">
								<c:forEach items="${selectPelicula.resenias}" var="resenia">
									<li class="film-detail"><a class="avatar avatar-40"
										href="VerPerfilUsuario.jsp?id=${resenia.usuario.usuario}">
											<img src="${resenia.usuario.avatar}"
											alt="${resenia.usuario.usuario}" height="40" width="40">
									</a>
										<div class="film-detail-content">
											<p class="film-detail-meta rating-green">
												<a href="VerPerfilUsuario.jsp?id=${resenia.usuario.usuario}"
													class="author"> ${resenia.usuario.usuario} </a>
											</p>
											<div class="text collapsible-text">
												<div class="collapsed-text">
													<p>${resenia.resenia}</p>
												</div>
												<a style="float:right;" href="Comentarios?resenia_id=${resenia.id_resenia}"> <img src="imgs/comentarios.png"
											alt="Ver comentarios" height="60" width="60"></a>
											</div>
										</div>
										
										
										</li>

								</c:forEach>
							</ul>

						</section>
					</section>
				</div>
			</div>
		</div>
	</div>
	<div id="cboxOverlay" style="opacity: 0.7; display: none;"></div>
	<div id="colorbox" class=""
		style="display: none; visibility: visible; position: fixed; width: 880px; height: 486px; overflow: hidden; opacity: 1; cursor: auto; margin: auto; top: 0; left: 0; bottom: 0; right: 0;">
		<div id="cboxWrapper" style="height: 486px; width: 880px;">
			<div>
				<div id="cboxTopLeft" style="float: left;"></div>
				<div id="cboxTopCenter" style="float: left; width: 844px;"></div>
				<div id="cboxTopRight" style="float: left;"></div>
			</div>
			<div style="clear: left;">
				<div id="cboxMiddleLeft" style="float: left; height: 450px;"></div>
				<div id="cboxContent"
					style="float: left; width: 844px; height: 450px;">
					<div id="cboxLoadedContent"
						style="width: 844px; overflow: auto; height: 450px;"></div>
					<div id="cboxTitle" style="float: left; display: block;"></div>
					<div id="cboxCurrent" style="float: left; display: none;"></div>
					<div id="cboxNext" style="float: left; display: none;"></div>
					<div id="cboxPrevious" style="float: left; display: none;"></div>
					<div id="cboxSlideshow" style="float: left; display: none;"></div>
					<div id="cboxClose" style="float: left;"
						onclick="javascript:hideTrailer();">close</div>
				</div>
				<div id="cboxMiddleRight" style="float: left; height: 450px;"></div>
			</div>
			<div style="clear: left;">
				<div id="cboxBottomLeft" style="float: left;"></div>
				<div id="cboxBottomCenter" style="float: left; width: 844px;"></div>
				<div id="cboxBottomRight" style="float: left;"></div>
			</div>
		</div>
		<div
			style="position: absolute; width: 9999px; visibility: hidden; display: none;"></div>
	</div>

</c:if>


<jsp:include page="MasterPageFooter.jsp" />