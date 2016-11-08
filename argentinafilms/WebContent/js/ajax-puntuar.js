function PuntuarPelicula(puntuacionSeleccionada, idPel){
	
    $.post('ServletRegistrarPuntaje', {

        puntuacion: puntuacionSeleccionada,
        id_pelicula: idPel
        


    }, function (data) {
       
    	

    })
	
	
}
