package presentation;

import java.io.IOException;

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

/**
 * Servlet implementation class ServletEliminarPelicula
 */
@WebServlet("/EliminarPelicula")
public class ServletEliminarPelicula extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public DAOPeliculas servicePelicula = null;

	@Override
	public void init(ServletConfig config) {
		WebApplicationContext context = WebApplicationContextUtils
				.getRequiredWebApplicationContext(config.getServletContext());
		this.servicePelicula = (DAOPeliculas) context.getBean(DAOPeliculas.class);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Integer peliculaSeleccionada = Integer
				.parseInt(request.getParameter("peliculaSeleccionada"));

		String pagina = request.getParameter("pagActual");

		Peliculas pelicula = this.servicePelicula.getById(peliculaSeleccionada);
		pelicula.setEstado(false);
		this.servicePelicula.update(pelicula);

		request.setAttribute("tipoMensaje", "alert alert-dismissable alert-success");
		request.setAttribute("mensajeResultado",
				"La pelicula " + pelicula.getNombre() + " fue eliminada");
		response.sendRedirect("EliminarPelicula.jsp?pagina=" + pagina);
	}
}
