<jsp:include page="MasterPageCabecera.jsp" />
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
    
    
<div class="contenido">

<c:if test="${userLogueado.rango != 'admin'}" >
	<div class="container left-addon inner-addon">
		<img src="imgs/SinPermisos.png" class="text-center img-responsive" width="10px%" style="margin:auto;">
		<br>
        <h1 class="text-center">Usted no tiene permisos para estar acá.<br><br></h1>  
    </div>
</c:if>  


<c:if test="${userLogueado.rango == 'admin'}" >

        <div class="row text-center">
        
          <div class="col-md-6" onclick="location.href='CantidadVisitas.jsp';"  style="cursor:pointer;">
            <img src="imgs/cantVisitas.png" class="img-responsive img-thumbnail">
            <h1 class="text-primary">CANTIDAD DE VISITAS</h1>
            <p></p>
            <p></p>
          </div>
          
          <div class="col-md-6" onclick="location.href='MasActivos.jsp';" style="cursor:pointer;">
            <img src="imgs/actividadUsuarios.png" class="img-responsive img-thumbnail">
            <h1 class="text-primary">USUARIOS MÁS ACTIVOS</h1>
            <p></p>
            <p></p>
          </div>
          
        </div>
        
        <div class="row text-center">
        
          <div class="col-md-12" onclick="location.href='MasReseniadas.jsp';"  style="cursor:pointer;">
            <img src="imgs/Banear.png" class="img-responsive img-thumbnail">
            <h1 class="text-primary">PELÍCULAS MÁS RESEÑADAS</h1>
            <p></p>
            <p></p>
          </div>
 
        </div>
        
 </c:if>  


</div>

<jsp:include page="MasterPageFooter.jsp" />