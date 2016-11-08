<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<jsp:include page="MasterPageCabecera.jsp" />
    
<div class="contenido">

<c:if test="${userLogueado.rango != 'admin' && userLogueado.rango != 'moderador'}" >
	<div class="container left-addon inner-addon">
		<img src="imgs/SinPermisos.png" class="text-center img-responsive" width="10px%" style="margin:auto;">
		<br>
        <h1 class="text-center">Usted no tiene permisos para estar acá.<br><br></h1>  
    </div>
</c:if>  


</div>

<jsp:include page="MasterPageFooter.jsp" />