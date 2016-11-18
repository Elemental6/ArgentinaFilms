<jsp:include page="MasterPageCabecera.jsp" />
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<c:import url="/ServletVerPerfilActor" /> <!-- llamo servlet al cargar pagina -->

<c:if test="${not empty actorSelect}">

<div class="contenido">
	<div class="posters film-list clear posters-70 film-details-list no-title" style="margin-left:30%; width:40%;">      
		<div class="poster film-poster really-lazy-load" style="width:100px; height:100px;"> 
			<img src="imgs/avatares/no-foto.png" width=100px height=100px>
			<span class="frame"><span class="frame-title"></span></span> 
		</div>
		<div class="pull-left"> 
			<h2 class="film-title prettify">${actorSelect.nombre} ${actorSelect.apellido} (Actor)</h2> 
			<div class="text collapsible-text">
				<p></p>
			</div>                         
		</div>                     
	</div>
	<section id="live-feed" class="section" style="margin-left:20%; width:60%; margin-top:50px;">
		<h2 class="section-heading">Peliculas en las que fue actor</h2>
		
		<c:if test="${lasPeliculas.size() == 0 || lasPeliculas == null}">
			<div style="font-size: 18px!important; color: #A9E2F3; font-style:italic">(Este actor no figura en ninguna película)</div>
		</c:if>
		
		<c:if test="${not empty lasPeliculas}">
		<div class="live-feed-container has-fade ">
			<ul class="posters posters-70">
				<c:forEach items="${lasPeliculas}" var="pelicula">
					<li class="live-poster">
						<div class="react-component film-poster film-poster-70663 poster linked-film-poster">
							<div data-reactid=".7">
								<img src="${pelicula.poster}" width=70px height=105px>
								<a href="VerPelicula.jsp?pelicula_id=${pelicula.id_pelicula}" class="frame">
									<span class="overlay"></span>
								</a>
							</div>
						</div>	
					</li>
				</c:forEach>
			</ul>
		</div>
		
		</c:if>
	</section>
</div>


<c:if test="${empty actorSelect}">
     	<c:redirect url="Error404.jsp"/>
</c:if>  

</c:if>

<jsp:include page="MasterPageFooter.jsp" />