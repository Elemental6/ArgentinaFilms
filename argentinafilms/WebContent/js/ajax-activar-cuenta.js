function ActivarCuenta(){

        $.post('ActivarCuenta', {

            txtCodActivacion: $('#txtCodActivacion').val(),
            usuarioConfirmacion: $('#usuarioConfirmacion').val()

        }, function (data) {

            if (data == "codInvalido")

                swal({
                    title: "Registro erróneo",
                    text: "El código es erróneo. Reintentá por favor",
                    type: "error"
                })


            if(data== "codValido")

                swal({
                    title: "Registro exitoso",
                    text: "Tu cuenta ha sido activada con éxito. Ya podés agregar películas, public reseñas, comentar y mucho más!",
                    type: "success"
                }, function () {
                      window.location.href = 'Inicio.jsp';
                  });



        })
}