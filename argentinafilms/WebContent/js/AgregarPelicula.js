
function cargarActores() {
	 $.get('ServletCompletarActores',  function(responseText) {
     	var jsonObj =jQuery.parseJSON(responseText);
             
             for (i = 0; i < jsonObj.length; i++)
             { 
                  
                 		 $('#completarActores').append( '<option value="'+jsonObj[i].id_actor+'">'+jsonObj[i].apellido +", "+jsonObj[i].nombre+" - Edad: " +jsonObj[i].edad +" años" + '</option>');
             }
 
});
}

function cargarGeneros() {
	
	 $.get('ServletCargarGenero',  function(responseText) {
	     	var jsonObj =jQuery.parseJSON(responseText);
	             
	             for (i = 0; i < jsonObj.length; i++)
	             { 
	                  
	                 		 $('#completarGeneros').append( '<option value="'+jsonObj[i].genero_id+'">'+jsonObj[i].genero+'</option>');
	             }
	 
	});
}

function cargarDirectores() {
	
	 $.get('ServletCargarDirector',  function(responseText) {
	     	var jsonObj =jQuery.parseJSON(responseText);
	             
	             for (i = 0; i < jsonObj.length; i++)
	             { 
	                  
	                 		 $('#completarDirectores').append( '<option value="'+jsonObj[i].id_director+'">'+jsonObj[i].apellido +", "+jsonObj[i].nombre+" - Edad: " +jsonObj[i].edad +" años" + '</option>');
	             }
	 
	});
}

function cargarAños() {
	
	var año = new Date().getFullYear()
	for (i = año.Tostring(); i < cars.length; i++) { 
    text += cars[i] + "<br>";
}
	
}



$(document).ready(function() {
	 cargarActores();
	 cargarGeneros()   
     cargarDirectores()
     
});
