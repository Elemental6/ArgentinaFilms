package presentation;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Peliculas;
import model.Usuarios;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import service.ServicePelicula;


@SuppressWarnings("serial")
@WebServlet("/VerificarUsuarioModificarPelicula")
public class ServletVerificarUsuarioModificarPelicula extends HttpServlet{

	public ServicePelicula servicePelicula = null;
	
	@Override
	public void init(ServletConfig config) {
		WebApplicationContext context = WebApplicationContextUtils.getRequiredWebApplicationContext(config.getServletContext());
		this.servicePelicula = (ServicePelicula) context.getBean(ServicePelicula.class);
	}
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		int id_pelicula = Integer.parseInt(request.getParameter("pelicula_id"));
		Usuarios usuario =  (Usuarios) request.getSession().getAttribute("userLogueado");
		
		Peliculas pelicula = this.servicePelicula.getById(id_pelicula);
		
		if(pelicula.getUsuario().getUsuario().compareTo(usuario.getUsuario())!=0){
			request.setAttribute("OK", false);
			return;
		}
		
		request.setAttribute("OK", true);

	}
	
	
}
