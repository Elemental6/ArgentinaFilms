
function cargarActores() {
	 $.get('ServletCompletarActores',  function(responseText) {
     	var jsonObj =jQuery.parseJSON(responseText);
     	$('#completarActores').append( '<option value="">'+"Seleccione los actores" + '</option>');
             for (i = 0; i < jsonObj.length; i++)
             { 
                  
                 		 $('#completarActores').append( '<option value="'+jsonObj[i].id_actor+'">'+jsonObj[i].apellido +" - "+jsonObj[i].nombre + '</option>');
             }
 
});
}

function cargarGeneros() {
	
	 $.get('ServletCargarGenero',  function(responseText) {
	     	var jsonObj =jQuery.parseJSON(responseText);
	     	$('#completarGeneros').append( '<option value="">'+"Seleccione el Genero" + '</option>');
	             for (i = 0; i < jsonObj.length; i++)
	             { 
	                  
	                 		 $('#completarGeneros').append( '<option value="'+jsonObj[i].genero_id+'">'+jsonObj[i].genero+'</option>');
	             }
	 
	});
}

function cargarDirectores() {
	
	 $.get('ServletCargarDirector',  function(responseText) {
	     	var jsonObj =jQuery.parseJSON(responseText);
	     	$('#completarDirectores').append( '<option value="">'+"Seleccione el director" + '</option>');
	             for (i = 0; i < jsonObj.length; i++)
	             { 
	                  
	                 		 $('#completarDirectores').append( '<option value="'+jsonObj[i].id_director+'">'+jsonObj[i].apellido +" - "+jsonObj[i].nombre+ '</option>');
	             }
	 
	});
}


function getParameterByName(name) {
    name = name.replace(/[\[]/, "\\[").replace(/[\]]/, "\\]");
    var regex = new RegExp("[\\?&]" + name + "=([^&#]*)"),
    results = regex.exec(location.search);
    return results === null ? "" : decodeURIComponent(results[1].replace(/\+/g, " "));
}


$(document).ready(function() {

	cargarActores();
	cargarGeneros();
	cargarDirectores();
	
	pelicula_id = getParameterByName("pelicula_id");
	
		//our country code was correct so we have some information to display
			$.post("ModificarPeliculaCargarDatos",
	                {
	                 id:pelicula_id
	                 
	             }).done(function( data ) {
	            	 var pelicula =jQuery.parseJSON(data);
	            	 
	            	 document.getElementById("txtnombre").value = pelicula.nombre
	            	 document.getElementById("txtanio").value = pelicula.anio
	            	 document.getElementById("txtDuracion").value = pelicula.duracion
	            	 document.getElementById("txtTrailer").value = pelicula.trailer

	            	 document.getElementById("txtAreaSynospsis").value = pelicula.synopsis
	            	 document.getElementById('completarGeneros').value = pelicula.genero.genero_id
	            	 document.getElementById('completarDirectores').value = pelicula.director.id_director
	            	 document.getElementById('id_pelicula_modificar').value = pelicula.id_pelicula
	      
	            	 var actores = pelicula.actores;
	            	 
	            	 for(var i in actores){
	            		 $('#ListActoresAgregados').html($('#ListActoresAgregados').html() + '<li class="list-group-item list-group-item-warning">'+actores[i].nombre +" - "+actores[i].apellido +'</li>');
		     			 $("#lblActoresIds").val($("#lblActoresIds").val() + actores[i].id_actor+"-");
		     		}
		     			
	            	
	            	 
	            	 
	            	 
	             });
	         

			
			 
		     $("#lblActoresEliminar").on( "click", function() {
		    	 $("#lblActoresIds").val("") ;
		    	 $('#ListActoresAgregados').empty() ;
		     });
			
		
			 $("#lblActores").on( "click", function() {
			     	if($('#completarActores').val() != ""){
			     		
			     		if( $("#lblActoresIds").val() == ""){
			     			$('#ListActoresAgregados').html($('#ListActoresAgregados').html() + '<li class="list-group-item list-group-item-warning">'+$("#completarActores option:selected").text()+'</li>');
			     			 $("#lblActoresIds").val($("#completarActores option:selected").val()+"-");
			     		}
			     		else{
			     			var id = $("#lblActoresIds").val();
			     			var x = $("#lblActoresIds").val();
			     			var listIds =x.split('-');
			     			var flag = false;
			     			for(var i in listIds){
			     				if(listIds[i] == $("#completarActores option:selected").val()){
			     				flag = true;
			     			}
			     			}
			     					if(flag == false){
			              			 $("#lblActoresIds").val(id + $('#completarActores option:selected').val()+"-");
			              			$('#ListActoresAgregados').html($('#ListActoresAgregados').html() + '<li class="list-group-item list-group-item-warning">'+$("#completarActores option:selected").text()+'</li>');
			     				  }
			     		}
			     			}
			     	
			     });
			
			
		});