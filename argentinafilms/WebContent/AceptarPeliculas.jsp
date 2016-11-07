<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:import url="/ListarPeticionesPeliculas" /> <!-- llamo servlet al cargar pagina -->

<jsp:include page="MasterPageCabecera.jsp" />
    
   
<div class="contenido">

<div class="login">

		<table class="table"> 
		    <thead> 
		        <tr> 
		            <th>Título</th> 
		            <th>Año</th> 
		            <th>Duración (minutos)</th> 
		            <th>Usuario</th>
		        </tr>         
		    </thead>     
		
		    <tbody>
		    
		   		 <c:if test="${peticionesPeliculas.size() == 0 || peticionesPeliculas == null}">
					<tr><td colspan="5" align="center">No hay peticiones de películas.</td></tr>
				</c:if>
		    
				<c:forEach items="${peticionesPeliculas}" var="peticionPelicula">
						<tr>
						<td>${peticionPelicula.nombre}</td>
						<td>${peticionPelicula.anio}</td>
						<td>${peticionPelicula.duracion}</td>
						<td>${peticionPelicula.usuario.usuario}</td>
						<td><button>Aceptar</button></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>

</div>

</div>

<jsp:include page="MasterPageFooter.jsp" />