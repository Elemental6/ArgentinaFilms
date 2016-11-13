package presentation;

import java.io.IOException;

import javax.mail.MessagingException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Usuarios;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import service.ServiceUsuario;
import util.MailService;

@SuppressWarnings("serial")
@WebServlet("/ReenviarMailActivacion")
public class ServletReenviarMailActivacion extends HttpServlet {

	public ServiceUsuario serviceUsuario = null;

	@Override
	public void init(ServletConfig config) {
		WebApplicationContext context = WebApplicationContextUtils
				.getRequiredWebApplicationContext(config.getServletContext());
		this.serviceUsuario = (ServiceUsuario) context.getBean(ServiceUsuario.class);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Usuarios usuario = (Usuarios) request.getSession().getAttribute("userLogueado");

		MailService mailService = new MailService();
		try {
			//* modificar el mail para forzar la excepción*/
			mailService.Enviar("argentinafilms2016@gmail.com", "primavera322", usuario.getEmail(),
					"Confirmación de registro en Argentina Films",

					"<h4 style=\"text-align: center;\">"
							+ "<img src=\"https://68.media.tumblr.com/2977aa25fe30dab5c35a67f0eb3b4424/tumblr_ofzmu7O1eu1tq5qvgo1_400.png\""
							+ "alt=\"\" width=\"320\" height=\"92\" /></h4>"
							+ "<h4 style=\"text-align: center;\">Estimado " + "<strong><span style=\"color: #008000;\">"
							+ usuario.getUsuario() + "</span>:</strong></h4>"
							+ "<h4 style=\"text-align: center;\">Gracias por registrarte "
							+ "en <span style=\"color: #008000;\"><strong>Argentina Films</strong></span>. "
							+ "Este es tu código de confirmación para poder activar tu cuenta:</h4>"
							+ "<h2 style=\"text-align: center;\"><span style=\"text-decoration: underline; color: #000000;\">"
							+ "<strong>" + usuario.getCodActivacion() + "</strong></span></h2>"
							+ "<h4 style=\"text-align: center;\"><br />Por favor aseg&uacute;rate de no agregar espacios extras.</h4>"
							+ "<h4 style=\"text-align: center;\">Si a&uacute;n est&aacute;s teniendo problemas para activar tu cuenta, "
							+ "por favor contact&aacute; a un miembro de nuestro personal de soporte en argentinafilms2016@info.<wbr />com</h4>"
							+ "<h4 style=\"text-align: center;\">Saludos cordiales.</h4> "
							+ "<h4 style=\"text-align: center;\">Equipo de Argentina Films</h4>");
		} catch (MessagingException e) {
			request.setAttribute("tipoMensaje", "alert alert-dismissable alert-danger");
			request.setAttribute("Mensajedismisable",
					"<a class=\"close\" data-dismiss=\"alert\" aria-label=\"close\">&times;</a>");
			request.setAttribute("mensajeResultado",
					"Servicio de mail no disponible, intentá denuevo o logueate y disfrutá");
			request.getRequestDispatcher("/ActivarCuenta.jsp").forward(request, response);
			return;
		}

		HttpSession sesion = request.getSession(true);
		sesion.setAttribute("emailConfirmacion", usuario.getEmail());
		sesion.setAttribute("usuarioConfirmacion", usuario.getUsuario());

		request.getRequestDispatcher("/ActivarCuenta.jsp").forward(request, response);

	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

}
