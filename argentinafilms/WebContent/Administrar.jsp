<jsp:include page="MasterPageCabecera.jsp" />
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
    
<div class="contenido">


<c:if test="${userLogueado.rango != 'moderador' && userLogueado.rango != 'admin'}" >
	<div class="container left-addon inner-addon">
		<img src="imgs/SinPermisos.png" class="text-center img-responsive" width="10px%" style="margin:auto;">
		<br>
        <h1 class="text-center">Usted no tiene permisos para estar ac�.<br><br></h1>  
    </div>
</c:if>  



<c:if test="${userLogueado.rango == 'moderador' || userLogueado.rango== 'admin'}" >


 <div class="row text-center" style="margin-top: -50px;">
            <div class="col-md-4" onclick="location.href='AceptarPeliculas.jsp';"  style="cursor:pointer;">
            <img src="imgs/AceptarPeliculas.png" class="img-responsive img-thumbnail">
            <h1 class="text-primary">ACEPTAR PETICIONES PEL�CULAS</h1>
            <p></p>
            <p></p>
          </div>
          
          <div class="col-md-4" onclick="location.href='AceptarActores.jsp';" style="cursor:pointer;">
            <img src="imgs/AceptarActores.png" class="img-responsive img-thumbnail">
            <h1 class="text-primary">ACEPTAR PETICIONES ACTORES</h1>
            <p></p>
            <p></p>
          </div>
          
            <div class="col-md-4" onclick="location.href='AceptarDirectores.jsp';"  style="cursor:pointer;">
            <img src="imgs/accept-dir.png" class="img-responsive img-thumbnail"  style="width:138px;height:138px;">
            <h1 class="text-primary">ACEPTAR PETICIONES DIRECTORES</h1>
            <p></p>
            <p></p>
          </div>

  </div>
        
  <div class="row text-center">
            
          
           <div class="col-md-4" onclick="location.href='EliminarPelicula.jsp';"  style="cursor:pointer;">
            <img src="imgs/BorrarPelicula.png" class="img-responsive img-thumbnail" style="width:138px;height:138px;">
            <h1 class="text-primary">ELIMINAR PELICULA</h1>
           
           </div>
           
 		 <div class="col-md-4" onclick="location.href='EliminarComentario.jsp';"  style="cursor:pointer;">
            <img src="imgs/BorrarComentario.png" class="img-responsive img-thumbnail" style="width:138px;height:138px;">
            <h1 class="text-primary">ELIMINAR COMENTARIO</h1>
          
          </div>
            
            
            <div class="col-md-4" onclick="location.href='DarDeBajaUsuario.jsp';"  style="cursor:pointer;">
            <img src="imgs/Banear.png" class="img-responsive img-thumbnail" >
            <h1 class="text-primary">DAR DE BAJA USUARIO</h1>
            <p></p>
            <p></p>
            
        </div>



 <c:if test="${userLogueado.rango == 'admin'}" >  

		<div class="col-md-4" onclick="location.href='CambiarRangoUsuario.jsp';"  style="cursor:pointer;">
            <img src="imgs/CambiarRango.png" class="img-responsive img-thumbnail">
            <h1 class="text-primary">CAMBIAR RANGO A USUARIO</h1>
            <p></p>
            <p></p>
          </div>

        <div class="col-md-4" onclick="location.href='CambiarRangoUsuario.jsp';"  style="cursor:pointer;">

          </div>
        

           <div class="col-md-4" onclick="location.href='ListarInformes.jsp';" style="cursor:pointer;">
            <img src="imgs/Informes.png" class="img-responsive img-thumbnail">
            <h1 class="text-primary">LISTAR INFORMES</h1>
            <p></p>
            <p></p>
          </div>
          

 </c:if>   
  </div>      
 </c:if>  
        
        
        
        
     
        
        
 
          
 
</div>

<jsp:include page="MasterPageFooter.jsp" />