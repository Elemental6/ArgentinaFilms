function AceptarPelicula(idPelicula) {

	swal(
			{
				title : "Est\u00E1s seguro de aceptar esta petici\u00F3n de Pel\u00EDcula?",
				type : "warning",
				showCancelButton : true,
				confirmButtonColor : "#DD6B55",
				confirmButtonText : "Si, aceptar",
				closeOnConfirm : true
			}, function() {

				$.post('AceptarPeticionPelicula', {

					idSeleccionado : idPelicula

				}, function(data) {

					$("#fila" + idPelicula).hide();
					sweetAlert("Petici\u00F3n de pel\u00EDcula aceptada", "La petici\u00F3n fue aceptada", "success");
				})

			});

}

function RechazarPelicula(idPelicula) {
	swal(
			{
				title : "Est\u00E1s seguro de rechazar esta petici\u00F3n de pel\u00EDcula?",
				text : "No podr\u00E1s deshacer esta opci\u00F3n!",
				type : "warning",
				showCancelButton : true,
				confirmButtonColor : "#DD6B55",
				confirmButtonText : "Si, rechazar",
				closeOnConfirm : true
			}, function() {

				$.post('RechazarPeticionPelicula', {

					idSeleccionado : idPelicula

				}, function(data) {

					$("#fila" + idPelicula).hide();
					sweetAlert("Pelicula rechazada", "La petición fue rechazada", "error");
				})

			});
}



function AceptarActor(idActor) {

	swal(
			{
				title : "Est\u00E1s seguro de aceptar esta petici\u00F3n de Actor?",
				type : "warning",
				showCancelButton : true,
				confirmButtonColor : "#DD6B55",
				confirmButtonText : "Si, aceptar",
				closeOnConfirm : true
			}, function() {
	
	$.post('AceptarPeticionActor', {

		idSeleccionado : idActor

	}, function(data) {

		$("#fila" + idActor).hide();

	})
});
}


function RechazarActor(idActor) {
	swal({
		title : "Est\u00E1s seguro de rechazar esta petici\u00F3n de Actor?",
		text : "No podr\u00E1s deshacer esta opci\u00F3n!",
		type : "warning",
		showCancelButton : true,
		confirmButtonColor : "#DD6B55",
		confirmButtonText : "Si, rechazar",
		closeOnConfirm : true
	}, function() {

		$.post('RechazarPeticionActor', {

			idSeleccionado : idActor

		}, function(data) {

			$("#fila" + idActor).hide();

		})

	})
	
}
	
	
function AceptarDirector(idDirector) {
	
	swal(
			{
				title : "Est\u00E1s seguro de aceptar esta petici\u00F3n de Director?",
				type : "warning",
				showCancelButton : true,
				confirmButtonColor : "#DD6B55",
				confirmButtonText : "Si, aceptar",
				closeOnConfirm : true
			}, function() {	

		$.post('AceptarPeticionDirector', {

			idSeleccionado : idDirector

		}, function(data) {

			$("#fila" + idDirector).hide();

		})
	});
}

	function RechazarDirector(idDirector) {
		swal({
			title : "Est\u00E1s seguro de rechazar esta petici\u00F3n de Director?",
			text : "No podr\u00E1s deshacer esta opci\u00F3n!",
			type : "warning",
			showCancelButton : true,
			confirmButtonColor : "#DD6B55",
			confirmButtonText : "Si, rechazar",
			closeOnConfirm : true
		}, function() {

			$.post('RechazarPeticionDirector', {

				idSeleccionado : idActor

			}, function(data) {

				$("#fila" + idDirector).hide();

			})

		})
	
	
}