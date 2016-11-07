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

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import service.*;
import util.FiltrarListado;
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

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/* Genera las peliculas */
		// if(request.getSession().getAttribute("Peliculas") == null)
		// crearDatos();
		List<Peliculas> peliculas = this.peliculaService.getAll();
		request.getSession().setAttribute("PeliculasListado", peliculas);
		response.sendRedirect("ListadoPeliculas.jsp");
		// TODO: Mostrar poster en listado de peliculas y hacer que se puedan
		// ver detalles de la pelicula seleccionadola en el listado
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);

		List<Peliculas> peliculas = this.peliculaService.getAll();
		List<Peliculas> peliculas_filtradas = new ArrayList<Peliculas>();

		if (request.getParameter("A") != null) {
			peliculas_filtradas = FiltrarListado.filtrarPeliculas(peliculas, "A");
		}

		if (request.getParameter("B") != null) {
			peliculas_filtradas = FiltrarListado.filtrarPeliculas(peliculas, "B");
		}

		if (request.getParameter("C") != null) {
			peliculas_filtradas = FiltrarListado.filtrarPeliculas(peliculas, "C");
		}

		if (request.getParameter("D") != null) {
			peliculas_filtradas = FiltrarListado.filtrarPeliculas(peliculas, "D");
		}

		if (request.getParameter("E") != null) {
			peliculas_filtradas = FiltrarListado.filtrarPeliculas(peliculas, "E");
		}

		if (request.getParameter("F") != null) {
			peliculas_filtradas = FiltrarListado.filtrarPeliculas(peliculas, "F");
		}

		if (request.getParameter("G") != null) {
			peliculas_filtradas = FiltrarListado.filtrarPeliculas(peliculas, "G");
		}

		if (request.getParameter("H") != null) {
			peliculas_filtradas = FiltrarListado.filtrarPeliculas(peliculas, "H");
		}

		if (request.getParameter("I") != null) {
			peliculas_filtradas = FiltrarListado.filtrarPeliculas(peliculas, "I");
		}

		if (request.getParameter("J") != null) {
			peliculas_filtradas = FiltrarListado.filtrarPeliculas(peliculas, "J");
		}

		if (request.getParameter("K") != null) {
			peliculas_filtradas = FiltrarListado.filtrarPeliculas(peliculas, "K");
		}

		if (request.getParameter("L") != null) {
			peliculas_filtradas = FiltrarListado.filtrarPeliculas(peliculas, "L");
		}

		if (request.getParameter("N") != null) {
			peliculas_filtradas = FiltrarListado.filtrarPeliculas(peliculas, "N");
		}

		if (request.getParameter("Ñ") != null) {
			peliculas_filtradas = FiltrarListado.filtrarPeliculas(peliculas, "Ñ");
		}

		if (request.getParameter("M") != null) {
			peliculas_filtradas = FiltrarListado.filtrarPeliculas(peliculas, "M");
		}

		if (request.getParameter("L") != null) {
			peliculas_filtradas = FiltrarListado.filtrarPeliculas(peliculas, "L");
		}

		if (request.getParameter("O") != null) {
			peliculas_filtradas = FiltrarListado.filtrarPeliculas(peliculas, "O");
		}
		if (request.getParameter("P") != null) {
			peliculas_filtradas = FiltrarListado.filtrarPeliculas(peliculas, "P");
		}
		if (request.getParameter("Q") != null) {
			peliculas_filtradas = FiltrarListado.filtrarPeliculas(peliculas, "Q");
		}
		if (request.getParameter("R") != null) {
			peliculas_filtradas = FiltrarListado.filtrarPeliculas(peliculas, "R");
		}
		if (request.getParameter("S") != null) {
			peliculas_filtradas = FiltrarListado.filtrarPeliculas(peliculas, "S");
		}
		if (request.getParameter("T") != null) {
			peliculas_filtradas = FiltrarListado.filtrarPeliculas(peliculas, "T");
		}
		if (request.getParameter("U") != null) {
			peliculas_filtradas = FiltrarListado.filtrarPeliculas(peliculas, "U");
		}
		if (request.getParameter("V") != null) {
			peliculas_filtradas = FiltrarListado.filtrarPeliculas(peliculas, "V");
		}
		if (request.getParameter("W") != null) {
			peliculas_filtradas = FiltrarListado.filtrarPeliculas(peliculas, "W");
		}
		if (request.getParameter("X") != null) {
			peliculas_filtradas = FiltrarListado.filtrarPeliculas(peliculas, "X");
		}
		if (request.getParameter("Y") != null) {
			peliculas_filtradas = FiltrarListado.filtrarPeliculas(peliculas, "Y");
		}
		if (request.getParameter("Z") != null) {
			peliculas_filtradas = FiltrarListado.filtrarPeliculas(peliculas, "Z");
		}

		request.getSession().setAttribute("PeliculasListado", peliculas_filtradas);

	}

}
