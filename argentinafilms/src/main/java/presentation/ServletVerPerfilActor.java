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

import model.Actores;
import model.Peliculas;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import service.ServicePelicula;
import service.ServiceActor;

@WebServlet("/ServletVerPerfilActor")
public class ServletVerPerfilActor extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public ServicePelicula servicePelicula = null;
	public ServiceActor serviceActor = null;
	
	public void init(ServletConfig config) {
		WebApplicationContext context = WebApplicationContextUtils.getRequiredWebApplicationContext(config.getServletContext());
		this.servicePelicula = (ServicePelicula) context.getBean(ServicePelicula.class);
		this.serviceActor = (ServiceActor) context.getBean(ServiceActor.class);
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		try{
			List<Peliculas> peliculas = new ArrayList<Peliculas>();
			Actores actor = new Actores();
			actor = this.serviceActor.getById(id);
			request.getSession().setAttribute("actorSelect", actor);
			peliculas = this.servicePelicula.getByActor(id);
			request.getSession().setAttribute("actorPeliculas", peliculas);
			request.getRequestDispatcher("/VerPerfilActor.jsp").forward(request, response);
		}
		catch(NullPointerException e){
			response.sendRedirect("Error404.jsp");
			return;
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
