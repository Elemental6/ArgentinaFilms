function PuntuarPelicula(puntuacionSeleccionada, idPel){
	
	$("#oneStar").prop('onclick',null);
	$("#twoStars").prop('onclick',null);
	$("#threeStars").prop('onclick',null);
	$("#fourStars").prop('onclick',null);
	$("#fiveStars").prop('onclick',null);
	
	
	
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
	$("#fiveStars").prop('onclick',null).off('click');
	
	
//--------------------------------------------------------
	var puntSeleccionadaInt = parseInt(puntuacionSeleccionada);
	var puntTotal = parseInt($("#puntTotalActual").attr("totalpuntos"))+puntSeleccionadaInt;
	var puntCount = parseInt($("#puntTotalActual").attr("countpuntos"))+1;
	var puntTotalActual = Math.round((5*(100 * puntTotal)/(puntCount*5))/100);
	

	$('#puntTotalActual').text(puntTotalActual+'/5 ('+puntCount+' votos)');
//---------------------------------------------------------

	if(puntuacionSeleccionada == 1){
		$("#oneStar").css('color', '#FFFF00');
	}
	
	if(puntuacionSeleccionada == 2){
		$("#oneStar").css('color', '#FFFF00');
		$("#twoStars").css('color', '#FFFF00');
	}

	if(puntuacionSeleccionada == 3){
		$("#oneStar").css('color', '#FFFF00');
		$("#twoStars").css('color', '#FFFF00');
		$("#threeStars").css('color', '#FFFF00');
	}

	if(puntuacionSeleccionada == 4){
		$("#oneStar").css('color', '#FFFF00');
		$("#twoStars").css('color', '#FFFF00');
		$("#threeStars").css('color', '#FFFF00');
		$("#fourStars").css('color', '#FFFF00');
	}

	if(puntuacionSeleccionada == 5){
		$("#oneStar").css('color', '#FFFF00');
		$("#twoStars").css('color', '#FFFF00');
		$("#threeStars").css('color', '#FFFF00');
		$("#fourStars").css('color', '#FFFF00');
		$("#fiveStars").css('color', '#FFFF00');
	}
	
    $.post('ServletRegistrarPuntaje', {

        puntuacion: puntuacionSeleccionada,
        id_pelicula: idPel
        


    }, function (data) {
       
    	

    })
	
	
}
