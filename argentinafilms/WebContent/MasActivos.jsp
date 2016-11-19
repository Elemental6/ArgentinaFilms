 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:import url="/ListarDiezUsuariosMasActivos" /> <!-- llamo servlet al cargar pagina -->

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
		<h1 class="text-center titulo-seccion"><img src="imgs/actividadUsuarios.png" class="imagen-seccion" style="margin-top: -50px!important;"/>10 USUARIOS MÁS ACTIVOS</h1>
	</div>

		<table class="table" style="width: 900px!important; margin: auto;" id="peliculas-peticiones"> 
		    <thead> 
		        <tr> 
		            <th>Usuario</th> 
		            <th>Email</th> 
		            <th>Cantidad de reseñas</th> 
		            <th>Cantidad de comentarios</th>
		            <th>Cantidad de puntuadas</th>
		            <th>Total actividades</th>
		        </tr>         
		    </thead>     
		
		    <tbody>
		    
		   		 <c:if test="${diezUsuariosMasActivos.size() == 0 || diezUsuariosMasActivos == null}">
					<tr><td colspan="5" align="center">No hay usuarios activos.</td></tr>
				</c:if>
		    
				<c:forEach items="${diezUsuariosMasActivos}" var="usuario">
						<tr>
						<td>${usuario.usuario.usuario}</td>
						<td>${usuario.usuario.email}</td>
						<td>${usuario.cant_resenias}</td>
						<td>${usuario.cant_comentarios}</td>
						<td>${usuario.cant_puntuadas}</td>
						<td>${usuario.total_actividad}</td>
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