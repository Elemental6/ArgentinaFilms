<jsp:include page="MasterPageCabecera.jsp" />
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
    
<div class="contenido">
    <div class="login">
    
    
<c:if test="${userLogueado.rango != 'admin' && userLogueado.rango != 'moderador'}" >
	<div class="container left-addon inner-addon">
		<img src="imgs/SinPermisos.png" class="text-center img-responsive" width="10px%" style="margin:auto;">
		<br>
        <h1 class="text-center">Usted no tiene permisos para estar acá.<br><br></h1>  
    </div>
</c:if>  
    
    
    
<c:if test="${userLogueado.rango == 'admin' || userLogueado.rango == 'moderador'}">
        <h1 class="text-center titulo-seccion"><img src="imgs/CambiarRango.png" class="imagen-seccion" />BANEAR USUARIO</h1>
        
        <div class="${tipoMensaje}"><b>${mensajeResultado}</b></div>
        
        <form role="form" class="login form-horizontal" action="BanearUsuario" method="POST"> 
        
            <div class="form-group"> 
                <label class="control-label col-sm-2">Nombre de usuario:</label>                 
                <div class="col-sm-10">
                    <div>
                        <div>
                            <div>
                                <input type="text" class="form-control" name="txtNombreUsuario" placeholder="Ingrese el nombre de usuario" maxlength=15 required>
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
                                <button type="submit" class="btn btn-danger" id="btnBanear">Banear definitivamente</button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>             
        </form>
        
 </c:if>       
        
</div>
    

    
</div>

<jsp:include page="MasterPageFooter.jsp" />