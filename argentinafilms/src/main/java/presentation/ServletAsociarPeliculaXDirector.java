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

import dao.DAODirectores;
import dao.DAOPeliculas;
import model.Actores;
import model.Directores;
import model.Peliculas;

/**
 * Servlet implementation class ServletAsociarDirectorXPelicula
 */
@WebServlet("/ServletAsociarDirectorXPelicula")
public class ServletAsociarPeliculaXDirector extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public DAODirectores directorService = null;
	public DAOPeliculas peliculaService = null;
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletAsociarPeliculaXDirector() {
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

		List<Directores> directores = this.directorService.getAll();
		request.getSession().setAttribute("DirectoresAsociar", directores);

		response.sendRedirect("AsociarDirector.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// TODO: Validar datos como la gente / Separar en capa de servicio si
		// hay tiempo

		Boolean valido = true;
		try {
			System.out.println(request.getParameter("AsociarDirector"));
			Integer id_director = Integer.parseInt(request.getParameter("AsociarDirector"));
			Directores director = this.directorService.getById(id_director);

			String peliculastring = request.getParameter("AsociarPelicula");
			String trimpelicula[] = peliculastring.split(" - ");
			Integer id_pelicula = Integer.parseInt(trimpelicula[0]);
			Peliculas pelicula = this.peliculaService.getById(id_pelicula);

			// Primero me fijo si ya esta el director agregado
			if (pelicula.getDirector() != null)
				valido = false;
			System.out.println(valido);
			if (valido) {
				// A esta pelicula le agrego al director
				pelicula.setDirector(director);
				// Y la actualizo para que se agrege este nuevo director a la
				// pelicula
				this.peliculaService.update(pelicula);

				System.out.println("Datos guardados");
				request.setAttribute("tipoMensaje", "alert alert-dismissable alert-success");
				request.setAttribute("mensajeResultado", "Asociacion exitosa!");
			}

		}

		catch (Exception e) {
			System.out.println(e.getMessage());
			valido = false;

		}

		finally {
			if (!valido) {
				request.setAttribute("tipoMensaje", "alert alert-dismissable alert-danger");
				request.setAttribute("mensajeResultado",
						"Esta pelicula ya tiene asignada un Director.");
			}
		}
		// response.sendRedirect("AsociarActor.jsp");
		request.getRequestDispatcher("/AsociarDirector.jsp").forward(request, response);

	}
	@Override
	public void init(ServletConfig config) {
		WebApplicationContext context = WebApplicationContextUtils
				.getRequiredWebApplicationContext(config.getServletContext());
		this.directorService = (DAODirectores) context.getBean(DAODirectores.class);
		this.peliculaService = (DAOPeliculas) context.getBean(DAOPeliculas.class);
	}
}
