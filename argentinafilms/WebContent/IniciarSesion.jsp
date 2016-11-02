<jsp:include page="MasterPageCabecera.jsp" />
    
<div class="contenido">
    <div class="login">
        <h1 class="text-center titulo-seccion"><img src="imgs/login.png" class="imagen-seccion" />INICIAR SESIÓN</h1>
        
        <div class="${tipoMensaje}"><b>${mensajeResultado}</b></div>
        
        <form role="form" class="login form-horizontal" action="Loguear" method="POST"> 
        
            <div class="form-group"> 
                <label class="control-label col-sm-2">Nombre de usuario:</label>                 
                <div class="col-sm-10">
                    <div>
                        <div>
                            <div>
                                <input type="text" class="form-control" name="txtNombreUsuario" placeholder="Ingrese su nombre de usuario" maxlength=15 required>
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
                                <input type="password" class="form-control login" name="txtPass" placeholder="Ingrese su contraseña" maxlength=15 required>
                            </div>
                        </div>
                    </div>
                </div>                 
            </div>             
            <div class="form-group"> 
</div>             
            <div class="form-group">
</div>             
            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                    <div>
                        <div>
                            <div>
                                <button type="submit" class="btn btn-success" id="btnIngresar" style="margin-top: -30px;">Ingresar</button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>             
        </form>
    </div>
</div>

<jsp:include page="MasterPageFooter.jsp" />