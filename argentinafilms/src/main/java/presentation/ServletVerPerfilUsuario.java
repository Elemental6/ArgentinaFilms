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

import model.Resenias;
import model.Usuarios;
import model.Peliculas;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import service.ServiceUsuario;
import service.ServicePelicula;
import service.ServiceResenia;

@WebServlet("/ServletVerPerfilUsuario")
public class ServletVerPerfilUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public ServicePelicula servicePelicula = null;
	public ServiceUsuario serviceUsuario = null;
	public ServiceResenia serviceResenia = null;
	
	public void init(ServletConfig config) {
		WebApplicationContext context = WebApplicationContextUtils.getRequiredWebApplicationContext(config.getServletContext());
		this.servicePelicula = (ServicePelicula) context.getBean(ServicePelicula.class);
		this.serviceUsuario = (ServiceUsuario) context.getBean(ServiceUsuario.class);
		this.serviceResenia = (ServiceResenia) context.getBean(ServiceResenia.class);
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		try{
			List<Peliculas> peliculas = new ArrayList<Peliculas>();
			Usuarios usuario = new Usuarios();
			usuario = this.serviceUsuario.getByUserName(id);
			request.getSession().setAttribute("usuarioSelect", usuario);
			peliculas = this.servicePelicula.getByUsuario(id);
			request.getSession().setAttribute("lasPeliculas", peliculas);
			List<Resenias> resenias = new ArrayList<Resenias>();
			List<Peliculas> peliculasResenia = new ArrayList<Peliculas>();
			resenias = this.serviceResenia.getByUsuario(id);
			System.out.println("resenias = " + resenias.size());
			for(int i=0; i<resenias.size();i++){
				resenias.get(i).setPelicula(servicePelicula.getByResenia(resenias.get(i).getId_resenia()));
			}
			request.getSession().setAttribute("lasResenias", resenias);
			request.getRequestDispatcher("/VerPerfilUsuario.jsp").forward(request, response);
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
