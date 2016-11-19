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


<div class="login">
		<h1 class="text-center titulo-seccion">INFORMES</h1>
</div>
<hr>
<div class="row text-center" style="width=100%;margin:auto;">
        
        

          <div class="col-md-4" onclick="location.href='CantidadVisitas.jsp';"  style="cursor:pointer;">
            <img src="imgs/cantVisitas.png" class="img-responsive img-thumbnail" style="width:140px;">
            <h1 class="text-primary">CANTIDAD DE VISITAS</h1>
            <p></p>
            <p></p>
          </div>
          <!-- MasActivos.jsp -->
          <div class="col-md-4" onclick="location.href='MasActivos.jsp';" style="cursor:pointer;">
            <img src="imgs/actividadUsuarios.png" class="img-responsive img-thumbnail" style="width:140px;">
            <h1 class="text-primary">USUARIOS MÁS ACTIVOS</h1>
            <p></p>
            <p></p>
          </div>
          <!--MasReseniadas  -->
          <div class="col-md-4 pull right" onclick="location.href='MasReseniadas.jsp';" style="cursor:pointer;">
            <img src="imgs/masreseniadas.png" class="img-responsive img-thumbnail" style="width:140px;">
            <h1 class="text-primary">PELÍCULAS MÁS RESEÑADAS</h1>
            <p></p>
            <p></p>
          </div>
          
          
          
 

        
</div>
   <hr>
   <div align=center style="width: 100%; margin:auto;">
        	<a href="Administrar.jsp" class="btn btn-primary">Volver</a>
        </div> 
    
 </c:if>  


</div>

<jsp:include page="MasterPageFooter.jsp" />