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
    <div class="login reg"  style="margin: auto;
    width: 30%; margin-top:100px;">
        <h1 class="text-center titulo-seccion"><img src="imgs/RegistrarDirector.png" class="imagen-seccion" />Asociar Director</h1>
        
        <div class="${tipoMensaje}"><b>${mensajeResultado}</b></div>
        
        <form action="ServletAsociarDirectorXPelicula" role="form" class="login form-horizontal" method="POST"> 
        
          <h2 class="text-center titulo-seccion">Director</h2>
        
        <select name="AsociarDirector" size="0" style="width: 50%;color:black; 
    margin: auto; margin-left:120px">
						<c:if test="${DirectoresAsociar != null}">
							<c:forEach items="${DirectoresAsociar}" var="Director">
			
								<option
									value="${Director.id_director}">
									${Director.nombre} - ${Director.apellido}</option>
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
                                <button type="submit" class="btn btn-success" id="btnAgregarActor" style ="margin-left:80px;">Asociar Director con pelicula</button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>    
            
                     
        </form>
    </div>
    </c:if>
</div>

<jsp:include page="MasterPageFooter.jsp" />