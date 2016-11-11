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


import dao.DAOPeliculas;
import model.Peliculas;
import model.Resenias;
import model.Usuarios;
import service.ServiceResenia;

/**
 * Servlet implementation class ServletRegistrarResenia
 */
@WebServlet("/ServletRegistrarResenia")
public class ServletRegistrarResenia extends HttpServlet {
	private static final long serialVersionUID = 1L;
	  public ServiceResenia serviceResenia = null;
	  public DAOPeliculas peliculaService = null;
	    public void init(ServletConfig config) {
	    	WebApplicationContext context = WebApplicationContextUtils.getRequiredWebApplicationContext(config.getServletContext());
	    	this.serviceResenia = (ServiceResenia) context.getBean(ServiceResenia.class);
	    	this.peliculaService = (DAOPeliculas) context.getBean(DAOPeliculas.class);
	    }
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletRegistrarResenia() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   //
		doGet(request, response);

		Peliculas pelicula = (Peliculas) request.getSession().getAttribute("selectPelicula");
		Integer id_pelicula = pelicula.getId_pelicula();
		
		try {
			String reseniaCreada = request.getParameter("resenia");
			
			//Obtengo el usuario que esta logueado
			Usuarios usuario = (Usuarios) request.getSession().getAttribute("Usuario");
			
			List<Resenias> resenias = pelicula.getResenias();
			Resenias resenia = new Resenias();
			resenias.add(resenia);
			resenia.setUsuario(usuario);
			resenia.setResenia(reseniaCreada);
			
		    pelicula.setResenias(resenias);
			//Guardo la resenia y actualizo la lista de resenias en la pelicula
			this.serviceResenia.add(resenia);
			this.peliculaService.update(pelicula);
			
			System.out.println("Resenia guardada");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		response.sendRedirect("ServletVerPelicula?pelicula_id="+ id_pelicula);
	}

}
