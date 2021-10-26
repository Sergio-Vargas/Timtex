/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Acceder a los elementos

const form=document.getElementById('frm-usuario');
const campos=document.querySelectorAll('#frm-usuario input');
//console.log(form);
//console.log(campos);

const reglas = {
	textos: /^[a-zA-ZÀ-ÿ\s]{1,40}$/, // Letras y espacios, letras tildadas, diéresis, entre 1 y 40 caracteres.
	correo: /^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\.[a-zA-Z0-9-.]+$/,
	numeros: /^\d{7,10}$/ // solo números de 7 a 10 caracteres.
}


const validarInput=(regla,input,grupo)=>{
	if(regla.test(input.value)){
			document.getElementById(`g-${grupo}`).classList.remove('error');
			document.getElementById(`g-${grupo}`).classList.add('success');
			document.querySelector(`#g-${grupo} i`).classList.remove('fa-exclamation-circle');
			document.querySelector(`#g-${grupo} i`).classList.add('fa-check-circle');
			document.querySelector(`#g-${grupo} .msn-error`).classList.remove('msn-error-visible');
			
		}
		else{
			document.getElementById(`g-${grupo}`).classList.add('error');
			document.getElementById(`g-${grupo}`).classList.remove('success');
			document.querySelector(`#g-${grupo} i`).classList.add('fa-exclamation-circle');
			document.querySelector(`#g-${grupo} .msn-error`).classList.add('msn-error-visible');
			
		}
}



const validarCampos=(e)=>{
	//console.log("Se levantó una tecla en el input");
	//console.log(e.target.name);
	switch(e.target.name){


		case "textNombre":
			validarInput(reglas.textos,e.target,e.target.name);
		break;

		case "textApellido":
			validarInput(reglas.textos,e.target,e.target.name);
		break;

                case "textDireccion":
			validarInput(e.target,e.target.name);
		break;

                case "textTelefono":
			validarInput(reglas.numeros,e.target,e.target.name);
		break;

		case "textCorreo":
			validarInput(reglas.correo,e.target,e.target.name);
		break;

	}
	
}


form.addEventListener('submit',e=>{
	e.preventDefault();
	
});

campos.forEach((campo)=>{
//	console.log(campo);

campo.addEventListener('keyup',validarCampos);
campo.addEventListener('blur',validarCampos);

})