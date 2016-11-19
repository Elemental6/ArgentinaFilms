 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:import url="/ListarDiezPeliculasMasReseniadas" /> <!-- llamo servlet al cargar pagina -->

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
		<h1 class="text-center titulo-seccion"><img src="imgs/masreseniadas.png" class="imagen-seccion" style="margin-top: -50px!important;"/>10 PELÍCULAS MÁS RESEÑADAS</h1>
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
		    
		   		 <c:if test="${diezPeliculasMasReseniadas.size() == 0 || diezPeliculasMasReseniadas == null}">
					<tr><td colspan="5" align="center">No hay películas.</td></tr>
				</c:if>
		    
				<c:forEach items="${diezPeliculasMasReseniadas}" var="pelicula">
						<tr>
						<td>${pelicula.pelicula.nombre}</td>
						<td>${pelicula.pelicula.anio}</td>
						<td>${pelicula.pelicula.duracion}</td>
						<td>${pelicula.cant_resenias}</td>
						<td style="width:200px!important">
						</tr>
				</c:forEach>
			</tbody>
		</table>



<div align=center style="width: 100%; margin:auto;">
        	<a href="ListarInformes.jsp" class="btn btn-primary">Volver</a>
        </div> 

 </c:if>  

</div>


<jsp:include page="MasterPageFooter.jsp" /> 