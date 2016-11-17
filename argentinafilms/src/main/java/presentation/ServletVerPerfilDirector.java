package presentation;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Directores;
import model.Peliculas;
import model.Secciones;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import service.ServiceDirector;
import service.ServicePelicula;
import service.ServiceSecciones;

@WebServlet("/ServletVerPerfilDirector")
public class ServletVerPerfilDirector extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public ServicePelicula servicePelicula = null;
	public ServiceSecciones serviceSeccion = null;
	public ServiceDirector serviceDirector = null;
	
	public void init(ServletConfig config) {
		WebApplicationContext context = WebApplicationContextUtils.getRequiredWebApplicationContext(config.getServletContext());
		this.servicePelicula = (ServicePelicula) context.getBean(ServicePelicula.class);
		this.serviceSeccion = (ServiceSecciones) context.getBean(ServiceSecciones.class);
		this.serviceDirector = (ServiceDirector) context.getBean(ServiceDirector.class);
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int id = Integer.parseInt(request.getParameter("id"));
			
		Directores director = this.serviceDirector.getById(id);	
		List<Peliculas> peliculas = this.servicePelicula.getByDirector(id);
			
		Secciones seccion = this.serviceSeccion.getById(3);
		seccion.setCant_visitas(seccion.getCant_visitas() + 1);
		this.serviceSeccion.update(seccion);
		
		request.getSession().setAttribute("directorSelect", director);
		request.getSession().setAttribute("lasPeliculas", peliculas);

	}


}

