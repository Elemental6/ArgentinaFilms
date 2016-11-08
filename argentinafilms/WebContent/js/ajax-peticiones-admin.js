function AceptarPelicula(idPelicula){
	
    $.post('AceptarPeticionPelicula', {

        idSeleccionado: idPelicula


    }, function (data) {
       
    	$("#fila" + idPelicula).hide();

    })
	
	
}




function RechazarPelicula(idPelicula){
	swal({
		  title: "Est\u00E1s seguro de rechazar esta petici\u00F3n de Pel\u00EDcula?",
		  text: "No podr\u00E1s deshacer esta opci\u00F3n!",
		  type: "warning",
		  showCancelButton: true,
		  confirmButtonColor: "#DD6B55",
		  confirmButtonText: "Si, rechazar",
		  closeOnConfirm: true
		},
		function(){
			
			
			$.post('RechazarPeticionPelicula', {

		        idSeleccionado: idPelicula


		    }, function (data) {
		       
		    	$("#fila" + idPelicula).hide();

		    })
			
			
		  
		});
}