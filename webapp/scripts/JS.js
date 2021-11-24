/**
 * 
 */
function validar(){
	let nome = frmNBanda.nome.value
	let genero = frmNBanda.genero.value
	if(nome===""){
		alert('O preencimento do campo nome é obrigatório')
		 frmNBanda.nome.focus()
	return false
	} else if (genero ===""){
		alert('O preencimento do campo gênero é obrigatório')
		 frmNBanda.genero.focus()
	return false
	}else{
		document.forms["frmNBanda"].submit()
	}
}