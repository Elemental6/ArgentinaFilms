<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:import url="/ListarPeticionesPeliculas" /> <!-- llamo servlet al cargar pagina -->

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
		<h1 class="text-center titulo-seccion"><img src="imgs/cantVisitas.png" class="imagen-seccion" />CANTIDAD DE VISITAS</h1>
	</div>



		<div class="container-fluid">
	<div class="panel panel-default">
            <div class="panel-heading">
              <h3 class="panel-title">Películas más visitadas</h3>
            </div>
	<div class="row">
		<div class="col-md-1">
		</div>
		<div class="col-md-10">
			<table class="table">
				<thead>
					<tr>
						<th>
							Película
						</th>
						<th>
							Usuario
						</th>
						
						<th>
							Puntuación
						</th>
						<th>
							Cantidad de visitas
						</th>
						
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>
							"${pelicula.nombre }"
						</td>
						<td>
							"${pelicula.usuario.usuario }"
						</td>
						
						<td>
							"${pelicula.usuario.puntuacion_total }"
						</td>
						<td>
							2000
						</td>
						
					</tr>
					
				</tbody>
			</table>
		</div>
		<div class="col-md-1">
		</div>
	</div>
</div>
</div>


	<div class="container-fluid">
	<div class="panel panel-default">
            <div class="panel-heading">
              <h3 class="panel-title">Actores más visitados</h3>
            </div>
	<div class="row">
		<div class="col-md-1">
		</div>
		<div class="col-md-10">
			<table class="table">
				<thead>
					<tr>
						<th>
							Actor
						</th>
						<th>
							Participación en Peliculas
						</th>
						<th>
							Cantidad de visitas
						</th>
						
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>
							"${actor.nombre + " " + actor.apellido}"
						</td>
						<td>
							15 peliculas
						</td>
						
						<td>
							100
						</td>
												
					</tr>
	
				</tbody>
			</table>
		</div>
		<div class="col-md-1">
		</div>
	</div>
</div>
</div>



	<div class="container-fluid">
	<div class="panel panel-default">
            <div class="panel-heading">
              <h3 class="panel-title">Secciones más visitadas</h3>
            </div>
	<div class="row">
		<div class="col-md-1">
		</div>
		<div class="col-md-10">
			<table class="table">
				<thead>
					<tr>
						<th>
							Nombre de la sección
						</th>
						<th>
							Cantidad de visitas
						</th>
						
						
						
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>
							Películas
						</td>
						<td>
							10000
						</td>
						
						
						
					</tr>
					<tr >
						<td>
							Actores
						</td>

						<td>
							3000
						</td>
					</tr>
					
					
				</tbody>
			</table>
		</div>
		<div class="col-md-1">
		</div>
	</div>
</div>
</div>

	


 </c:if>  

</div>


<jsp:include page="MasterPageFooter.jsp" />