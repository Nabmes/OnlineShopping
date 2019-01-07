$(function(){
	//solving the active menu
	switch(menu){
	case 'About us':
		$('#about').addClass('active');
		break;
	
	case 'Contact us':
		$('#contact').addClass('active');
		break;
		
	default:
		$('#home').addClass('active');
		break;
	}
	
});