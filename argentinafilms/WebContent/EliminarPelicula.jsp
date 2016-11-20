<jsp:include page="MasterPageCabecera.jsp" />
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<c:import url="/ListarPeliculasEliminar" /> <!-- llamo servlet al cargar pagina -->
    
<div class="contenido">

<c:if test="${userLogueado.rango != 'admin' && userLogueado.rango != 'moderador'}" >
	<div class="container left-addon inner-addon">
		<img src="imgs/SinPermisos.png" class="text-center img-responsive" width="10px%" style="margin:auto;">
		<br>
        <h1 class="text-center">Usted no tiene permisos para estar acá.<br><br></h1>  
    </div>
</c:if>  
    
    
    
<c:if test="${userLogueado.rango == 'admin' || userLogueado.rango == 'moderador'}">

 	
	<div class="login">
		<h1 class="text-center titulo-seccion"><img src="imgs/BorrarPelicula.png" class="imagen-seccion" />ELIMINAR PELICULA</h1>
	</div>

	<div class="${tipoMensaje}"><b>${mensajeResultado}</b></div>


		<table class="table" style="font-color: yellow!important; font-size: 14px!important; width: 900px!important; margin: auto;"> 
		    <thead> 
		        <tr> 
		            <th>Nombre</th> 
		            <th>Anio</th> 
		            <th>Duracion</th> 	
		            <th>Eliminar</th> 	           
		        </tr>         
		    </thead>     
		
		    <tbody>
		    
		   		 <c:if test="${PeliculasEliminar.size() == 0 || PeliculasEliminar == null}">
					<tr><td colspan="4" align="center">No existen peliculas activas</td></tr>
				</c:if>
		    
				<c:forEach items="${PeliculasEliminar}" var="pelicula">
			
				<form action="EliminarPelicula" method="GET" id="filaPelicula">

				
				<input name="peliculaSeleccionada" value="${pelicula.id_pelicula}" type="hidden"></input>
				<input name="pagActual" value="${paginaActual}" type="hidden"></input>
				
						<tr>
						<td>${pelicula.nombre}</td>
						<td>${pelicula.anio}</td>
						<td>${pelicula.duracion}</td>		

						                    	
                    	<td><button type="submit" class="btn btn-danger btn-sm" style="margin: auto!important" onclick="return confirm('Esta seguro?');">Eliminar</button></td>
						</tr>
					
				</form>
				
				</c:forEach>
			</tbody>
		</table>


	<div class="paginado" align="center">


		<ul class="pagination lead" data-pg-collapsed> 
		<c:if test="${paginaActual != 1}">
		    <li>
		        <a href="EliminarPelicula.jsp?pagina=1">&laquo;</a>
		    </li>    
		 </c:if>   
		     
		     
		 <c:forEach begin="1" end="${cantPaginas}" var="i">    


		    <li <c:if test="${paginaActual == i}">class="active"</c:if>>
		        <a href="EliminarPelicula.jsp?pagina=${i}">${i}</a>
		    </li>     

		   </c:forEach> 
		    
		    <c:if test="${paginaActual lt cantPaginas}">
		    <li>
		        <a href="EliminarPelicula.jsp?pagina=${cantPaginas}">&raquo;</a>
		    </li>     
		    </c:if>
		</ul>


	</div>
  
  <hr>
  
       
  <div align=center style="width: 100%; margin:auto;">
        	<a href="Administrar.jsp" class="btn btn-primary">Volver</a>
        </div> 
              
        
 </c:if>       
        
</div>
    



<jsp:include page="MasterPageFooter.jsp" />