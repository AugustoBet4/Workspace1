$(document).ready(function() {
		$('table tr:even').addClass('alt');
		$('table tbody tr').mouseover(function(){
			$(this).addClass('over');
		});
		$('table tr').mouseout(function(){
			$(this).removeClass('over');
		});
});
