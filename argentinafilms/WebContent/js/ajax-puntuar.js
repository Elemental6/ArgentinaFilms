function PuntuarPelicula(puntuacionSeleccionada, idPel){
	
	$("#star-rating").removeClass("star-rating").addClass("star-rating-voted");
	
	$("#oneStar").prop('style',null);
	$("#twoStars").prop('style',null);
	$("#threeStars").prop('style',null);
	$("#fourStars").prop('style',null);
	$("#fiveStars").prop('style',null);
	
	$("#oneStar").prop('onclick',null).off('click');
	$("#twoStars").prop('onclick',null).off('click');
	$("#threeStars").prop('onclick',null).off('click');
	$("#fourStars").prop('onclick',null).off('click');
	$("#fiveeStars").prop('onclick',null).off('click');
	
	var nuevaPuntuacion = +('#puntTotal').text + +puntuacionSeleccionada;
	
    $('#puntTotal').text(nuevaPuntuacion);
	
	if(puntuacionSeleccionada == 1){
		$("#oneStar").css('color', '#f39c12');
	}
	
	if(puntuacionSeleccionada == 2){
		$("#oneStar").css('color', '#f39c12');
		$("#twoStars").css('color', '#f39c12');
	}

	if(puntuacionSeleccionada == 3){
		$("#oneStar").css('color', '#f39c12');
		$("#twoStars").css('color', '#f39c12');
		$("#threeStars").css('color', '#f39c12');
	}

	if(puntuacionSeleccionada == 4){
		$("#oneStar").css('color', '#f39c12');
		$("#twoStars").css('color', '#f39c12');
		$("#threeStars").css('color', '#f39c12');
		$("#fourStars").css('color', '#f39c12');
	}

	if(puntuacionSeleccionada == 5){
		$("#oneStar").css('color', '#f39c12');
		$("#twoStars").css('color', '#f39c12');
		$("#threeStars").css('color', '#f39c12');
		$("#fourStars").css('color', '#f39c12');
		$("#iveStars").css('color', '#f39c12');
	}
	
    $.post('ServletRegistrarPuntaje', {

        puntuacion: puntuacionSeleccionada,
        id_pelicula: idPel
        


    }, function (data) {
       
    	

    })
	
	
}
