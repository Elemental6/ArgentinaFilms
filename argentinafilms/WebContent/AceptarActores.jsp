<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:import url="/ListarPeticionesActores" /> <!-- llamo servlet al cargar pagina -->

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
		<h1 class="text-center titulo-seccion"><img src="imgs/AceptarActores.png" class="imagen-seccion" />ACEPTAR ACTORES</h1>
	</div>

		<table class="table" style="font-color: yellow!important; font-size: 14px!important; width: 900px!important; margin: auto;"> 
		    <thead> 
		        <tr> 
		           
		            <th>Nombre</th> 
		            <th>Apellido</th> 
		            <th>Edad</th>
		            <th>Petición</th>
		        </tr>         
		    </thead>     
		
		    <tbody>
		    
		   		 <c:if test="${peticionesActores.size() == 0 || peticionesActores == null}">
					<tr><td colspan="5" align="center">No hay peticiones de actores.</td></tr>
				</c:if>
		    
				<c:forEach items="${peticionesActores}" var="peticionActor">
						<tr id="fila${peticionActor.id_actor}">
						<td>${peticionActor.nombre}</td>
						<td>${peticionActor.apellido}</td>
						<td>${peticionActor.edad}</td>

						<td style="width:200px!important">
                        <button type="button" onclick="javascript:AceptarActor(${peticionActor.id_actor});" class="btn btn-success btn-sm" style="margin: auto!important">Aceptar</button>                         
                        <button type="button" onclick="javascript:RechazarActor(${peticionActor.id_actor});" class="btn btn-danger btn-sm" style="margin: auto!important">Rechazar</button>
                    	</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>


	<div class="paginado" align="center">


		<ul class="pagination lead" data-pg-collapsed> 
		<c:if test="${paginaActual != 1}">
		    <li>
		        <a href="AceptarActores.jsp?pagina=1">&laquo;</a>
		    </li>    
		 </c:if>   
		     
		     
		 <c:forEach begin="1" end="${cantPaginas}" var="i">    


		    <li <c:if test="${paginaActual == i}">class="active"</c:if>>
		        <a href="AceptarActores.jsp?pagina=${i}">${i}</a>
		    </li>     

		   </c:forEach> 
		    
		    <c:if test="${paginaActual lt cantPaginas}">
		    <li>
		        <a href="AceptarActores.jsp?pagina=${cantPaginas}">&raquo;</a>
		    </li>     
		    </c:if>
		</ul>

<%-- 		
		For displaying Previous link except for the 1st page

	 
	    For displaying Page numbers. 
	    The when condition does not display a link for the current page
	    <table border="1" cellpadding="5" cellspacing="5">
	        <tr>
	            <c:forEach begin="1" end="${cantPaginas}" var="i">
	                <c:choose>
	                    <c:when test="${currentPage eq i}">
	                        <td>${i}</td>
	                    </c:when>
	                    <c:otherwise>
	                        <td><a href="AceptarPeliculas.jsp?pagina=${i}">${i}</a></td>
	                    </c:otherwise>
	                </c:choose>
	            </c:forEach>
	        </tr>
	    </table>
	     
	    For displaying Next link
	    <c:if test="${paginaActual lt cantPaginas}">
	        <td><a href="AceptarPeliculas.jsp?pagina=${paginaActual + 1}">Siguiente</a></td>
	    </c:if> --%>


	</div>


 </c:if>  

<hr>

<div align=center style="width: 100%; margin:auto;">
        	<a href="Administrar.jsp" class="btn btn-primary">Volver</a>
        </div> 

</div>


<jsp:include page="MasterPageFooter.jsp" />