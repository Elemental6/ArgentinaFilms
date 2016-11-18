<jsp:include page="MasterPageCabecera.jsp" />
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<c:import url="/ServletListarUltimasPeliculas" /> <!-- llamo servlet al cargar pagina -->

<div class="contenido" data-pg-collapsed>
    <div class="container left-addon inner-addon">
        <hr>
        <p class="cuerpo-suelto desplegador">Argentina Films es el primer sitio en unificar las ideas de
          todos en una sola gran idea.<br><br><button type="button" class="btn btn-default">Aprender más +</button></p>
        <div class="desplegable" style="color:#9FF781;">
           <div class="row">
            <div class="col-md-4">
                <h3 style="font-weight: bold" class="text-center">CONECTÁTE</h3>
                <img src="imgs/connect.png" class="img-responsive" style="margin-left: 60px;"/> 
                <p>Regístrate. Crearse una cuenta en Argentina Films es totalmente gratuito. En sólo 5 minutos tendrás tu cuenta lista para empezar a compartir tus aportes.</p> 
            </div>
            <div class="col-md-4 text-center">
                <h3 style="font-weight: bold">HACÉ TU APORTE</h3>
                <img src="imgs/pluma.png" class="img-responsive" width=200px/> 
                <p>Agregá películas, actores, directores y reseñá películas del cine argentino para que los demás conozcan tu opinión y/o des a conocer esa película que tanto te gusta o querés dar a conocer.</p> 
            </div>
            <div class="col-md-4 pull-right text-right">
                <h3 style="font-weight: bold" class="text-center">PUNTUÁ</h3>
                <img src="imgs/estrella.png" class="img-responsive"/> 
                <p>Dale puntajes del 1 al 5 a las películas considerando tu punto de vista.</p> 
            </div>
        </div>

        </div>
    </div>
    
     
    </div>
    <div class="ultimas-publicaciones">

        <section id="popular-reviews" class="section ultimas-publicaciones">
        
            <h2 class="section-heading">ÚLTIMAS PELÍCULAS AGREGADAS</h2>
            
            <a href="ServletListarPeliculas" class="all-link more-link" style="color:orange; font-weight: bold">VER TODAS</a>
            
            <ul class="posters film-list clear posters-70 film-details-list no-title">
            
            
            <c:forEach items="${UltimasPeliculas}" var="pelicula">

            
                <li class="film-detail"> 
                
                    <div class="poster film-poster really-lazy-load" data-image-width="70" data-image-height="105"> 
                        <img src="<%=request.getContextPath()%>/${pelicula.poster}" width="70" height="105" />
                        <span class="frame"><span class="frame-title"></span></span> 
                    </div>                     
                    
                    <div class="film-detail-content pull-left"> 
                  
                        <h2 class="film-title prettify"><a href="VerPelicula.jsp?pelicula_id=${pelicula.id_pelicula}">${pelicula.nombre}</a> <small> <!-- <ahref="Resultados.jsp?buscar=${pelicula.anio}/" >--> <a> ${pelicula.anio}</a></small></h2> 
                        <p class="film-detail-meta rating-green film-detail-with-author"> <a class="avatar avatar-24"> 
                                <img src="<%=request.getContextPath()%>/${pelicula.usuario.avatar}" width="24" height="24" /> 
                                <span></span> 
                            </a> <a href="VerPerfilUsuario.jsp?id=${pelicula.usuario.usuario}" class="author">${pelicula.usuario.usuario}</a> </p> 
                        <div class="text collapsible-text"> 
                            <p>${pelicula.synopsis}</p>
                        </div>                         
                    </div>                     
                </li>
                </c:forEach>
                
                
            </ul>
        </section>
    </div>

<jsp:include page="MasterPageFooter.jsp" />