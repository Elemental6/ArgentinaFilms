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

import dao.*;
import model.*;


/**
 * Servlet implementation class ServletRegistrarPuntaje
 */
@WebServlet("/ServletRegistrarPuntaje")
public class ServletRegistrarPuntaje extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public DAOPeliculas peliculaService = null;
	public DAOPuntajes puntajeService = null;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletRegistrarPuntaje() {
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
					// Obtengo el usuario que esta logeado
					Usuarios usuario =  (Usuarios) request.getSession().getAttribute("Usuario");					
					
					// TODO: Deberia obtener a la pelicula de otra forma, ya sea con un parametro u otro
					Integer id_pelicula = Integer.parseInt(request.getParameter("id_pelicula")); 				
					Peliculas pelicula = this.peliculaService.getById(id_pelicula);
					
					// Puntuacion deberia ser de 1-5 cierto?
					Integer puntuacion = Integer.parseInt(request.getParameter("puntuacion")); 				
					
					Puntajes puntaje = new Puntajes(puntuacion,pelicula,usuario);
					
					// Guardo nuevo puntaje
					this.puntajeService.save(puntaje);
					
					// Actualizo pelicula, le agrego el nuevo puntaje a su puntuacion total
					Integer puntuacion_total = pelicula.getPuntuacion_total() + puntuacion;
					pelicula.setPuntuacion_total(puntuacion_total);
					
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
		this.puntajeService = (DAOPuntajes) context.getBean(DAOPuntajes.class);
		this.peliculaService = (DAOPeliculas) context.getBean(DAOPeliculas.class);
	}
}
