<jsp:include page="MasterPageCabecera.jsp" />
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div class="contenido">
	<div class="login reg">

		
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
				<img src="imgs/SinPermisos.png" class="text-center img-responsive"  style="margin:auto;">
				<a href="IniciarSesion.jsp">Inicie sesión para proceder.</a>

			</div>


		</c:if>

		<c:if test="${not empty userLogueado}">
			<h1 class="text-center titulo-seccion">
				<img src="imgs/RegistrarActor.png" class="imagen-seccion" />Registrar
				Actor
			</h1>
			<div class="${tipoMensaje}">
				<b>${mensajeResultado}</b>
			</div>

			<form action="ServletRegistrarActor" role="form"
				class="login form-horizontal" method="POST">


				<div class="form-group">
					<label class="control-label col-sm-2">Nombre: </label>
					<div class="col-sm-10">
						<div>
							<div>
								<div>
									<input type="text" class="form-control" name="actor_nombre"
										placeholder="Ingrese nombre del actor" pattern=".{2,100}"
										required title="Nombre debe contener de 2 a 100 caracteres."
										maxlength="100">
								</div>
							</div>
						</div>
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-sm-2">Apellido:</label>
					<div class="col-sm-10">
						<div>
							<div>
								<div>
									<input type="text" class="form-control login"
										name="actor_apellido" placeholder="Ingrese apellido del actor"
										pattern=".{2,100}" required
										title="Apellido debe contener de 2 a 100 caracteres."
										maxlength="100">
								</div>
							</div>
						</div>
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-sm-2">Edad:</label>
					<div class="col-sm-10">
						<div>
							<div>
								<div>
									<input type="number" class="form-control login"
										placeholder="Ingrese edad del actor" name="actor_edad" min="1"
										max="120" required>

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
										id="btnAgregarActor">Agregar actor</button>
								</div>
							</div>
						</div>
					</div>
				</div>


			</form>
	</div>




	</c:if>


</div>

<jsp:include page="MasterPageFooter.jsp" />