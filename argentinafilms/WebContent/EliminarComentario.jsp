<jsp:include page="MasterPageCabecera.jsp" />
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<c:import url="/ListarComentariosEliminar" /> <!-- llamo servlet al cargar pagina -->
    
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
		<h1 class="text-center titulo-seccion"><img src="imgs/BorrarPelicula.png" class="imagen-seccion" />ELIMINAR PELICULA</h1>
	</div>

	<div class="${tipoMensaje}"><b>${mensajeResultado}</b></div>


		<table class="table" style="font-color: yellow!important; font-size: 14px!important; width: 900px!important; margin: auto;"> 
		    <thead> 
		        <tr> 
		            <th>Comentario</th> 
		            <th>Usuario</th> 
		            		            <th>Eliminar</th> 
		              
		        </tr>         
		    </thead>     
		
		    <tbody>
		    
		   		 <c:if test="${ComentariosEliminar.size() == 0 || ComentariosEliminar == null}">
					<tr><td colspan="3" align="center">No existen comentarios</td></tr>
				</c:if>
		    
				<c:forEach items="${ComentariosEliminar}" var="comentario">
			
				<form action="EliminarComentario" method="GET" id="filaComentario">

				
				<input name="comentarioSeleccionada" value="${comentario.comentario_id}" type="hidden"></input>
				<input name="pagActual" value="${paginaActual}" type="hidden"></input>
				
						<tr>
						<td>${comentario.comentario}</td>
						<td>${comentario.usuario.usuario}</td>
						
						                    	
                    	<td><button type="submit" class="btn btn-success btn-sm" style="margin: auto!important" onclick="return confirm('Esta seguro?');">Eliminar</button></td>
						</tr>
					
				</form>
				
				</c:forEach>
			</tbody>
		</table>


	<div class="paginado" align="center">


		<ul class="pagination lead" data-pg-collapsed> 
		<c:if test="${paginaActual != 1}">
		    <li>
		        <a href="EliminarComentario.jsp?pagina=1">&laquo;</a>
		    </li>    
		 </c:if>   
		     
		     
		 <c:forEach begin="1" end="${cantPaginas}" var="i">    


		    <li <c:if test="${paginaActual == i}">class="active"</c:if>>
		        <a href="EliminarComentario.jsp?pagina=${i}">${i}</a>
		    </li>     

		   </c:forEach> 
		    
		    <c:if test="${paginaActual lt cantPaginas}">
		    <li>
		        <a href="EliminarComentario.jsp?pagina=${cantPaginas}">&raquo;</a>
		    </li>     
		    </c:if>
		</ul>


	</div>
        
 </c:if>       
        
</div>
    



<jsp:include page="MasterPageFooter.jsp" />