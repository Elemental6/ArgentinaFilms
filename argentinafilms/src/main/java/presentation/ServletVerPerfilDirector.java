package presentation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Directores;
import model.Peliculas;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import service.ServiceDirector;
import service.ServicePelicula;

@WebServlet("/ServletVerPerfilDirector")
public class ServletVerPerfilDirector extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public ServicePelicula servicePelicula = null;
	public ServiceDirector serviceDirector = null;
	
	public void init(ServletConfig config) {
		WebApplicationContext context = WebApplicationContextUtils.getRequiredWebApplicationContext(config.getServletContext());
		this.servicePelicula = (ServicePelicula) context.getBean(ServicePelicula.class);
		this.serviceDirector = (ServiceDirector) context.getBean(ServiceDirector.class);
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getSession().removeAttribute("lasPeliculas");
		request.getSession().removeAttribute("directorSelect");
		request.getSession().removeAttribute("actorSelect");
		int id = Integer.parseInt(request.getParameter("id"));
			List<Peliculas> peliculas = new ArrayList<Peliculas>();
			Directores director = new Directores();
			director = this.serviceDirector.getById(id);
			request.getSession().setAttribute("directorSelect", director);
			peliculas = this.servicePelicula.getByDirector(id);
			request.getSession().setAttribute("lasPeliculas", peliculas);
			request.getRequestDispatcher("/VerPerfilActor.jsp").forward(request, response);


	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}

