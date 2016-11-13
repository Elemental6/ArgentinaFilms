<jsp:include page="MasterPageCabecera.jsp" />
    
<div class="contenido">
    <div class="login reg">
    
    
    <div class="alert alert-dismissable alert-success"><b>
     <input type="hidden" id="usuarioConfirmacion" name="usuarioConfirmacion" value="${usuarioConfirmacion}">
    
      Te registraste correctamente. Un email se ha enviado a tu dirección de correo electrónico ${emailConfirmacion} 
      con el código de activación que debés ingresar abajo para activar tu cuenta y así finalmente poder usarla.
     </b></div>
    
        <h1 class="text-center titulo-seccion"><img src="imgs/register.png" class="imagen-seccion" />CONFIRMAR REGISTRO</h1>

        <form action="javascript:ActivarCuenta();" role="form" class="login form-horizontal" method="POST"> 
        
        
            <div class="form-group"> 
                <label class="control-label col-sm-2">Email:</label>                 
                <div class="col-sm-10">
                    <div>
                        <div>
                            <div>
                                <input type="text" class="form-control" id="txtCodActivacion" placeholder="Ingrese el código de confirmación" maxlength=15 required>
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
                                <button type="submit" class="btn btn-success" id="btnRegistrar">Enviar mail</button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>    
            
                     
        </form>
    </div>
</div>

<jsp:include page="MasterPageFooter.jsp" />