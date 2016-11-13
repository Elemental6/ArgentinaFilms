<jsp:include page="MasterPageCabecera.jsp" />
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div class="contenido">
	<div class="posters film-list clear posters-70 film-details-list no-title" style="margin-left:30%; width:40%;">      
		<div class="poster film-poster really-lazy-load" style="width:100px; height:100px;"> 
			<img src="imgs/avatares/no-foto.png" width=100px height=100px>
			<span class="frame"><span class="frame-title"></span></span> 
		</div>
		<div class="pull-left"> 
			<h2 class="film-title prettify"><c:if test="${!empty actorSelect}">${actorSelect.nombre} ${actorSelect.apellido} (Actor)</c:if><c:if test="${!empty directorSelect}">${directorSelect.nombre} ${directorSelect.apellido} (Director)</c:if></h2> 
			<div class="text collapsible-text">
				<p></p>
			</div>                         
		</div>                     
	</div>
	<section id="live-feed" class="section" style="margin-left:20%; width:60%; margin-top:50px;">
		<h2 class="section-heading">Peliculas en las que fue <c:if test="${!empty actorSelect}">actor</c:if><c:if test="${!empty directorSelect}">director</c:if></h2>
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
	</section>
</div>

<jsp:include page="MasterPageFooter.jsp" />