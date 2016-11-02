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
@WebServlet("/ActivarCuenta")
public class ServletActivarCuenta extends HttpServlet{

	public ServiceUsuario serviceUsuario = null;
	
	@Override
	public void init(ServletConfig config) {
		WebApplicationContext context = WebApplicationContextUtils.getRequiredWebApplicationContext(config.getServletContext());
		this.serviceUsuario = (ServiceUsuario) context.getBean(ServiceUsuario.class);
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String json = new Gson().toJson("");
		String usuarioConfirmacion = request.getParameter("usuarioConfirmacion");
		String codIngresado = request.getParameter("txtCodActivacion");
		
		Usuarios usuario = this.serviceUsuario.getByUserName(usuarioConfirmacion);
		
		if(usuario.getCodActivacion().compareTo(codIngresado) == 0){
			
			usuario.setEstado(true);
			usuario.setCodActivacion("");
			this.serviceUsuario.update(usuario);
			
			json = new Gson().toJson("codValido");
			response.setContentType("application/json"); 
			response.setCharacterEncoding("UTF-8"); 
			response.getWriter().write(json);
		}
		else
		{
			json = new Gson().toJson("codInvalido");
			response.setContentType("application/json"); 
			response.setCharacterEncoding("UTF-8"); 
			response.getWriter().write(json);
		}
		
		
	}
	
	
}
