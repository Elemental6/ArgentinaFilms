package presentation;

import java.io.IOException;

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


@SuppressWarnings("serial")
@WebServlet("/Loguear")
public class ServletLogin extends HttpServlet{

	public ServiceUsuario serviceUsuario = null;
	
	@Override
	public void init(ServletConfig config) {
		WebApplicationContext context = WebApplicationContextUtils.getRequiredWebApplicationContext(config.getServletContext());
		this.serviceUsuario = (ServiceUsuario) context.getBean(ServiceUsuario.class);
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		if (request.getParameter("txtNombreUsuario").equals(null) || request.getParameter("txtPass").equals(null)){
			request.setAttribute("tipoMensaje", "alert alert-dismissable alert-danger");
	        request.setAttribute("mensajeResultado", "Usuario o Passwords no pueden estar vacios. Reintente.");
			request.getRequestDispatcher("/IniciarSesion.jsp").forward(request, response);
			return;
		}
		
		String usuarioIngresado = request.getParameter("txtNombreUsuario");
		String passIngresado = request.getParameter("txtPass");
		try{
			Usuarios usuario = new Usuarios();
			usuario = this.serviceUsuario.getByUserName(usuarioIngresado);
			
			if(usuario.getPass().compareTo(passIngresado) == 0)
			{
				
				if(!usuario.isEstado() && usuario.getCodActivacion().compareTo("") == 0)
				{
					request.setAttribute("tipoMensaje", "alert alert-dismissable alert-danger");
			        request.setAttribute("mensajeResultado", "Estás baneado. No podés ingresar");
					request.getRequestDispatcher("/IniciarSesion.jsp").forward(request, response);
					return;
				}
				
				HttpSession sesion = request.getSession(true);
				sesion.setAttribute("userLogueado", usuario);
				
				response.sendRedirect("Inicio.jsp");
				return;
			}
			
			else
				
			{
				request.setAttribute("tipoMensaje", "alert alert-dismissable alert-danger");
		        request.setAttribute("mensajeResultado", "Contraseña incorrecta. Reintente por favor.");
				request.getRequestDispatcher("/IniciarSesion.jsp").forward(request, response);
				return;
			}
		}
		catch(NullPointerException e){
			request.setAttribute("tipoMensaje", "alert alert-dismissable alert-danger");
	        request.setAttribute("mensajeResultado", "El usuario ingresado no existe. Reintente por favor.");
			request.getRequestDispatcher("/IniciarSesion.jsp").forward(request, response);
			return;
		}

	}
}
