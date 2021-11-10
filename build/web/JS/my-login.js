$(function() {
	//mostrar contraseña
	$("input[type='password'][data-eye]").each(function(i) {
		var $this = $(this),
			id = 'eye-password-' + i,
			el = $('#' + id);

		$this.wrap($("<div/>", {
			style: 'position:relative',
			id: id
		}));

		$this.css({
			paddingRight: 60
		});
		$this.after($("<div/>", {
			html: 'Mostrar',
			class: 'btn btn-primary btn-sm',
			id: 'passeye-toggle-'+i,
		}).css({
				position: 'absolute',
				right: 10,
				top: ($this.outerHeight() / 2) - 12,
				padding: '2px 7px',
				fontSize: 12,
				cursor: 'pointer',
		}));

		$this.after($("<input/>", {
			type: 'hidden',
			id: 'passeye-' + i
		}));

		var invalid_feedback = $this.parent().parent().find('.invalid-feedback');

		if(invalid_feedback.length) {
			$this.after(invalid_feedback.clone());
		}

		$this.on("keyup paste", function() {
			$("#passeye-"+i).val($(this).val());
		});
		$("#passeye-toggle-"+i).on("click", function() {
			if($this.hasClass("mostrar")) {
				$this.attr('type', 'password');
				$this.removeClass("mostrar");
				$(this).removeClass("btn-outline-primary");
			}else{
				$this.attr('type', 'text');
				$this.val($("#passeye-"+i).val());				
				$this.addClass("mostrar");
				$(this).addClass("btn-outline-primary");
			}
		});
	});
        
        
        //validacion de campos
	$(".my-login-validation").submit(function() {
		var form = $(this);
        if (form[0].checkValidity() === false) {
          event.preventDefault();
          event.stopPropagation();
        }
		form.addClass('was-validated');
	});
        
        $.validator.addMethod("formAlphanumeric", function(value, element) {
            var pattern = /^[a-zA-Z ]+/;
            return this.optional(element) || pattern.test(value);
        }, "Solo puede ingresar letras");

        $.validator.addMethod("formEmail", function(value, element) {
            var pattern = /^([a-zA-Z0-9_.-])+@([a-zA-Z0-9_.-])+\.([a-zA-Z])+([a-zA-Z])+/;
            return this.optional(element) || pattern.test(value);
        }, "Formato del email incorrecto ejemplo:pepito@gmail.com");


        $("#basic-form").validate({
            rules: {
                textNombre:{
                    required: true,
                    formAlphanumeric: true,
                    minlength: 2
                },
                
                textApellido:{
                    required: true,
                    formAlphanumeric: true,
                    minlength: 2
                },
                textDireccion:{
                    required: true
                },
                textTelefono:{
                    required: true,
                    min: 1000000,
                    max:9000000000
                },
                
                textCorreo: {
                    required: true,
                    formEmail: true,
                    email: true

                },
                textEstado:{
                   required: true 
                },
                agree:{
                    required: true
                },
                /*Formulario detalle orden*/
                textCantidad:{
                    required: true
                },
                textTalla:{
                    required: true
                },
                textIdOrdenFK:{
                    required: true
                },
                textIdPrendaFK:{
                    required: true
                },
                /*formulario orden*/
                 textFecha:{
                    required: true
                },
                /*formulario prenda*/
                textImagenPrenda:{
                    required:true
                },
                textNombrePrenda:{
                    required: true,
                    maxlength:15,
                    minlength:2,
                    formAlphanumeric: true
                },
                textDescripcionPrenda:{
                    required: true,
                    maxlength:250,
                    minlength:2
                },
                textIdTipoPrendaFK:{
                  required: true
                },
                textPrecio:{
                  required: true,
                  min:10000
                },
                textEstadoPrenda:{
                  required:true
                },
                /*formulario proceso*/
                textDescripcion:{
                  required: true,  
                  maxlength:200,
                  minlength:2
                },
                textFechaProceso:{
                  required: true 
                },
                textHorai:{
                  required: true,
                  min:"07:00",
                  max:"16:00"
                },
                textHoraf:{
                  required: true,
                  min:"07:00",
                  max:"16:00"  
                },
                textPrendasr:{
                  required: true  
                },
                textAsig:{
                  required: true  
                },
                /*formulario de asignar*/
                textCantidadAsignar:{
                  required: true,
                  min:10,
                  max:20  
                },
                textFechaInicio:{
                  required: true   
                },
                textFechaFin:{
                  required: true    
                },
                textIdDatos:{
                  required: true    
                },
                textIdDetalleOrdenFK:{
                  required: true     
                },
                /*login-registro*/
                textUsuario:{
                    required: true,
                    formAlphanumeric: true
                },
                textClave:{
                    required: true
                },
                textClave2:{
                    required:true,
                    equalTo:'#clave'
                },
                textCargo:{
                    required:true
                }
            },
            messages: {
                textNombre: {
                    required: "Por favor ingrese su nombre",
                    minlength: "El nombre debe ser mayor a 2 caracteres"

                },
                textApellido: {
                    required: "Por favor ingrese su apellido",
                    minlength: "El nombre debe ser mayor a 2 caracteres"

                },
                textDireccion:{
                   required: "Por favor ingrese su dirección"
                },
                textTelefono: {
                    required: "Por favor ingrese su número telefonico",
                    min: "Debe contener minimo 7 números",
                    max: "Máximo 10 números"
                },
                textCorreo: {
                    required: "Por favor ingrese su correo",
                    email: "El correo debe tener el formato: abc@hotmail.com"
                    
                },
                textEstado:{
                    required: "Elija un estado",
                },
                agree:{
                    required: " "
                },
                /*formulario detalle orden*/
                textCantidad:{
                    required:"Ingrese la cantidad de prenda"
                },
                textTalla:{
                    required:"Ingrese la talla de la prenda"
                },
                textIdOrdenFK:{
                    required:"Ingrese la el id de la orden"
                },
                textIdPrendaFK:{
                  required:"Ingrese la el id de la prenda"  
                },
                /*formulario de orden*/
                textFecha:{
                     required:"Ingrese la fecha de la orden" 
                },
                textIdDato:{
                    required:"Ingrese la persona" 
                },
                /*formulario prenda*/
                textImagenPrenda:{
                   required:"Ingrese la imagen de la prenda"  
                },
                textNombrePrenda:{
                   required:"Ingrese el nombre de la prenda",
                   maxlength:"Solo puede ingresar 15 caracteres",
                   minlength: "El nombre debe ser mayor a 2 caracteres"
                },
                 textDescripcionPrenda:{
                   required:"Ingrese la descripción de la prenda",
                   maxlength:"Solo puede ingresar 250 caracteres",
                   minlength: "El nombre debe ser mayor a 2 caracteres"
                },
                textIdTipoPrendaFK:{
                  required:"Seleccione algun tipo de prenda"
                },
                textPrecio:{
                  required:"Ingrese el precio de la prenda",
                  min:"El valor minimo es de 10000"
                },
                textEstadoPrenda:{
                  required:"Ingrese el estado de la prenda"  
                },
                /*formulario proceso*/
                textDescripcion:{
                   required:"Ingrese la descripción del proceso",
                   maxlength:"Solo puede ingresar 200 caracteres",
                   minlength: "La descripción debe ser mayor a 2 caracteres"
                },
                textFechaProceso:{
                    required:"Ingrese la fecha del proceso"
                },
                textHorai:{
                  required:"Ingrese la hora inicial del proceso",
                  min:"Ingrese un valor mayor o igual a 7:00",
                  max:"Ingrese un valor menor o gual a 16:00"
                },
                textHoraf:{
                  required:"Ingrese la hora final del proceso",
                  min:"Ingrese un valor mayor o igual a 7:00",
                  max:"Ingrese un valor menor o gual a 16:00"
                },
                textPrendasr:{
                  required:"Ingrese las prendas realizadas"  
                },
                textAsig:{
                  required:"Ingrese la asignacion"   
                },
                /*formulario de asignar*/
                textCantidadAsignar:{
                  required:"Ingrese la cantidad a asignar",
                  min:"Ingrese un valor mayor o igual a 10",
                  max:"Ingrese un valor menor o igual a 20" 
                },
                 textFechaInicio:{
                  required:"Ingrese la fecha de inicio"   
                 },
                 textFechaFin:{
                  required:"Ingrese la fecha de final"     
                 },
                 /*Orden*/
                 textIdDatos:{
                  required:"Ingrese el empleado"    
                 },
                 textIdDetalleOrdenFK:{
                  required:"Ingrese el detalle que desarrollara"    
                 },
                 /*registro*/
                 textUsuario:{
                  required:"Debe ingresar un usuario"
                 },
                 textClave:{
                  required:"Debe ingresar una contraseña"     
                 },
                 textClave2:{
                  required:"El campo es requerido",
                  equalTo:"La contraseña debe ser igual a la anterior"
                 },
                
                 textCargo:{
                  required:"Debe ingresar un cargo"    
                 }
            }

        });
      
        
        
	
        
      

});
