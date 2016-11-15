
function cargarActores() {
	 $.get('ServletCompletarActores',  function(responseText) {
     	var jsonObj =jQuery.parseJSON(responseText);
     	$('#completarActores').append( '<option value="">'+" Elija una opción" + '</option>');
             for (i = 0; i < jsonObj.length; i++)
             { 
                  
                 		 $('#completarActores').append( '<option value="'+jsonObj[i].id_actor+'">'+jsonObj[i].apellido +" - "+jsonObj[i].nombre + '</option>');
             }
 
});
}

function cargarGeneros() {
	
	 $.get('ServletCargarGenero',  function(responseText) {
	     	var jsonObj =jQuery.parseJSON(responseText);
	     	$('#completarGeneros').append( '<option value="">'+" Elija una opción" + '</option>');
	             for (i = 0; i < jsonObj.length; i++)
	             { 
	                  
	                 		 $('#completarGeneros').append( '<option value="'+jsonObj[i].genero_id+'">'+jsonObj[i].genero+'</option>');
	             }
	 
	});
}

function cargarDirectores() {
	
	 $.get('ServletCargarDirector',  function(responseText) {
	     	var jsonObj =jQuery.parseJSON(responseText);
	     	$('#completarDirectores').append( '<option value="">'+" Elija una opción" + '</option>');
	             for (i = 0; i < jsonObj.length; i++)
	             { 
	                  
	                 		 $('#completarDirectores').append( '<option value="'+jsonObj[i].id_director+'">'+jsonObj[i].apellido +" - "+jsonObj[i].nombre+ '</option>');
	             }
	 
	});
}


$(document).ready(function() {
	 cargarActores();
	 cargarGeneros()   
     cargarDirectores()
     
     
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
