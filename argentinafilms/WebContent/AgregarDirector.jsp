<jsp:include page="MasterPageCabecera.jsp" />
    
<div class="contenido">
    <div class="login reg">
        <h1 class="text-center titulo-seccion"><img src="imgs/RegistrarDirector.png" class="imagen-seccion" />Registrar Director</h1>
        
        <div class="${tipoMensaje}"><b>${mensajeResultado}</b></div>
        
        <form action="ServletRegistrarDirectores" role="form" class="login form-horizontal" method="POST"> 
        
        
            <div class="form-group"> 
                <label class="control-label col-sm-2">Nombre: </label>                 
                <div class="col-sm-10">
                    <div>
                        <div>
                            <div>
                                <input type="text" class="form-control" name="director_nombre" placeholder="Ingrese nombre del actor" required>
                            </div>
                        </div>
                    </div>
                </div>                 
            </div>    
                     
            <div class="form-group"> 
                <label class="control-label col-sm-2">Apellido:</label>                 
                <div class="col-sm-10">
                    <div>
                        <div>
                            <div>
                                <input type="text" class="form-control login" name="director_apellido" placeholder="Ingrese apellido del actor" required>
                            </div>
                        </div>
                    </div>
                </div>                 
            </div>  
            
            <div class="form-group"> 
                <label class="control-label col-sm-2">Edad:</label>                 
                <div class="col-sm-10">
                    <div>
                        <div>
                            <div>
                             <input type="number"class="form-control login"  placeholder="Ingrese edad del actor" name="director_edad" min="1" max="120" required>

                            </div>
                        </div>
                    </div>
                </div>                 
            </div>               


			
			 
            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                    <div>
                        <div>
                            <div>
                                <button type="submit" class="btn btn-success" id="btnAgregarActor">Agregar actor</button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>    
            
                     
        </form>
    </div>
</div>

<jsp:include page="MasterPageFooter.jsp" />