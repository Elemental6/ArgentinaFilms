<jsp:include page="MasterPageCabecera.jsp" />
        <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
        
      
      
      
     

      
      
      
      
      
<div class="contenido" >  
     
      <c:if test="${empty userLogueado}">
			<style>
					div.container a {
						text-align: center;
						font-family: Arial;
						font-size: 22px;
						font-style: normal;
						font-weight: bold;
						text-decoration: underline;
						text-transform: none;
						color: #ff0000;
						margin-bottom: 20px;
					}
					
					div.container {
						margin: 0 auto;
						width: 200px;
					}
		</style>

			<div class="container">
				<img src="imgs/SinPermisos.png" class="text-center img-responsive"  style="margin:auto;">
				<a href="IniciarSesion.jsp">Inicie sesión para proceder.</a>

			</div>


		</c:if>
<c:if test="${not empty userLogueado}">
      
    <div class="login reg" style="margin: auto;
    width: 30%; margin-top:100px;">
        <h1 class="text-center titulo-seccion"><img src="imgs/RegistrarActor.png" class="imagen-seccion" />Asociar Actor</h1>
        
        <div class="${tipoMensaje}"><b>${mensajeResultado}</b></div>
        
        <form action="ServletAsociarPeliculaXActor" role="form" class="login form-horizontal" method="POST"> 
        
          <h2 class="text-center titulo-seccion">Actor</h2>
        
        <select name="AsociarActor" size="0" style="width: 50%;color:black; 
    margin: auto; margin-left:120px">
						<c:if test="${ActoresAsociar != null}">
							<c:forEach items="${ActoresAsociar}" var="Actor">
			
								<option
									value="${Actor.id_actor} - ${Actor.nombre} - ${Actor.apellido} - ${Actor.edad} - ${Actor.estado}">
									${Actor.nombre} - ${Actor.apellido}</option>
							</c:forEach>
						</c:if>
					</select>
        </br></br>
        
           <h2 class="text-center titulo-seccion">Pelicula</h2>
			   <select name="AsociarPelicula" size="0" style="width: 50%;color:black; 
    margin: auto; margin-left:120px">
			 <c:if test="${PeliculasAsociar != null}">
							<c:forEach items="${PeliculasAsociar}" var="Pelicula">
			
								<option
									value="${Pelicula.id_pelicula} - ${Pelicula.nombre} - ${Pelicula.anio} - ${Pelicula.ubicacion} - ${Pelicula.duracion} - ${Pelicula.synopsis}- ${Pelicula.puntuacion_total}- ${Pelicula.poster}- ${Pelicula.trailer} - ${Pelicula.estado}">
									${Pelicula.nombre} - ${Pelicula.anio}</option>
							</c:forEach>
						</c:if>
					</select>
        </br></br> </br></br> </br>
            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                    <div>
                        <div>
                            <div>
                                <button type="submit" class="btn btn-success" id="btnAgregarActor" style ="margin-left:80px;">Asociar actor con pelicula</button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>    
            
                     
        </form>
    </div>
</div>
</c:if>
<jsp:include page="MasterPageFooter.jsp" />