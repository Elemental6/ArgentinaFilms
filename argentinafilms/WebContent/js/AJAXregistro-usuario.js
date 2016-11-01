function submitregistro() {

    //VALIDACION DE CAMPOS
    if ($('#txtPass1').val().length < 8) {
        sweetAlert("Contraseña inválida", "Las contraseña debe tener al menos 8 caracteres", "error");
        return;
    }


    if ($('#txtPass1').val() != $('#txtPass2').val()) {
        sweetAlert("Contraseña inválida", "Las contraseñas no coinciden", "error");
        return;
    }


    //LLAMADA AJAX
        $.post('RegistrarUsuario', {

            txtId: $('#txtId').val(),
            txtPass1: $('#txtPass1').val(),
            txtEmail: $('#txtEmail').val(),
            txtNombre: $('#txtNombre').val(),
            txtApellido: $('#txtApellido').val()

        }, function (data) {

            if (data == "UsuarioYaExiste")

                swal({
                    title: "Registro erróneo",
                    text: "El nombre de usuario ya está en uso. Usá otro por favor.",
                    type: "error"
                })


            if(data== "ok")

                swal({
                    title: "Registro exitoso",
                    text: "Ya podés iniciar sesión",
                    type: "success"
                }, function () {
                      window.location.href = 'Inicio.jsp';
                  });



        })

}