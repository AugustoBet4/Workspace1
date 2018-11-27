$(document).ready(function() {
		$('table.lista tr:even').addClass('alt');
		$('table.lista tbody tr').mouseover(function(){
			$(this).addClass('over');
		});
		$('table.lista tr').mouseout(function(){
			$(this).removeClass('over');
		});
});
