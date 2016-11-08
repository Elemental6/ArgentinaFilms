<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE HTML>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
	<title>Argentina Films</title>
	    <meta name="viewport" content="width=device-width, initial-scale=1">
		<!-- Deshabilitar caché para no volver atrás -->
		<meta http-equiv="Expires" content="0" />
		<meta http-equiv="Pragma" content="no-cache" />


		<link rel="shortcut icon" href="imgs/AFFavicon.ico" type="image/x-icon" />
		
        <link href="css/bootstrap.css" rel="stylesheet">
        <link href="css/dashboard.css" rel="stylesheet">
        <link href="css/lb.min.css" rel="stylesheet" type="text/css">
        <link href="css/sweetalert.css" rel="stylesheet" type="text/css">
        <link href="css/redes-sociales.css" rel="stylesheet" type="text/css">
        <link href="css/star-rating.css" rel="stylesheet" type="text/css">
        <link href="css/contenido.css" rel="stylesheet" type="text/css">
        
        <script type="text/javascript" src="js/jquery.min.js"></script>
        <script type="text/javascript" src="js/seccion-desplegable.js"></script>
        <script type="text/javascript" src="js/sweetalert.min.js"></script>
        <script type="text/javascript" src="js/others.js"></script>
        <script type="text/javascript" src="js/validaciones.js"></script>
        <script type="text/javascript" src="js/busqueda-pelicula.js"></script>
        <script type="text/javascript" src="js/ajax-activar-cuenta.js"></script>
        <script type="text/javascript" src="js/ajax-peticiones-admin.js"></script>
        <script type="text/javascript" src="js/ajax-puntuar.js"></script>
    </head>
    
    <body>
        <nav class="navbar navbar-inverse navbar-fixed-top">
            <div class="container-fluid">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="Inicio.jsp">
                        <img src="imgs/ArgentinaFilms_LogoTexto_Final.png" height="70px">
                    </a>
                </div>
                
                <div id="navbar" class="navbar-collapse collapse">
                
                    <ul class="nav navbar-nav navbar-right">
                    
                    <c:if test="${empty userLogueado}" >
                        <li>
                            <a href="IniciarSesion.jsp"><!-- <span class="glyphicon glyphicon-log-in"></span> --> Iniciar sesión</a>
                        </li>
                        <li>
                            <a href="Registrarse.jsp"><!-- <span class="glyphicon glyphicon-registration-mark"></span> --> Registrarse</a>
                        </li>
                    </c:if>   
                    
                    
 
                    <c:if test="${not empty userLogueado}" >
                        <li>
                            <a href="VerPerfil.jsp"><!-- <span class="glyphicon glyphicon-user"></span> --> ${userLogueado.usuario}</a>
                        </li>
                        
                        <c:if test="${userLogueado.rango == 'admin'  || userLogueado.rango == 'moderador'}" >
                        <li>
                            <a href="Administrar.jsp"><!-- <span class="glyphicon glyphicon-log-in"></span> -->
                            <c:if test="${userLogueado.rango == 'admin'}" >Administrar</c:if>
                            <c:if test="${userLogueado.rango == 'moderador'}" >Moderar</c:if></a>
                        </li>
	                    </c:if>  
	                        
                        <li>
                            <a href="AgregarPelicula.jsp"><!-- <span class="glyphicon glyphicon-log-in"></span> --> Agregar película</a>
                        </li>
                     
                        <li>
                            <a href="CerrarSesion"><!-- <span class="glyphicon glyphicon-log-out"></span> --> Cerrar sesión</a>
                        </li>
                    </c:if>  
  
                    </ul>
                    <div class="navbar-form navbar-right" id="formSearch">
                         <input type="text" id="inputBuscarPelicula" class="form-control" placeholder="Buscar película..." style="font-size:11px;">
                    </div>
                </div>
                
            </div>
        </nav>
