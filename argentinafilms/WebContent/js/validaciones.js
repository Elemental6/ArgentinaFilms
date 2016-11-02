function formRegistro() {

    //VALIDACION DE CAMPOS
    if ($('#txtPass1').val().length < 8) {
        sweetAlert("Contraseña inválida", "Las contraseña debe tener al menos 8 caracteres", "error");
        return;
    }


    if ($('#txtPass1').val() != $('#txtPass2').val()) {
        sweetAlert("Contraseña inválida", "Las contraseñas no coinciden", "error");
        return;
    }
}