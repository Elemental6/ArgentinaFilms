<jsp:include page="MasterPageCabecera.jsp" />
    
<div class="contenido">
    <div class="login">
        <h1 class="text-center titulo-seccion"><img src="imgs/login.png" class="imagen-seccion" />INICIAR SESIÓN</h1>
        <form role="form" class="login form-horizontal"> 
            <div class="form-group"> 
                <label class="control-label col-sm-2" for="lblNombreUsuario">Nombre de usuario:</label>                 
                <div class="col-sm-10">
                    <div>
                        <div>
                            <div>
                                <input type="text" class="form-control" id="txtNombreUsuario" placeholder="Ingrese su nombre de usuario" required>
                            </div>
                        </div>
                    </div>
                </div>                 
            </div>             
            <div class="form-group"> 
                <label class="control-label col-sm-2" for="lblPass">Contraseña:</label>                 
                <div class="col-sm-10">
                    <div>
                        <div>
                            <div>
                                <input type="password" class="form-control login" id="txtPass" placeholder="Ingrese su contraseña" required>
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