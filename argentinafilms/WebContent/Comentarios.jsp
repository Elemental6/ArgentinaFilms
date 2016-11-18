<jsp:include page="MasterPageCabecera.jsp" />
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<c:if test="${empty userLogueado}">
	<style>
div.container a {
	text-align: center;
	font-family: Arial;
	font-size: 22px;
	font-style: normal;
	font-weight: bold;
	text-decoration: underline;
	text-transform: none;
	color: #ff0000;
	margin-bottom: 20px;
}

div.container {
	margin: 0 auto;
	width: 200px;
}
</style>

	<div class="container">
		<img src="imgs/SinPermisos.png" class="text-center img-responsive"
			style="margin: auto;"> <a href="IniciarSesion.jsp">Inicie
			sesión para proceder.</a>

	</div>


</c:if>

<c:if test="${not empty userLogueado}">

	<div id="contenido" class="film backdropped logged-out backdrop-loaded"
		style="margin-top: 110px;">
		<div class="content-wrap">
			<div id="film-page-wrapper" class="cols-3 overflow">
				<div>


					<section class="film-recent-reviews">
						<section id="viewings-list">
							<h2 class="section-heading">Reseña</h2>


							<div class="film-detail-content" style="width: 80%;">
								<p class="film-detail-meta rating-green">
								<a class="avatar avatar-40"
									href="VerPerfilUsuario.jsp?id=${ReseniaComentarios.usuario.usuario}">
										<img src="${ReseniaComentarios.usuario.avatar}"
										alt="${ReseniaComentarios.usuario.usuario}" height="40" width="40">
								</a>
									<a
										href="VerPerfilUsuario.jsp?id=${ReseniaComentarios.usuario.usuario}"
										class="author"> ${ReseniaComentarios.usuario.usuario} </a>
								</p>
								<div class="text collapsible-text">
									<div class="collapsed-text">
										<p>${ReseniaComentarios.resenia}</p>
									</div>

								</div>
							</div>

						</section>

						</br>
						</br>
						</br>
						</br>
						</br>
						</br>
						</br>
						</br>
						</br>
						</br>
						</br>
						</br>
						</br>
						</br>
						<c:if test="${!empty userLogueado}">
							<div style="float: right;">
								<form action=Comentarios role="form"
									class="login form-horizontal" method="POST">


									<div class="form-group">
										<label class="control-label col-sm-2">Agregar nuevo
											comentario: </label>
										<div class="col-sm-10">
											<div>
												<div>
													<div>
														<textarea class="form-control" name="comentariotxt"
															cols="40" rows="5" required
															title="Comentario debe contener de 10 a 250 caracteres."
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
															id="btnAgregarComentario">Agregar Comentario</button>
													</div>
												</div>
											</div>
										</div>
									</div>

									<div class="${tipoMensaje}">
										<b>${mensajeResultado}</b>
									</div>

								</form>
								<div>
						</c:if>

						<ul class="posters posters-70">
							<c:forEach items="${Comentarios}" var="comentario">
								<li class="film-detail"><a class="avatar avatar-40"
									href="VerPerfilUsuario.jsp?id=${comentario.usuario.usuario}">
										<img src="${comentario.usuario.avatar}"
										alt="${comentario.usuario.usuario}" height="40" width="40">
								</a>
									<div class="film-detail-content">
										<p class="film-detail-meta rating-green">
											<a
												href="VerPerfilUsuario.jsp?id=${comentario.usuario.usuario}"
												class="author"> ${comentario.usuario.usuario} </a>
										</p>
										<div class="text collapsible-text">
											<div class="collapsed-text">
												<p>${comentario.comentario}</p>
											</div>

										</div>
									</div></li>

							</c:forEach>
						</ul>

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


<c:if test="${empty selectPelicula}">
	<c:redirect url="Error404.jsp" />
</c:if>


<jsp:include page="MasterPageFooter.jsp" />