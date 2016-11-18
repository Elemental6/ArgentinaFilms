<jsp:include page="MasterPageCabecera.jsp" />
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<c:import url="/ListarUsuarios" /> <!-- llamo servlet al cargar pagina -->
    
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
		<h1 class="text-center titulo-seccion"><img src="imgs/CambiarRango.png" class="imagen-seccion" style="margin-top: -50px!important;"/>CAMBIAR RANGO USUARIO</h1>
	</div>

	<div class="${tipoMensaje}"><b>${mensajeResultado}</b></div>

		<input type="text" id="inputBuscarUsuarioCambiarRango" class="form-control"
						placeholder="Buscar usuario..." style="font-size: 18px; width:500px; margin: auto;">
<br>
<br>
		<table class="table"> 
		    <thead> 
		        <tr> 
		            <th>Nombre de usuario</th> 
		            <th>Nombre y Apellido</th> 
		            <th>E-mail</th> 
		            <th>Rango</th>
		            <th>Acción</th>
		        </tr>         
		    </thead>     
		
		    <tbody>
		    
		   		 <c:if test="${usuarios.size() == 0 || usuarios == null}">
					<tr><td colspan="5" align="center">No existen usuarios activos.</td></tr>
				</c:if>
		    
				<c:forEach items="${usuarios}" var="usuario">
				<c:if test="${userLogueado.usuario != usuario.usuario}">
				<form action="CambiarRangoUsuario" method="GET" id="filaUsuario">
				
				
				
				<input name="userSeleccionado" value="${usuario.usuario}" type="hidden"></input>
				<input name="pagActual" value="${paginaActual}" type="hidden"></input>
				
						<tr>
						<td><a href="VerPerfilUsuario.jsp/?id="${usuario.usuario}></a>${usuario.usuario}</td>
						<td>${usuario.nombre} ${usuario.apellido}</td>
						<td>${usuario.email}</td>

						<td style="width:200px!important">
							<select id="rangoSeleccionado" name="rangoSeleccionado" class="input-sm">
		                	<option value="novato" <c:if test="${usuario.rango == 'novato'}">selected</c:if>>Novato</option>
		                	<option value="moderador" <c:if test="${usuario.rango == 'moderador'}">selected</c:if>>Moderador</option>
		            		</select>
                    	</td>
                    	
                    	<td><button type="submit" class="btn btn-success btn-sm" style="margin: auto!important" onclick="return confirm('¿Está completamente seguro?')" >Cambiar rango</button></td>
						</tr>
					
				</form>
				</c:if>
				</c:forEach>
			</tbody>
		</table>


	<div class="paginado" align="center">


		<ul class="pagination lead" data-pg-collapsed> 
		<c:if test="${paginaActual != 1}">
		    <li>
		        <a href="CambiarRangoUsuario.jsp?pagina=1">&laquo;</a>
		    </li>    
		 </c:if>   
		     
		     
		 <c:forEach begin="1" end="${cantPaginas}" var="i">    


		    <li <c:if test="${paginaActual == i}">class="active"</c:if>>
		        <a href="CambiarRangoUsuario.jsp?pagina=${i}">${i}</a>
		    </li>     

		   </c:forEach> 
		    
		    <c:if test="${paginaActual lt cantPaginas}">
		    <li>
		        <a href="CambiarRangoUsuario.jsp?pagina=${cantPaginas}">&raquo;</a>
		    </li>     
		    </c:if>
		</ul>

	</div>
       
       <hr>
       
       <div align=center style="width: 100%; margin:auto;">
        	<a href="Administrar.jsp" class="btn btn-primary">Volver</a>
        </div> 
        
 </c:if>       
        
</div>
    



<jsp:include page="MasterPageFooter.jsp" />