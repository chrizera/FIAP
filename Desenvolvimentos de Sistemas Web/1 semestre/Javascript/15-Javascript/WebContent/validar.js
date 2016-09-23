function validarCliente(){
	/*var n = document.getElementById("");
	if(n.value==""){
		
	}*/
	var ok = true;
	
	if(nome.value == ""){//nome é o id
		nome.style.border = "1px solid red";
		ok = false;
	}
	else {
		nome.style.border = "1px solid silver";
	}
	
	var padraoEmail = /^(([A-Za-z0-9]+_+)|([A-Za-z0-9]+\-+)|([A-Za-z0-9]+\.+)|([A-Za-z0-9]+\++))*[A-Za-z0-9]+@((\w+\-+)|(\w+\.))*\w{1,63}\.[a-zA-Z]{2,6}$/;	
	if(email.value == "" || !padraoEmail.test(email.value)){
		email.style.border = "1px solid red";
		ok = false;
	}
	else {
		email.style.border = "1px solid silver";
	}
	
	var padraoData = /^((0?[1-9]|[12]\d)\/(0?[1-9]|1[0-2])|30\/(0?[13-9]|1[0-2])|31\/(0?[13578]|1[02]))\/(19|20)?\d{2}$/;
	if(data.value == "" || !padraoData.test(data.value)){
		data.style.border = "1px solid red";
		ok = false;
	}
	else {
		data.style.border = "1px solid silver";
	}
	
	if(estado.value == ""){
		estado.style.border = "1px solid red";
		ok = false;
	}
	else {
		estado.style.border = "1px solid silver";
	}
	
	if(masc.checked == false && fem.checked == false){
		ok = false;
		labelMasc.style.color = "red";
		labelFem.style.color = "red";
	}
	else {
		labelMasc.style.color = "black";
		labelFem.style.color = "black";
	}
	

	
	return ok;
}
function validarCampo(campo){
	if(campo.value == ""){
			campo.style.border = "1px solid red";
	}
	else {
		campo.style.border = "1px solid silver";
	}
	if(campo.checked == true){
		labelMasc.style.color = "black";
		labelFem.style.color = "black";
	}
var padraoData = /^((0?[1-9]|[12]\d)\/(0?[1-9]|1[0-2])|30\/(0?[13-9]|1[0-2])|31\/(0?[13578]|1[02]))\/(19|20)?\d{2}$/;
	
	if(!padraoData.test(data.value)){
		dataVerificar.innerHTML = "Digite no padrão xx/xx/xxxx";
		dataVerificar.style.color = "red"; 
		data.style.border = "1px solid red";
		
	}
	else {
		dataVerificar.innerHTML = "";
	}
	
var padraoEmail = /^(([A-Za-z0-9]+_+)|([A-Za-z0-9]+\-+)|([A-Za-z0-9]+\.+)|([A-Za-z0-9]+\++))*[A-Za-z0-9]+@((\w+\-+)|(\w+\.))*\w{1,63}