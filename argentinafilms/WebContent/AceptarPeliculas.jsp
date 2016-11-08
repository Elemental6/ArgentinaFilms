<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:import url="/ListarPeticionesPeliculas" /> <!-- llamo servlet al cargar pagina -->

<jsp:include page="MasterPageCabecera.jsp" />
    
   
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
		<h1 class="text-center titulo-seccion"><img src="imgs/AceptarPeliculas.png" class="imagen-seccion" />ACEPTAR PELÍCULAS</h1>
	</div>

		<table class="table" style="font-color: yellow!important; font-size: 14px!important; width: 900px!important; margin: auto;"> 
		    <thead> 
		        <tr> 
		            <th>Título</th> 
		            <th>Año</th> 
		            <th>Duración (minutos)</th> 
		            <th>Usuario</th>
		            <th>Petición</th>
		        </tr>         
		    </thead>     
		
		    <tbody>
		    
		   		 <c:if test="${peticionesPeliculas.size() == 0 || peticionesPeliculas == null}">
					<tr><td colspan="5" align="center">No hay peticiones de películas.</td></tr>
				</c:if>
		    
				<c:forEach items="${peticionesPeliculas}" var="peticionPelicula">
						<tr id="fila${peticionPelicula.id_pelicula}">
						<td>${peticionPelicula.nombre}</td>
						<td>${peticionPelicula.anio}</td>
						<td>${peticionPelicula.duracion}</td>
						<td>${peticionPelicula.usuario.usuario}</td>
						<td style="width:200px!important">
                        <button type="button" onclick="javascript:AceptarPelicula(${peticionPelicula.id_pelicula});" class="btn btn-success btn-sm" style="margin: auto!important">Aceptar</button>                         
                        <button type="button" onclick="javascript:RechazarPelicula(${peticionPelicula.id_pelicula});" class="btn btn-danger btn-sm" style="margin: auto!important">Rechazar</button>
                    	</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>

 </c:if>  

</div>


<jsp:include page="MasterPageFooter.jsp" />