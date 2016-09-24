(function($){
$(function(){

//	var dat = {"Apple": null, "Microsoft": null, "Google": 'http://placehold.it/250x250'};
	var dat = {"":""};
	var timer;
	$('input.autocomplete').on('keydown', function(e){
		timer && clearTimeout(timer);
        timer = setTimeout(postData, 500);
	});
	
	function postData(){
		var text = $('input.autocomplete').val();
		if(text.length > 0){
			console.log(text);
			$.get("http://localhost:8080/user/search?name="+text, function(result, status){
				$.each(result, function(index, obj) {
					console.log(obj);
					dat[""+obj.name] = null;
				});
			});
		}		
	}

	$('.button-collapse').sideNav();

	$('input.autocomplete').autocomplete({
		data: dat }
	);

}); // end of document ready
})(jQuery); // end of jQuery name space