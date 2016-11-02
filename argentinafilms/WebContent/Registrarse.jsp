<jsp:include page="MasterPageCabecera.jsp" />
    
<div class="contenido">
    <div class="login reg">
        <h1 class="text-center titulo-seccion"><img src="imgs/register.png" class="imagen-seccion" />REGISTRARSE</h1>
        
        <div class="${tipoMensaje}"><b>${mensajeResultado}</b></div>
        
        <form action="RegistrarUsuario" role="form" class="login form-horizontal" method="POST"> 
        
        
            <div class="form-group"> 
                <label class="control-label col-sm-2">Id de usuario:</label>                 
                <div class="col-sm-10">
                    <div>
                        <div>
                            <div>
                                <input type="text" class="form-control" name="txtId" placeholder="Ingrese su nombre de usuario" required>
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
                                <input type="password" class="form-control login" name="txtPass1" placeholder="Ingrese su contraseña" required>
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
                                <input type="password" class="form-control login" name="txtPass2" placeholder="Repita su contraseña" required>
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
                                <input type="email" class="form-control login" name="txtEmail" placeholder="Ingrese su correo electrónico" required>
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
                                <input type="text" class="form-control login" name="txtNombre" placeholder="Ingrese su nombre real" required>
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
                                <input type="text" class="form-control login" name="txtApellido" placeholder="Ingrese su apellido real" required>
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