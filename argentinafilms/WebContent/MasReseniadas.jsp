<%-- <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:import url="/ListarPeliculasMasReseniadas" /> <!-- llamo servlet al cargar pagina -->

<jsp:include page="MasterPageCabecera.jsp" />
    
   
<div class="contenido">


<c:if test="${userLogueado.rango != 'admin'}" >
	<div class="container left-addon inner-addon">
		<img src="imgs/SinPermisos.png" class="text-center img-responsive" width="10px%" style="margin:auto;">
		<br>
        <h1 class="text-center">Usted no tiene permisos para estar acá.<br><br></h1>  
    </div>
</c:if>  



<c:if test="${userLogueado.rango == 'admin'}">
	
	<div class="login">
		<h1 class="text-center titulo-seccion"><img src="imgs/AceptarPeliculas.png" class="imagen-seccion" style="margin-top: -50px!important;"/>ACEPTAR PELÍCULAS</h1>
	</div>

		<table class="table" style="width: 900px!important; margin: auto;" id="peliculas-peticiones"> 
		    <thead> 
		        <tr> 
		            <th>Título</th> 
		            <th>Año</th> 
		            <th>Duración (minutos)</th> 
		            <th>Cantidad de reseñas</th>
		        </tr>         
		    </thead>     
		
		    <tbody>
		    
		   		 <c:if test="${peliculasMasReseniadas.size() == 0 || peliculasMasReseniadas == null}">
					<tr><td colspan="5" align="center">No hay películas.</td></tr>
				</c:if>
		    
				<c:forEach items="${peliculasMasReseniadas}" var="pelicula">
						<tr>
						<td>${pelicula.nombre}</td>
						<td>${peticionPelicula.anio}</td>
						<td>${peticionPelicula.duracion}</td>
						<td>${pelicula.resenias.size()}</td>
						<td style="width:200px!important">
						</tr>
				</c:forEach>
			</tbody>
		</table>


	<div class="paginado" align="center">


		<ul class="pagination lead" data-pg-collapsed> 
		<c:if test="${paginaActual != 1}">
		    <li>
		        <a href="AceptarPeliculas.jsp?pagina=1">&laquo;</a>
		    </li>    
		 </c:if>   
		     
		     
		 <c:forEach begin="1" end="${cantPaginas}" var="i">    


		    <li <c:if test="${paginaActual == i}">class="active"</c:if>>
		        <a href="AceptarPeliculas.jsp?pagina=${i}">${i}</a>
		    </li>     

		   </c:forEach> 
		    
		    <c:if test="${paginaActual lt cantPaginas}">
		    <li>
		        <a href="AceptarPeliculas.jsp?pagina=${cantPaginas}">&raquo;</a>
		    </li>     
		    </c:if>
		</ul>


	</div>


<div align=center style="width: 100%; margin:auto;">
        	<a href="Administrar.jsp" class="btn btn-primary">Volver</a>
        </div> 

 </c:if>  

</div>


<jsp:include page="MasterPageFooter.jsp" /> --%>