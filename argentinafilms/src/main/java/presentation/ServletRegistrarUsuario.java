package presentation;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Usuarios;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.google.gson.Gson;

import service.ServiceUsuario;

@SuppressWarnings("serial")
@WebServlet("/RegistrarUsuario")
public class ServletRegistrarUsuario extends HttpServlet{

	
	public ServiceUsuario serviceUsuario = null;
	
	@Override
	public void init(ServletConfig config) {
		WebApplicationContext context = WebApplicationContextUtils.getRequiredWebApplicationContext(config.getServletContext());
		this.serviceUsuario = (ServiceUsuario) context.getBean(ServiceUsuario.class);
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String json = new Gson().toJson("");
		
		String idIngresado = request.getParameter("txtId");
		String passIngresado = request.getParameter("txtPass1");
		String nombreIngresado = request.getParameter("txtNombre");
		String apellidoIngresado = request.getParameter("txtApellido");
		String emailIngresado = request.getParameter("txtEmail");
		
		Usuarios usuario = new Usuarios();
		usuario.setUsuario(idIngresado);
		usuario.setPass(passIngresado);
		usuario.setNombre(nombreIngresado);
		usuario.setApellido(apellidoIngresado);
		usuario.setEmail(emailIngresado);
		usuario.setRango("novato");
		usuario.setEstado(true);
		
	
		this.serviceUsuario.add(usuario);
		
		json = new Gson().toJson("ok");
		response.setContentType("application/json"); 
		response.setCharacterEncoding("UTF-8"); 
		response.getWriter().write(json);
	}
	
	
}
