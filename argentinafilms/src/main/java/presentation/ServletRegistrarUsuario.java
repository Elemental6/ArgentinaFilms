package presentation;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.mail.MessagingException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Usuarios;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import service.ServiceUsuario;
import util.CodigoAleatorio;
import util.MailService;
import util.ValidarDatos;

@SuppressWarnings("serial")
@WebServlet("/RegistrarUsuario")
@MultipartConfig
public class ServletRegistrarUsuario extends HttpServlet {

	public ServiceUsuario serviceUsuario = null;

	String rutaAbsoluta = null;
	String rutaRelativa = "imgs/avatares";

	private static final int THRESHOLD_SIZE = 1024 * 1024 * 3; // 3MB
	private static final int MAX_FILE_SIZE = 1024 * 1024 * 40; // 40MB
	private static final int MAX_REQUEST_SIZE = 1024 * 1024 * 50; // 50MB

	@Override
	public void init(ServletConfig config) {
		WebApplicationContext context = WebApplicationContextUtils
				.getRequiredWebApplicationContext(config.getServletContext());
		this.serviceUsuario = (ServiceUsuario) context.getBean(ServiceUsuario.class);

		rutaAbsoluta = config.getServletContext().getRealPath(rutaRelativa);
	}

	@SuppressWarnings({ "unused", "rawtypes" })
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String nombreImagenAvatar = null;
		String avatar = null;
		String idIngresado = null;
		String passIngresado1 = null;
		String passIngresado2 = null;
		String nombreIngresado = null;
		String apellidoIngresado = null;
		String emailIngresado = null;

		// checks if the request actually contains upload file
		if (!ServletFileUpload.isMultipartContent(request)) {
			PrintWriter writer = response.getWriter();
			writer.println("Request does not contain upload data");
			writer.flush();
			return;
		}

		// configures upload settings
		DiskFileItemFactory factory = new DiskFileItemFactory();
		factory.setSizeThreshold(THRESHOLD_SIZE);
		factory.setRepository(new File(System.getProperty("java.io.tmpdir")));

		ServletFileUpload upload = new ServletFileUpload(factory);
		upload.setFileSizeMax(MAX_FILE_SIZE);
		upload.setSizeMax(MAX_REQUEST_SIZE);

		// constructs the directory path to store upload file
		// String uploadPath = getServletContext().getRealPath("")
		// + File.separator + UPLOAD_DIRECTORY;
		// // creates the directory if it does not exist
		// File uploadDir = new File(uploadPath);
		// if (!uploadDir.exists()) {
		// uploadDir.mkdir();
		// }

		try {
			// parses the request's content to extract file data
			List formItems = upload.parseRequest(request);
			Iterator iter = formItems.iterator();

			// iterates over form's fields
			while (iter.hasNext()) {
				FileItem item = (FileItem) iter.next();
				// processes only fields that are not form fields
				if (!item.isFormField()) {
					
					if ("file".equals(item.getFieldName())) {
				        if (item.getName() == null || item.getName().isEmpty()) {
				        	nombreImagenAvatar = "no-foto.png";
							avatar = rutaRelativa + "/" + nombreImagenAvatar;
				        }
					}
					
					else{
						nombreImagenAvatar = CodigoAleatorio.getCadenaAlfanumAleatoria(15) + ".jpg";
						avatar = rutaRelativa + "/" + nombreImagenAvatar;
	
						String fileName = new File(item.getName()).getName();
						// String filePath = uploadPath + File.separator + fileName;
						File storeFile = new File(rutaAbsoluta, nombreImagenAvatar);
	
						// saves the file on disk
						item.write(storeFile);
					}
				}

				else {
					if (item.getFieldName().equals("txtId")) {
						idIngresado = item.getString();
					}

					if (item.getFieldName().equals("txtPass1")) {
						passIngresado1 = item.getString();
					}

					if (item.getFieldName().equals("txtPass2")) {
						passIngresado2 = item.getString();
					}

					if (item.getFieldName().equals("txtNombre")) {
						nombreIngresado = item.getString();
					}

					if (item.getFieldName().equals("txtApellido")) {
						apellidoIngresado = item.getString();
					}

					if (item.getFieldName().equals("txtEmail")) {
						emailIngresado = item.getString();
					}
				}
			}
			System.out.println("Upload has been done successfully!");
		} catch (Exception ex) {
			System.out.println("There was an error: " + ex.getMessage());
		}

		
		// SubidaDeImagen.Subir(request, response, rutaAbsoluta,
		// nombreImagenAvatar);

		String codActivacion = CodigoAleatorio.getCadenaAlfanumAleatoria(15);

		// if (passIngresado1 == passIngresado2) {
		// request.setAttribute("tipoMensaje", "alert alert-dismissable
		// alert-danger");
		// request.setAttribute("mensajeResultado", "Las contraseñas no
		// coinciden. Reintente por favor.");
		// request.getRequestDispatcher("/Registrarse.jsp").forward(request,
		// response);
		// return;
		// }

		Usuarios usuario = new Usuarios();

		// RegEx
		String regExUsuario = "[a-zA-Z1-9_]{4,10}";
		String regExContrasenia = "[a-zA-Z0-9]{8,20}";
	
		// Validación usuario*/
		if (idIngresado.matches(regExUsuario)) {
			usuario.setUsuario(idIngresado);
		} else {
			request.setAttribute("tipoMensaje", "alert alert-danger alert-dismissible");
			request.setAttribute("Mensajedismisable", "<a class=\"close\" data-dismiss=\"alert\" aria-label=\"close\">&times;</a>");
			request.setAttribute("mensajeResultado", "El usuario solo puede contener de 4 a 10 números o letras. Reintente por favor.");
			request.getRequestDispatcher("/Registrarse.jsp").forward(request, response);
			return;
		}

		// usuario.setUsuario(idIngresado);

		// * Validación password*/
		if (passIngresado1.matches(regExContrasenia)) {
			if (passIngresado1 != passIngresado2) {
				usuario.setPass(passIngresado1);
			} else {
				request.setAttribute("tipoMensaje", "alert alert-dismissible alert-danger");
				request.setAttribute("Mensajedismisable", "<a class=\"close\" data-dismiss=\"alert\" aria-label=\"close\">&times;</a>");
				request.setAttribute("mensajeResultado", "Las contraseñas no coinciden. Reintente por favor.");
				request.getRequestDispatcher("/Registrarse.jsp").forward(request, response);
				return;
			}

		} else {
			request.setAttribute("tipoMensaje", "alert alert-dismissible alert-danger");
			request.setAttribute("Mensajedismisable", "<a class=\"close\" data-dismiss=\"alert\" aria-label=\"close\">&times;</a>");
			request.setAttribute("mensajeResultado", "La contraseña solo puede contener números o letras y debe ser 8 caracteres o mayor. Reintente por favor.");
			request.getRequestDispatcher("/Registrarse.jsp").forward(request, response);
			return;
		}
		
		// Validar nombre y apellido
		
		if (!ValidarDatos.validarNombresyApellidos(nombreIngresado)){
			request.setAttribute("tipoMensaje", "alert alert-dismissible alert-danger");
			request.setAttribute("Mensajedismisable", "<a class=\"close\" data-dismiss=\"alert\" aria-label=\"close\">&times;</a>");
			request.setAttribute("mensajeResultado", "Su nombre no permite caracteres especiales o numeros. Reintente por favor");
			request.getRequestDispatcher("/Registrarse.jsp").forward(request, response);
			return;
		}
		if (!ValidarDatos.validarNombresyApellidos(apellidoIngresado)){
			request.setAttribute("tipoMensaje", "alert alert-dismissible alert-danger");
			request.setAttribute("Mensajedismisable", "<a class=\"close\" data-dismiss=\"alert\" aria-label=\"close\">&times;</a>");
			request.setAttribute("mensajeResultado", "Su apellido no permite caracteres especiales o numeros. Reintente por favor");
			request.getRequestDispatcher("/Registrarse.jsp").forward(request, response);
			return;
		}
	
		// usuario.setPass(passIngresado1);
		usuario.setNombre(nombreIngresado);
		usuario.setApellido(apellidoIngresado);
		usuario.setEmail(emailIngresado);
		usuario.setRango("novato");
		usuario.setEstado(false);
		usuario.setAvatar(avatar);
		usuario.setCodActivacion(codActivacion);

		try {
			this.serviceUsuario.add(usuario);
		} catch (DataIntegrityViolationException e) {
			request.setAttribute("tipoMensaje", "alert alert-dismissable alert-danger");
			request.setAttribute("Mensajedismisable", "<a class=\"close\" data-dismiss=\"alert\" aria-label=\"close\">&times;</a>");
			request.setAttribute("mensajeResultado",
					"El nombre de usuario o e-mail ingresado no están disponibles. Reintente con otro nombre y otro mail por favor.");
			request.getRequestDispatcher("/Registrarse.jsp").forward(request, response);
			return;
		}

		
		MailService mailService = new MailService();
		try {
			//* modificar el mail para forzar la excepción*/
			mailService.Enviar("argentinafilms2016@gmail.com", "primavera322", emailIngresado,
					"Confirmación de registro en Argentina Films",

					"<h4 style=\"text-align: center;\">"
							+ "<img src=\"https://68.media.tumblr.com/2977aa25fe30dab5c35a67f0eb3b4424/tumblr_ofzmu7O1eu1tq5qvgo1_400.png\""
							+ "alt=\"\" width=\"320\" height=\"92\" /></h4>" + "<h4 style=\"text-align: center;\">Estimado "
							+ "<strong><span style=\"color: #008000;\">" + idIngresado + "</span>:</strong></h4>"
							+ "<h4 style=\"text-align: center;\">Gracias por registrarte "
							+ "en <span style=\"color: #008000;\"><strong>Argentina Films</strong></span>. "
							+ "Este es tu código de confirmación para poder activar tu cuenta:</h4>"
							+ "<h2 style=\"text-align: center;\"><span style=\"text-decoration: underline; color: #000000;\">"
							+ "<strong>" + codActivacion + "</strong></span></h2>"
							+ "<h4 style=\"text-align: center;\"><br />Por favor aseg&uacute;rate de no agregar espacios extras.</h4>"
							+ "<h4 style=\"text-align: center;\">Si a&uacute;n est&aacute;s teniendo problemas para activar tu cuenta, "
							+ "por favor contact&aacute; a un miembro de nuestro personal de soporte en argentinafilms2016@info.<wbr />com</h4>"
							+ "<h4 style=\"text-align: center;\">Saludos cordiales.</h4> "
							+ "<h4 style=\"text-align: center;\">Equipo de Argentina Films</h4>");
		} catch (MessagingException e) {
			request.setAttribute("tipoMensaje", "alert alert-dismissable alert-danger");
			request.setAttribute("Mensajedismisable", "<a class=\"close\" data-dismiss=\"alert\" aria-label=\"close\">&times;</a>");
			request.setAttribute("mensajeResultado",
					"Servicio de mail actualmente no disponible");
			
			/** se loguea en el error también */
			HttpSession sesion = request.getSession(true);
			sesion.setAttribute("userLogueado", usuario);
			
			request.getRequestDispatcher("/ActivarCuenta.jsp").forward(request, response);
			return;
		}
		
		HttpSession sesion = request.getSession(true);
		sesion.setAttribute("emailConfirmacion", emailIngresado);
		sesion.setAttribute("usuarioConfirmacion", idIngresado);
		sesion.setAttribute("userLogueado", usuario);
		
		request.getRequestDispatcher("/ActivarCuenta.jsp").forward(request, response);
	}

}
