package presentation;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import service.*;
import model.*;

@SuppressWarnings("serial")
@WebServlet("/ServletListarPeliculas")
public class ServletListarPeliculas extends HttpServlet {

	public ServicePelicula peliculaService = null;

	@Override
	public void init(ServletConfig config) {
		WebApplicationContext context = WebApplicationContextUtils
				.getRequiredWebApplicationContext(config.getServletContext());
		this.peliculaService = (ServicePelicula) context.getBean(ServicePelicula.class);
	}
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*Genera las peliculas*/
//		if(request.getSession().getAttribute("Peliculas") == null)
//			crearDatos();
		List<Peliculas> peliculas = this.peliculaService.getAll();
		request.getSession().setAttribute("Peliculas", peliculas);
		response.sendRedirect("ListadoPeliculas.jsp");
		//TODO: Mostrar poster en listado de peliculas y hacer que se puedan ver detalles de la pelicula seleccionadola en el listado
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	
}
