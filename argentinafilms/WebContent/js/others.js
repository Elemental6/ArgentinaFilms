function hideTrailer(){
	document.getElementById("cboxOverlay").style.display = 'none';
	document.getElementById("colorbox").style.display = 'none';
    document.getElementById("cboxLoadedContent").innerHTML="";
}

function showTrailer(id){
	var theIframe = document.createElement("iframe");
	theIframe.src = '//www.youtube.com/embed/'+id+'?rel=0&amp;wmode=transparent';
	theIframe.className = "cboxIframe";
	theIframe.setAttribute('allowFullScreen', '');
	var element = document.getElementById("cboxLoadedContent");
	element.appendChild(theIframe);
	document.getElementById("cboxOverlay").style.display = 'block';
	document.getElementById("colorbox").style.display = 'block';
}

function showPeliculas(){
	document.getElementById("peliculas-section").style.display = 'block';
	document.getElementById("resenias-section").style.display = 'none';
	document.getElementById("li-nav-one").className = "hide-for-owner";
	document.getElementById("li-nav-two").className = "selected";
}

function showResenias(){
	document.getElementById("resenias-section").style.display = 'block';
	document.getElementById("peliculas-section").style.display = 'none';
	document.getElementById("li-nav-two").className = "hide-for-owner";
	document.getElementById("li-nav-one").className = "selected";
}

function cancelarAvatar(){
	$("#cancelarAvatar").prop('style', 'display:none;');
	 
	$("#menu_image").attr("src","blank");
    $("#menu_image").hide();  
    $('#menu_images').wrap('<form>').closest('form').get(0).reset();
    $('#menu_images').unwrap(); 
}