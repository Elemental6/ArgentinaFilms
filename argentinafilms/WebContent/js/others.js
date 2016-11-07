function hideTrailer(){
	document.getElementById("cboxOverlay").style.display = 'none';
	document.getElementById("colorbox").style.display = 'none';
    document.getElementById("cboxLoadedContent").innerHTML="";
}

function showTrailer(id){
	var theIframe = document.createElement("iframe");
	theIframe.src = '//www.youtube.com/embed/'+id+'?rel=0&amp;wmode=transparent';
	theIframe.className = "cboxIframe";
	var element = document.getElementById("cboxLoadedContent");
	element.appendChild(theIframe);
	document.getElementById("cboxOverlay").style.display = 'block';
	document.getElementById("colorbox").style.display = 'block';
}