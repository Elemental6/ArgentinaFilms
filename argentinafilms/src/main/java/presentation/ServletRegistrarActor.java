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
import model.Actores;
import model.Peliculas;

/**
 * Servlet implementation class ServletRegistrarActor
 */
@WebServlet("/ServletRegistrarActor")
public class ServletRegistrarActor extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public DAOActores actorService = null;
	public DAOPeliculas peliculaService = null;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletRegistrarActor() {
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
		
		// TODO: Validar datos como la gente
		try{
			String nombre = request.getParameter("actor_nombre");
			String apellido = request.getParameter("actor_apellido");
			Integer edad = Integer.parseInt(request.getParameter("actor_edad"));
			
			Actores actor = new Actores (nombre,apellido,edad);
			// Guardar actor
			this.actorService.save(actor);
			
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
