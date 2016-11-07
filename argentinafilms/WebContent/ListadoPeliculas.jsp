<jsp:include page="MasterPageCabecera.jsp" />
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div class="contenido" data-pg-collapsed>

	<div class="container" align="center" data-pg-id="4579"
		style="font-size: 24px; font-weight: bold;">
<style type="text/css">>
.myButton {
	-moz-box-shadow: 0px 1px 0px 0px #fff6af;
	-webkit-box-shadow: 0px 1px 0px 0px #fff6af;
	box-shadow: 0px 1px 0px 0px #fff6af;
	background:-webkit-gradient(linear, left top, left bottom, color-stop(0.05, #ffec64), color-stop(1, #ffab23));
	background:-moz-linear-gradient(top, #ffec64 5%, #ffab23 100%);
	background:-webkit-linear-gradient(top, #ffec64 5%, #ffab23 100%);
	background:-o-linear-gradient(top, #ffec64 5%, #ffab23 100%);
	background:-ms-linear-gradient(top, #ffec64 5%, #ffab23 100%);
	background:linear-gradient(to bottom, #ffec64 5%, #ffab23 100%);
	filter:progid:DXImageTransform.Microsoft.gradient(startColorstr='#ffec64', endColorstr='#ffab23',GradientType=0);
	background-color:#ffec64;
	-moz-border-radius:6px;
	-webkit-border-radius:6px;
	border-radius:6px;
	border:1px solid #ffaa22;
	display:inline-block;
	cursor:pointer;
	color:#333333;
	font-family:Arial;
	font-size:15px;
	font-weight:bold;
	padding:6px 24px;
	text-decoration:none;
	text-shadow:0px 1px 0px #ffee66;
}
.myButton:hover {
	background:-webkit-gradient(linear, left top, left bottom, color-stop(0.05, #ffab23), color-stop(1, #ffec64));
	background:-moz-linear-gradient(top, #ffab23 5%, #ffec64 100%);
	background:-webkit-linear-gradient(top, #ffab23 5%, #ffec64 100%);
	background:-o-linear-gradient(top, #ffab23 5%, #ffec64 100%);
	background:-ms-linear-gradient(top, #ffab23 5%, #ffec64 100%);
	background:linear-gradient(to bottom, #ffab23 5%, #ffec64 100%);
	filter:progid:DXImageTransform.Microsoft.gradient(startColorstr='#ffab23', endColorstr='#ffec64',GradientType=0);
	background-color:#ffab23;
}
.myButton:active {
	position:relative;
	top:1px;
}


</style>
		<form action="ServletListarPeliculas" role="form"
			class="login form-horizontal" method="POST">
					<button class="myButton" type="submit" name="A">A</button>
		<button class="myButton"  type="submit" name="B">B</button>
		<button class="myButton"  type="submit" name="C">C</button>
		<button class="myButton"  type="submit" name="D">D</button>
		<button class="myButton"  type="submit" name="E">E</button>
		<button class="myButton"  type="submit" name="F">F</button>
		<button class="myButton"  type="submit" name="G">G</button>
		<button class="myButton"  type="submit" name="H">H</button>
		<button class="myButton"  type="submit" name="I">I</button>
		<button class="myButton"  type="submit" name="J">J</button>
		<button class="myButton"  type="submit" name="K">K</button>
		<button class="myButton"  type="submit" name="L">L</button>
		<button class="myButton"  type="submit" name="M">M</button>
		<button class="myButton"  type="submit" name="N">N</button>
		<button class="myButton"  type="submit" name="Ñ">Ñ</button>
		<button class="myButton"  type="submit" name="O">O</button>
		<button class="myButton"  type="submit" name="P">P</button>
		<button class="myButton"  type="submit" name="Q">Q</button>
		<button class="myButton"  type="submit" name="R">R</button>
		<button class="myButton"  type="submit" name="S">S</button>
		<button class="myButton"  type="submit" name="T">T</button>
		<button class="myButton"  type="submit" name="U">U</button>
		<button class="myButton"  type="submit" name="V">V</button>
		<button class="myButton"  type="submit" name="W">W</button>
		<button class="myButton"  type="submit" name="X">X</button>
		<button class="myButton"  type="submit" name="Y">Y</button>
		<button class="myButton"  type="submit" name="Z">Z</button>

			
			</form>







		<style type="text/css">
div.table-title {
	display: block;
	margin: auto;
	max-width: 600px;
	padding: 5px;
	width: 100%;
}

.table-title h3 {
	color: #fafafa;
	font-size: 30px;
	font-weight: 400;
	font-style: normal;
	font-family: "Roboto", helvetica, arial, sans-serif;
	text-shadow: -1px -1px 1px rgba(0, 0, 0, 0.1);
	text-transform: uppercase;
}

/*** Table Styles **/
.table-fill {
	background: white;
	border-radius: 3px;
	border-collapse: collapse;
	height: 320px;
	margin: auto;
	max-width: 600px;
	padding: 5px;
	width: 100%;
	box-shadow: 0 5px 10px rgba(0, 0, 0, 0.1);
	animation: float 5s infinite;
}

th {
	color: #D5DDE5;;
	background: #1b1e24;
	border-bottom: 4px solid #9ea7af;
	border-right: 1px solid #343a45;
	font-size: 23px;
	font-weight: 100;
	padding: 24px;
	text-align: left;
	text-shadow: 0 1px 1px rgba(0, 0, 0, 0.1);
	vertical-align: middle;
}

th:first-child {
	border-top-left-radius: 3px;
}

th:last-child {
	border-top-right-radius: 3px;
	border-right: none;
}

tr {
	border-top: 1px solid #C1C3D1;
	border-bottom-: 1px solid #C1C3D1;
	color: #666B85;
	font-size: 16px;
	font-weight: normal;
	text-shadow: 0 1px 1px rgba(256, 256, 256, 0.1);
}

tr:hover td {
	background: #4E5066;
	color: #FFFFFF;
	border-top: 1px solid #22262e;
	border-bottom: 1px solid #22262e;
}

tr:first-child {
	border-top: none;
}

tr:last-child {
	border-bottom: none;
}

tr:nth-child(odd) td {
	background: #EBEBEB;
}

tr:nth-child(odd):hover td {
	background: #4E5066;
}

tr:last-child td:first-child {
	border-bottom-left-radius: 3px;
}

tr:last-child td:last-child {
	border-bottom-right-radius: 3px;
}

td {
	background: #FFFFFF;
	padding: 20px;
	text-align: left;
	vertical-align: middle;
	font-weight: 300;
	font-size: 18px;
	text-shadow: -1px -1px 1px rgba(0, 0, 0, 0.1);
	border-right: 1px solid #C1C3D1;
}

td:last-child {
	border-right: 0px;
}

th.text-left {
	text-align: left;
}

th.text-center {
	text-align: center;
}

th.text-right {
	text-align: right;
}

td.text-left {
	text-align: left;
}

td.text-center {
	text-align: center;
}

td.text-right {
	text-align: right;
}
</style>

</div>






<section id="popular-reviews" class="section ultimas-publicaciones">
        
<h2 class="section-heading">TODAS LAS PELÍCULAS</h2>
            

	<ul class="posters film-list clear posters-70 film-details-list no-title">
            
	<c:forEach items="${PeliculasListado}" var="Pelicula">

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


	



<jsp:include page="MasterPageFooter.jsp" />