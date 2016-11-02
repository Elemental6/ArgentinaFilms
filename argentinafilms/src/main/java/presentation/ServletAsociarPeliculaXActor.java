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

import dao.DAOActores;
import dao.DAODirectores;
import dao.DAOPeliculas;
import model.Actores;
import model.Directores;
import model.Peliculas;

/**
 * Servlet implementation class ServletAsociarPeliculaXActor
 */
@WebServlet("/ServletAsociarPeliculaXActor")
public class ServletAsociarPeliculaXActor extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public DAOActores actorService = null;
	public DAOPeliculas peliculaService = null;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletAsociarPeliculaXActor() {
        super();
      
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
		doGet(request, response);
		

		// TODO: Validar datos como la gente / Separar en capa de servicio si hay tiempo
		try{
			// TODO: Al director habria que elegirlo de un listbox y sacar su id de ahi
			Integer id_actor = Integer.parseInt(request.getParameter("id_actor"));
			Actores actor = this.actorService.getById(id_actor);	
			
			// Traigo a la pelicula a la cual agregar al actor
			Peliculas pelicula = this.peliculaService.getById(Integer.parseInt(request.getParameter("id_pelicula")));
			// A esta pelicula le agrego al actor
			List<Actores> pelicula_actores = pelicula.getActores();
			pelicula_actores.add(actor);
			pelicula.setActores(pelicula_actores);
			// Y la actualizo para que se agrege este nuevo actor a la pelicula			
			this.peliculaService.update(pelicula);
			
			System.out.println("Datos guardados");
		}		
		catch (Exception e){
			System.out.println(e.getMessage());
		}
	}
	@Override
	public void init(ServletConfig config) {
		WebApplicationContext context = WebApplicationContextUtils
				.getRequiredWebApplicationContext(config.getServletContext());
		this.actorService = (DAOActores) context.getBean(DAOActores.class);
		this.peliculaService = (DAOPeliculas) context.getBean(DAOPeliculas.class);
	}
}
