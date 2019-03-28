window.onload = function(){
	console.log('loaded js page!');
	//make sure you have jquery!
	
	$('#employee').on('click', loadEmplHome);
}



function loadEmplHome(){
	/*
	 * In this function, we will create an AJAX request that will send 
	 * a request to a load view servlet (check examples), we will then 
	 * forward along our "partial" (basically an HTML page without the 
	 * metadata tags... only has exactly what we need - the form) and 
	 * replace the inner HTML of our "view" div with its contents 
	 * 
	 * 
	 * STEPS:'
	 * create a load view servlet
	 * test it in browser (send a request to the servlet, and make sure you see the HTML you want)
	 * then create AJAX req to it 
	 */
}