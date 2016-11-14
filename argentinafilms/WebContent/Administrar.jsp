<jsp:include page="MasterPageCabecera.jsp" />
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
    
<div class="contenido">


<c:if test="${userLogueado.rango != 'moderador' && userLogueado.rango != 'admin'}" >
	<div class="container left-addon inner-addon">
		<img src="imgs/SinPermisos.png" class="text-center img-responsive" width="10px%" style="margin:auto;">
		<br>
        <h1 class="text-center">Usted no tiene permisos para estar acá.<br><br></h1>  
    </div>
</c:if>  



<c:if test="${userLogueado.rango == 'moderador' || userLogueado.rango== 'admin'}" >

        <div class="row text-center">
        
          <div class="col-md-6" onclick="location.href='AceptarPeliculas.jsp';"  style="cursor:pointer;">
            <img src="imgs/AceptarPeliculas.png" class="img-responsive img-thumbnail">
            <h1 class="text-primary">ACEPTAR PETICIONES PELÍCULAS</h1>
            <p></p>
            <p></p>
          </div>
          
          <div class="col-md-6" onclick="location.href='AceptarActores.jsp';" style="cursor:pointer;">
            <img src="imgs/AceptarActores.png" class="img-responsive img-thumbnail">
            <h1 class="text-primary">ACEPTAR PETICIONES ACTORES</h1>
            <p></p>
            <p></p>
          </div>
          
        </div>
        
        <div class="row text-center">
        
          <div class="col-md-12" onclick="location.href='BanearUsuario.jsp';"  style="cursor:pointer;">
            <img src="imgs/Banear.png" class="img-responsive img-thumbnail">
            <h1 class="text-primary">BANEAR USUARIO</h1>
            <p></p>
            <p></p>
          </div>
 
        </div>
        
 </c:if>  
        
        
        
        
 <c:if test="${userLogueado.rango == 'admin'}" >       
        
        <div class="row text-center">
        
          <div class="col-md-6" onclick="location.href='CambiarRangoUsuario.jsp';"  style="cursor:pointer;">
            <img src="imgs/CambiarRango.png" class="img-responsive img-thumbnail">
            <h1 class="text-primary">CAMBIAR RANGO A USUARIO</h1>
            <p></p>
            <p></p>
          </div>
          
           <div class="col-md-6" onclick="location.href='ListarInformes.jsp';" style="cursor:pointer;">
            <img src="imgs/Informes.png" class="img-responsive img-thumbnail">
            <h1 class="text-primary">LISTAR INFORMES</h1>
            <p></p>
            <p></p>
          </div>
          
        </div>
 
  </c:if>             
 
</div>

<jsp:include page="MasterPageFooter.jsp" />