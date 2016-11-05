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

import dao.*;
import model.*;

/**
 * Servlet implementation class ServletListarPeliculas
 */
@WebServlet("/ServletListarPeliculas")
public class ServletListarPeliculas extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public DAOPeliculas peliculaService = null;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletListarPeliculas() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
List<Peliculas> peliculas = this.peliculaService.getAll();
		
		request.getSession().setAttribute("Peliculas", peliculas);


		response.sendRedirect("ListadoPeliculas.jsp");
		
		
		//TODO: Mostrar poster en listado de peliculas y hacer que se puedan ver detalles de la pelicula seleccionadola en el listado
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}
	@Override
	public void init(ServletConfig config) {
		WebApplicationContext context = WebApplicationContextUtils
				.getRequiredWebApplicationContext(config.getServletContext());
		this.peliculaService = (DAOPeliculas) context.getBean(DAOPeliculas.class);
	}
}
