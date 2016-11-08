<jsp:include page="MasterPageCabecera.jsp" />
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/ServletListarUltimasPeliculas" /> <!-- llamo servlet al cargar pagina -->

<div class="contenido" data-pg-collapsed>
    <div class="container left-addon inner-addon">
        <hr>
        <p class="cuerpo-suelto desplegador">Argentina Films es el primer foro en unificar las ideas de
          todos en una sola gran idea! Conectáte.<br><br><button type="button" class="btn btn-default">Aprender más +</button></p>
        <div class="desplegable text-center aprender-mas">
           <a href="RegistrosIniciales"><img src="imgs/EnConstruccion.png" width="100"></a>
        </div>
    </div>
    <div>
     <c:if test="${not empty userLogueado}" >
       <a href="AgregarActor.jsp"  style="color:red; font-weight: bold; margin-left:200px; font-size: 20px;">Registrar Actor</a></br></br>
         <a href="AgregarDirector.jsp"  style="color:red; font-weight: bold; margin-left:200px;font-size: 20px;">Registrar Director</a></br></br>
           <a href="ServletAsociarPeliculaXActor" style="color:red; font-weight: bold; margin-left:200px;font-size: 20px;">Asociar Actor con pelicula</a></br></br>
            <a href="ServletAsociarDirectorXPelicula" style="color:red; font-weight: bold; margin-left:200px;font-size: 20px;">Asociar Director con pelicula</a></br></br>
            
     
     </c:if>
    
    </div>
    <div class="ultimas-publicaciones">

        <section id="popular-reviews" class="section ultimas-publicaciones">
        
            <h2 class="section-heading">ÚLTIMAS PELÍCULAS</h2>
            
            <a href="ServletListarPeliculas" class="all-link more-link" style="color:orange; font-weight: bold">VER TODAS</a>
            
            <ul class="posters film-list clear posters-70 film-details-list no-title">
            
            
            <c:forEach items="${UltimasPeliculas}" var="pelicula">

            
                <li class="film-detail"> 
                
                    <div class="poster film-poster really-lazy-load" data-image-width="70" data-image-height="105"> 
                        <img src="${pelicula.poster}" width="70" height="105" />
                        <span class="frame"><span class="frame-title"></span></span> 
                    </div>                     
                    
                    <div class="film-detail-content pull-left"> 
                        <h2 class="film-title prettify"><a href="ServletVerPelicula?pelicula_id=${pelicula.id_pelicula}">${pelicula.nombre}</a> <small><a href="/peliculas/anios/${pelicula.anio}/">${pelicula.anio}</a></small></h2> 
                        <p class="film-detail-meta rating-green film-detail-with-author"> <a class="avatar avatar-24"> 
                                <img src="<%= getServletContext().getRealPath("/") %>${pelicula.usuario.avatar}" width="24" height="24" /> 
                                <span></span> 
                            </a> <a href="/perfil/${pelicula.usuario.usuario}" class="author">${pelicula.usuario.usuario}</a> </p> 
                        <div class="text collapsible-text"> 
                            <p>${pelicula.synopsis}</p>
                        </div>                         
                    </div>                     
                </li>
                </c:forEach>
                
                
            </ul>
        </section>
    </div>

</div>

<jsp:include page="MasterPageFooter.jsp" />