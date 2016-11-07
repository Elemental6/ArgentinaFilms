<jsp:include page="MasterPageCabecera.jsp" />
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div id="contenido" class="film backdropped logged-out backdrop-loaded">
	<div id="cagamargin"></div>
	<div class="content-wrap">
		<div id="film-page-wrapper" class="cols-3 overflow">
			<div>
				<div id="poster-col" class="col-6 gutter-right-1 col-poster-large is_stuck" style="position: /*fixed*/;">
					<section class="posters posters-230 no-hover el col">
						<div class="react-component film-poster film-poster-209381 poster">
							<img src="${selectPelicula.poster}" alt="${selectPelicula.nombre}" height="345" width="230">
						</div>
						<div class="film-stats">
							<ul>
								<li class="filmstat-watches">
									<a class="has-icon icon-watched icon-16">
										@ @ @ @ @˜…
									</a>
								</li>
							</ul>
						</div>
					</section>
					<section class="watch-panel js-watch-panel">
						<h3 class="title">Ver</h3>
						<p class="js-watch-panel-trailer">
							<a class="label -text track-event js-trailer-zoom cboxElement" onclick='javascript:showTrailer("${selectPelicula.trailer}");'>								<span class="icon -play"></span>
								<span class="name">Trailer</span>
							</a>
						</p>
					</section>
				</div>
			</div>
			<div class="col-17" Style="top: 10%;">
				<section id="featured-film-header">
					<h1 class="film-title prettify">${selectPelicula.nombre}</h1>
					<p>
						<small itemprop="datePublished">
							${selectPelicula.anio}
						</small>
					</p>
				</section>
				<section class="section col-10 col-main">
					<section>
						<div class="review text text-large">
							<h4 class="tagline">Synopsis</h4>
							<div class="truncate">
								<p>
									${selectPelicula.synopsis}
								</p>
							</div>
						</div>
					</section>
					<section>
						<div class="review text text-large">
							<h4 class="tagline">Duracion</h4>
							<div class="truncate">
								<p>
									${selectPelicula.duracion}
								</p>
							</div>
						</div>
					</section>
					<div id="tabbed-content">
						<header>
							<ul>
								<li>
									<h4 class="tagline">Director</h4>
								</li>
							</ul>
						</header>
						<div id="tab-cast">
							<div class="cast-list box-link-list">
								<p>
									<a href="###link-Actor" class="box-link">
										<span itemprop="name">${selectPelicula.director.nombre} ${selectPelicula.director.apellido}</span>
									</a>
								</p>
							</div>
						</div>
					</div>
					<div id="tabbed-content">
						<header>
							<ul>
								<li>
									<h4 class="tagline">Actores</h4>
								</li>
							</ul>
						</header>
						<div id="tab-cast">
							<div class="cast-list box-link-list">
								<p>
									<c:forEach items="${selectPelicula.actores}" var="actor">
										<a href="VerActor?id=${actor.id_actor}" class="box-link">
											<span itemprop="name">${actor.nombre} ${actor.apellido}</span>
										</a>
									</c:forEach>
								</p>
							</div>
						</div>
					</div>
				</section>
				<section class="film-recent-reviews">
					<section id="viewings-list">
						<h2 class="section-heading">
							Reseñas
						</h2>
						<ul class="posters posters-70">
							<!--Aca nose como manejar las reseÃ±as -->
							<li class="film-detail">
								<a class="avatar avatar-40" href="###link-user">
									<img src="###avatar-user" alt="###name-user" height="40" width="40">
								</a>
								<div class="film-detail-content">
									<p class="film-detail-meta rating-green">
										<a href="###link-user" class="author">
											###name-user
										</a>
									</p>
									<div class="text collapsible-text">
										<div class="collapsed-text">
											<p>
												###reseÃ±a
											</p>
										</div>
									</div>
								</div>
							</li>
						</ul>
					</section>
				</section>
			</div>
		</div>
	</div>
</div>
<div id="cboxOverlay" style="opacity: 0.7; display: none;"></div>
<div id="colorbox" class="" style="display: none; visibility: visible; top: 20%; left: 25%; position: fixed; width: 980px; height: 586px; overflow: hidden; opacity: 1; cursor: auto;">
	<div id="cboxWrapper" style="height: 586px; width: 980px;">
		<div>
			<div id="cboxTopLeft" style="float: left;"></div>
			<div id="cboxTopCenter" style="float: left; width: 944px;"></div>
			<div id="cboxTopRight" style="float: left;"></div>
		</div>
		<div style="clear: left;">
			<div id="cboxMiddleLeft" style="float: left; height: 550px;"></div>
			<div id="cboxContent" style="float: left; width: 944px; height: 550px;">
				<div id="cboxLoadedContent" style="width: 944px; overflow: auto; height: 550px;"></div>
				<div id="cboxTitle" style="float: left; display: block;"></div>
				<div id="cboxCurrent" style="float: left; display: none;"></div>
				<div id="cboxNext" style="float: left; display: none;"></div>
				<div id="cboxPrevious" style="float: left; display: none;"></div>
				<div id="cboxSlideshow" style="float: left; display: none;"></div>
				<div id="cboxClose" style="float: left;" onclick="javascript:hideTrailer();">close</div>
			</div>
			<div id="cboxMiddleRight" style="float: left; height: 550px;"></div>
		</div>
		<div style="clear: left;">
			<div id="cboxBottomLeft" style="float: left;"></div>
			<div id="cboxBottomCenter" style="float: left; width: 944px;"></div>
			<div id="cboxBottomRight" style="float: left;"></div>
		</div>
	</div>
	<div style="position: absolute; width: 9999px; visibility: hidden; display: none;"></div>
</div>
<jsp:include page="MasterPageFooter.jsp" />