<jsp:include page="MasterPageCabecera.jsp" />
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/BuscarPeliculas" />

<div class="contenido">

<section id="popular-reviews" class="section ultimas-publicaciones">
        
<h2 class="section-heading">RESULTADOS</h2>
            

	<ul class="posters film-list clear posters-70 film-details-list no-title">
            
	<c:forEach items="${PeliculasEncontradas}" var="Pelicula">

		<li class="film-detail"> 
                
			<div class="poster film-poster really-lazy-load" data-image-width="70" data-image-height="105"> 
				 <img src="${Pelicula.poster}" width="70" height="105" />
				 <span class="frame"><span class="frame-title"></span></span> 
			 </div>                     
                    
             <div class="film-detail-content pull-left"> 
             	<h2 class="film-title prettify"><a href="ServletVerPelicula?pelicula_id=${Pelicula.id_pelicula}">${Pelicula.nombre}</a> <small><a href="/peliculas/anios/${Pelicula.anio}/">${Pelicula.anio}</a></small></h2> 
                	<p class="film-detail-meta rating-green film-detail-with-author"> <a class="avatar avatar-24"> 
                    <img src="<%= getServletContext().getRealPath("/") %>${Pelicula.usuario.avatar}" width="24" height="24" /> 
                    <span></span> 
                    </a> <a href="/perfil/${Pelicula.usuario.usuario}" class="author">${Pelicula.usuario.usuario}</a> </p> 
                        <div class="text collapsible-text"> 
                	<p>${Pelicula.synopsis}</p>
              	</div>                         
              </div>                     
    	</li>
        
	</c:forEach>


	</ul>

</section>


	</div>


<jsp:include page="MasterPageFooter.jsp" />