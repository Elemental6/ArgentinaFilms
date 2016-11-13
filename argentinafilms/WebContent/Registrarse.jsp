<jsp:include page="MasterPageCabecera.jsp" />

<div class="contenido">
	<div class="login reg">
		<h1 class="text-center titulo-seccion">
			<img src="imgs/register.png" class="imagen-seccion" />REGISTRARSE
		</h1>

		<div class="${tipoMensaje}">
		${Mensajedismisable}
		<b>${mensajeResultado}</b>
		</div>

		<form action="RegistrarUsuario" role="form"
			class="login form-horizontal" method="POST"
			enctype="multipart/form-data">


			<div class="form-group">
				<label class="control-label col-sm-2">Id de usuario:</label>
				<div class="col-sm-10">
					<div>
						<div>
							<div>
								<input type="text" class="form-control" name="txtId"
									placeholder="Ingrese su nombre de usuario" pattern=".{4,10}" required title="Usuario debe contener de 4 a 10 caracteres." maxlength="10">
							</div>
						</div>
					</div>
				</div>
			</div>

			<div class="form-group">
				<label class="control-label col-sm-2">Contraseña:</label>
				<div class="col-sm-10">
					<div>
						<div>
							<div>
								<input type="password" class="form-control login"
									name="txtPass1" placeholder="Ingrese su contraseña" pattern=".{8,20}" required title="Password debe contener de 8 a 20 caracteres." maxlength="20">
							</div>
						</div>
					</div>
				</div>
			</div>

			<div class="form-group">
				<label class="control-label col-sm-2">Repetir contraseña:</label>
				<div class="col-sm-10">
					<div>
						<div>
							<div>
								<input type="password" class="form-control login"
									name="txtPass2" placeholder="Repita su contraseña" pattern=".{8,20}" required title="Password debe contener de 8 a 20 caracteres." maxlength="20">
							</div>
						</div>
					</div>
				</div>
			</div>


			<div class="form-group">
				<label class="control-label col-sm-2">E-mail:</label>
				<div class="col-sm-10">
					<div>
						<div>
							<div>
								<input type="email" class="form-control login" name="txtEmail"
									placeholder="Ingrese su correo electrónico" required>
							</div>
						</div>
					</div>
				</div>
			</div>

			<div class="form-group">
				<label class="control-label col-sm-2">Nombre:</label>
				<div class="col-sm-10">
					<div>
						<div>
							<div>
								<input type="text" class="form-control login" name="txtNombre"
									placeholder="Ingrese su nombre real" pattern=".{2,100}" required title="Nombre debe contener de 2 a 100 caracteres." maxlength="100" >
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
								<input type="text" class="form-control login" name="txtApellido"
									placeholder="Ingrese su apellido real" pattern=".{2,100}" required title="Apellido debe contener de 2 a 100 caracteres." maxlength="100">
							</div>
						</div>
					</div>
				</div>
			</div>

			<div class="form-group">
				<label class="control-label col-sm-2">Avatar:</label>
				<div class="col-sm-10">
					<div>
						<div>
							<div>
								<input type="file" name="file" accept="image/*" />
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
								<button type="submit" class="btn btn-success" id="btnRegistrar">Registrarme</button>
							</div>
						</div>
					</div>
				</div>
			</div>


		</form>
	</div>
</div>

<jsp:include page="MasterPageFooter.jsp" />