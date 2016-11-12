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
import dao.DAOPeliculas;
import model.Actores;
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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List<Peliculas> peliculas = this.peliculaService.getAll();
		request.getSession().setAttribute("PeliculasAsociar", peliculas);

		List<Actores> actores = this.actorService.getActivas();
		
		request.getSession().setAttribute("ActoresAsociar", actores);
		
		response.sendRedirect("AsociarActor.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// doGet(request, response);

		Boolean valido = true;
		try {
			String actorstring = request.getParameter("AsociarActor");
			String trimactor[] = actorstring.split(" - ");
			Integer id_actor = Integer.parseInt(trimactor[0]);
			Actores actor = this.actorService.getById(id_actor);
			if (!actor.isEstado()) valido = false;
			
			String peliculastring = request.getParameter("AsociarPelicula");
			String trimpelicula[] = peliculastring.split(" - ");
			Integer id_pelicula = Integer.parseInt(trimpelicula[0]);
			Peliculas pelicula = this.peliculaService.getById(id_pelicula);

			// Primero me fijo si ya esta el actor agregado
			List<Actores> pelicula_actores = pelicula.getActores();
			for (Actores actor_iterate : pelicula_actores) {
				if (actor_iterate.getId_actor() == actor.getId_actor()) {
					System.out.println("Actor ya existe en esta pelicula");
					valido = false;
					break;
				}

			}

			if (valido) {
				// A esta pelicula le agrego al actor
				pelicula_actores.add(actor);
				pelicula.setActores(pelicula_actores);
				// Y la actualizo para que se agrege este nuevo actor a la
				// pelicula
				this.peliculaService.update(pelicula);
				System.out.println("Datos guardados");
				request.setAttribute("tipoMensaje", "alert alert-dismissable alert-success");
				request.setAttribute("mensajeResultado", "Asociacion exitosa!");
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
			valido = false;

		} finally {
			if (!valido) {
				request.setAttribute("tipoMensaje", "alert alert-dismissable alert-danger");
				request.setAttribute("mensajeResultado", "Actor no puede asociarse dos veces a la misma pelicula.");
			}
		}
		// response.sendRedirect("AsociarActor.jsp");
		request.getRequestDispatcher("/AsociarActor.jsp").forward(request, response);

	}
	@Override
	public void init(ServletConfig config) {
		WebApplicationContext context = WebApplicationContextUtils
				.getRequiredWebApplicationContext(config.getServletContext());
		this.actorService = (DAOActores) context.getBean(DAOActores.class);
		this.peliculaService = (DAOPeliculas) context.getBean(DAOPeliculas.class);
	}
}
