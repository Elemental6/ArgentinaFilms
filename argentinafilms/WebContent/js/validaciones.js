$( document ).ready(function() {
	document.getElementById("menu_images").onchange = function () {
	
	    var reader = new FileReader();
	    
	    if(this.files[0].type.indexOf("image")==-1){
	    	sweetAlert("S\u00F3lo se permiten im\u00E1genes", "El archivo seleccionado no es una imagen. S\u00F3lo se permiten im\u00E1genes. Reintente por favor.", "error");
	        $("#menu_image").attr("src","blank");
	        $("#menu_image").hide();  
	        $('#menu_images').wrap('<form>').closest('form').get(0).reset();
	        $('#menu_images').unwrap(); 
	        $("#cancelarAvatar").prop('style', 'display:none;');
	        return false;
	    }   
	    
	    if(this.files[0].size>528385){
	    	sweetAlert("Supera el l\u00EDmite", "La imagen seleccionada supera el l\u00EDmite de tama\u00F1o. S\u00F3lo se permiten im\u00E1genes hasta 500 kb. Reintente por favor.", "error");
	        $("#menu_image").attr("src","blank");
	        $("#menu_image").hide();  
	        $('#menu_images').wrap('<form>').closest('form').get(0).reset();
	        $('#menu_images').unwrap();    
	        $("#cancelarAvatar").prop('style', 'display:none;');
	        return false;
	    }
	    
	    reader.onload = function (e) {
	        // get loaded data and render thumbnail.
	        document.getElementById("menu_image").src = e.target.result;
	        $("#menu_image").show(); 
	    };
	
	    // read the image file as a data URL.
	    reader.readAsDataURL(this.files[0]);
	    
	    $("#cancelarAvatar").prop('style', 'color:yellow; font-weight: bold; cursor: pointer; display:inline;');
	};

	
});



function cancelarAvatar(){
	 $("#cancelarAvatar").prop('style', 'display:none;');
	 
	 $("#menu_image").attr("src","blank");
     $("#menu_image").hide();  
     $('#menu_images').wrap('<form>').closest('form').get(0).reset();
     $('#menu_images').unwrap(); 
}