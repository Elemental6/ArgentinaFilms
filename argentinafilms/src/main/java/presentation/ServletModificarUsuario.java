package presentation;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Usuarios;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import service.ServiceUsuario;

@MultipartConfig
@WebServlet("/ModificarUsuario")
public class ServletModificarUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public ServiceUsuario serviceUsuario = null;
	
	@Override
	public void init(ServletConfig config) {
		WebApplicationContext context = WebApplicationContextUtils.getRequiredWebApplicationContext(config.getServletContext());
		this.serviceUsuario = (ServiceUsuario) context.getBean(ServiceUsuario.class);
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombreIngresado = request.getParameter("txtNombre");
		String apellidoIngresado = request.getParameter("txtApellido");
		Usuarios usuario = (Usuarios) request.getSession().getAttribute("userLogueado");
		usuario.setNombre(nombreIngresado);
		usuario.setApellido(apellidoIngresado);
		this.serviceUsuario.update(usuario);
		response.sendRedirect("VerPerfilUsuario.jsp?id="+usuario.getUsuario());
	}

}
