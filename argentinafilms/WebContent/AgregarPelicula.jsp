<jsp:include page="MasterPageCabecera.jsp" />
<script type="text/javascript" src="js/AgregarPelicula.js"></script>
<link href="css/select2.min.css" rel="stylesheet">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">


<div class="contenido">
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



    <div class="login reg">
        <h1 class="text-center titulo-seccion"><img src="imgs/register.png" class="imagen-seccion" />Agregar Pelicula</h1>
        
        <div class="${tipoMensaje}"><b>${mensajeResultado}</b></div>
        
        <form action="ServletRegistrarPelicula" role="form" class="login form-horizontal" method="POST"> 
        
        
            <div class="form-group"> 
                <label class="control-label col-sm-2">Nombre:</label>                 
                <div class="col-sm-10">
                    <div>
                        <div>
                            <div>
                                <input type="text" class="form-control" name="txtnombre" placeholder="Ingrese el nombre de la película" required>
                            </div>
                        </div>
                    </div>
                </div>                 
            </div>    
                     
           
<!-- 			<div class="form-group">  -->
<!-- 			<label class="control-label col-sm-2">Ubicación:</label>                  -->
<!--                 <div class="col-sm-10"> -->
<!--                     <div> -->
<!--                         <div> -->
<!--                             <div> -->
<!--                                 <input type="text" class="form-control login" name="txtUbicacion" placeholder="Ingrese la ubicacíon" required> -->
<!--                             </div> -->
<!--                         </div> -->
<!--                     </div> -->
<!--                 </div>                  -->
<!-- 			</div> -->
			
			
				<div class="form-group"> 
							<label class="control-label col-sm-2">Poster:</label>                 
				                <div class="col-sm-10">
				                    <div>
				                        <div>
				                            <div class="bootstrap-filestyle input-group" style="width: 100%;">
				                            <span class ="btn btn-default btn-file" style="width: 100%;cursor: default;">
				                           
				                            <input type="file" id="myFile" style="cursor: default;" accept="image/*">
				                            </span>
				                                
				                                
				                                </div>
				                            </div>
				                        </div>
				                    </div>
				                </div>                 
							

			<div class="form-group"> 
               <label class="control-label col-sm-2">Duración:</label>                 
                <div class="col-sm-10">
                    <div>
                        <div>
                            <div>
                                <input type="number" min="0" max="300" class="form-control login" name="txtDuracion" placeholder="Ingrese la duracíon" required>
                            </div>
                        </div>
                    </div>
                </div>                 
 			</div>
            
            <div class="form-group"> 
            	<label class="control-label col-sm-2">Trailer:</label>                 
                <div class="col-sm-10">
                    <div>
                        <div>
                            <div>
                                <input type="text" class="form-control login" name="txtTrailer" placeholder="Ingrese el trailer">
                            </div>
                        </div>
                    </div>
                </div>                 
			 </div> 
			 
			  <div class="form-group"> 
                <label class="control-label col-sm-2">Director:</label>                 
                <div class="col-sm-10">
                    <div>
                        <div>
                            <div>
                                  <select class ="form-control" name="txtdirector" id ="completarDirectores">
                                  
							  </select>
                            </div>
                        </div>
                    </div>
                </div> 
                  </div>
			 
			  <div class="form-group"> 
                <label class="control-label col-sm-2">Género:</label>                 
                <div class="col-sm-10">
                    <div>
                        <div class= "select-field">
							  <select class ="form-control" name="txtGenero" id ="completarGeneros">
							  
							  </select>

                        </div>
                    </div>
                </div>       
			 </div>  
			 
			<div class="form-group"> 
            	<label class="control-label col-sm-2">Synopsis:</label>                 
	                	<div class="col-sm-10">
	                    <div>
	                        <div>
	                         <div> 
							   <textarea class="form-control login" rows="5" name="txtAreaSynospsis"  MAXLENGTH="254"></textarea>
							 </div>
                        </div>
                    </div>
                </div>   
                            
			 </div> 
			
                <div class="form-group"> 
                <label class="control-label col-sm-2">Año:</label>                 
                <div class="col-sm-10">
                    <div>
                        <div>
                            <div>
                                <select  class="form-control login" name="txtanio" value="2015" placeholder ="Ingrese el año de la película" required>
                                <option value="">Seleccione un año</option>
                                <script>
								  var myDate = new Date();
								  var year = myDate.getFullYear();
								  for(var i = 1900; i < year+1; i++){
									  document.write('<option value="'+i+'">'+i+'</option>');
								  }
  								</script></select>
                            </div>
                        </div>
                    </div>
                </div>                 
            </div>  
			 <div class="form-group"> 
			                <label class="control-label col-sm-2">Actores:</label>                 
			                <div class="col-sm-6">
			                    <div>
			                        <div class= "select-field">
										  <select class ="form-control" name="txtactor" id ="completarActores" >
										   
										  </select>
			
			                        </div>
			                    </div>
			                </div>  
			                  <div class="col-sm-4">  
			                          <button class="btn btn-default btn-sm" id="btnAgregarActor">Agregar Actor</button>    
			            </div>  
			            <label id="lblActores"></label>       
						 </div>
						 
						 <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                    <div>
                        <div>
                            <div>
                                <button type="submit" class="btn btn-success" id="btnAgregar">Agregar Película</button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>    
	 </form>
    </div>
    </c:if>
</div>		 
		
		<script type="text/javascript" src="js/select2.min.js"></script>

<script> $('select').select2();</script>
<style type="text/css">
<!--
body {
    font-size: 62.5%;
    background: #424242;
}
.select2-container { 
    font-size: small;
}

-->
</style> 
<jsp:include page="MasterPageFooter.jsp" />				 

