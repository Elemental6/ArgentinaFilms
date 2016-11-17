<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE HTML>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="MasterPageCabecera.jsp" />
<script type="text/javascript" src="js/ModificarPelicula.js"></script>
<link href="css/select2.min.css" rel="stylesheet">

<link rel="stylesheet"
	href="css/bootstrap.min1.css">

<c:if test="${not empty userLogueado}">
	<div class="contenido">
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
		



			<div class="login reg">
				<h1 class="text-center titulo-seccion">
					<img src="imgs/register.png" class="imagen-seccion" />Modificar
					Pelicula
				</h1>

				<div class="${tipoMensaje}">
					<b>${mensajeResultado}</b>
				</div>

				<form action="ServletActualizarPelicula" role="form"
					class="login form-horizontal" method="POST" enctype="multipart/form-data">
<input type="hidden" class="form-control" name="id_pelicula_modificar"
											id="id_pelicula_modificar" >


					<div class="form-group">
						<label class="control-label col-sm-2">Nombre:</label>
						<div class="col-sm-10">
							<div>
								<div>
									<div>

										<input type="text" class="form-control" name="txtnombre"
											id="txtnombre" placeholder="Ingrese el nombre de la película"
											pattern=".{1,250}" required
											title="Nombre de la pelicula debe contener de 1 a 250 caracteres.">

									</div>
								</div>
							</div>
						</div>
					</div>
				

					<div class="form-group">
						<label class="control-label col-sm-2">Póster <a
							id=cancelarAvatar style="display: none;"
							onclick="cancelarAvatar()">(X)</a>:
						</label>
						<div class="col-sm-10">
							<div>
								<div>
									<div>
										<div class="bootstrap-filestyle input-group"
											style="width: 100%;">
											<span class="btn btn-default btn-file"
												style="width: 100%; cursor: default;"> <input
												type="file" name="file" accept="image/*" id="menu_images" />

											</span>


										</div>
									</div>
								</div>
							</div>
						</div>
					</div>

					<div class="form-group">
						<label class="control-label col-sm-2">Duración (Min):</label>
						<div class="col-sm-10">
							<div>
								<div>
									<div>

										<input type="number" min="10" max="350"
											class="form-control login" id="txtDuracion"
											name="txtDuracion" placeholder="Ingrese la duracíon" required>



									</div>
								</div>
							</div>
						</div>
					</div>

					<div class="form-group">
						<label class="control-label col-sm-2">Trailer:</label>
						<div class="col-sm-10">
							<div>
								<div>
									<div>
										<input type="text" class="form-control login" pattern=".{11,}"
											MAXLENGTH="11" name="txtTrailer" id="txtTrailer"
											placeholder="Ingrese el codigo de Youtube de 11 caracteres">
									</div>
								</div>
							</div>
						</div>
					</div>

					<div class="form-group">
						<label class="control-label col-sm-2">Director:</label>
						<div class="col-sm-10">
							<div>
								<div>
									<div>
										<select class="form-control" name="txtdirector"
											id="completarDirectores">

										</select>
									</div>
								</div>
							</div>
						</div>
					</div>

					<div class="form-group">
						<label class="control-label col-sm-2">Género:</label>
						<div class="col-sm-10">
							<div>
								<div class="select-field">
									<select class="form-control" name="txtGenero"
										id="completarGeneros" required>

									</select>

								</div>
							</div>
						</div>
					</div>

					<div class="form-group">
						<label class="control-label col-sm-2">Sinopsis:</label>
						<div class="col-sm-10">
							<div>
								<div>
									<div>

										<textarea class="form-control note-editor" rows="5"
											id="txtAreaSynospsis" name="txtAreaSynospsis" MAXLENGTH="254"></textarea>



									</div>
								</div>
							</div>
						</div>

					</div>

					<div class="form-group">
						<label class="control-label col-sm-2">Año:</label>
						<div class="col-sm-10">
							<div>
								<div>
									<div>
										<select class="form-control login" name="txtanio" id="txtanio"
											required>
											<option value="">Seleccione un año</option>
											<script>
												var myDate = new Date();
												var year = myDate.getFullYear();
												for (var i = 1900; i < year + 1; i++) {
													document
															.write('<option value="'+i+'">'
																	+ i
																	+ '</option>');
												}
											</script>
										</select>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-2">Actores:</label>
						<div class="col-sm-6">

							<div class="select-field">
								<select class="form-control" name="txtactor"
									id="completarActores">

								</select>
							</div>
						</div>
						<div class="col-sm-2">



							<label id="lblActores">Agregar</label>
						</div>
						<div class="col-sm-2">
							<label id="lblActoresEliminar">Eliminar</label>

						</div>



					</div>

					<div class="form-group">
						<input id="lblActoresIds" hidden="true" name="actoresIdS"></input>
						<div class="col-sm-offset-2 col-sm10">

							<ul class="list-group" id="ListActoresAgregados">

							</ul>
						</div>
					</div>
					<div class="form-group">
						<div class="col-sm-offset-2 col-sm-10">
							<div>
								<div>
									<div>
										<button type="submit" class="btn btn-success" id="btnAgregar">Modificar
											Película</button>
									</div>

								</div>
							</div>
						</div>
					</div>
				</form>
			</div>
		</c:if>
	</div>
</c:if>
<c:if test="${empty userLogueado}">
	<div class="container left-addon inner-addon">
		<img src="imgs/SinPermisos.png" class="text-center img-responsive"
			width="10px%" style="margin: auto;"> <br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<h1 class="text-center">
			Debe iniciar sesion en la página para poder agregar una película.<br>
			<br>
		</h1>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
	</div>
</c:if>
<script type="text/javascript" src="js/select2.min.js"></script>

<script>
	$('select').select2();
</script>
<style type="text/css">
<!--
body {
	font-size: 62.5%;
	background: #424242;
}

.select2-container {
	font-size: small;
}
-->
</style>
<jsp:include page="MasterPageFooter.jsp" />
