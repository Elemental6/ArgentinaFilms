$(document).ready(function() {
	$('#inputBuscarPelicula').on('keypress', function (e) {
		if (e.which == 13) {
	        document.location.href = "resultados.jsp?buscar=" + $('#inputBuscarPelicula').val(); 
	    }
	});

});