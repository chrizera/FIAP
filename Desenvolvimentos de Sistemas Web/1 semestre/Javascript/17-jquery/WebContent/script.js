$().ready(function(){
	$(".email").hide();
    
	
	
	$("#nao").click(function(){
		$(".email").slideUp();
	});
	$("#sim").click(function(){
		$(".email").slideDown();
	});
	$("button").click(function(){
		$("h1").slideToggle();
	});
});