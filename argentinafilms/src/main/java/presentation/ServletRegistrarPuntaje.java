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
					
					Usuarios usuario =  (Usuarios) request.getSession().getAttribute("userLogueado");		
	
					try{
						usuario.getNombre();
						
						Integer id_pelicula = Integer.parseInt(request.getParameter("id_pelicula")); 				
						Peliculas pelicula = this.peliculaService.getById(id_pelicula);
						
						// Puntuacion deberia ser de 1-5 cierto?
						Integer puntuacion = Integer.parseInt(request.getParameter("puntuacion")); 				
						Puntajes puntaje = new Puntajes(puntuacion,pelicula,usuario);
						
						// Guardo nuevo puntaje
						this.puntajeService.save(puntaje);
						
//-------------------------------------------------------------------------------------------------------------
						// Traigo listado de puntajes en la pelicula
						List<Puntajes> puntajes = this.puntajeService.getByPelicula(id_pelicula);
						int puntuacion_suma = 0;
						for(Puntajes p : puntajes)
							puntuacion_suma += p.getPuntuacion();
						Integer puntuacion_total = Math.round((5*(100 * puntuacion_suma)/(puntajes.size()*5))/100);
						
						
						// Actualizo pelicula, le agrego el nuevo puntaje a su puntuacion total
						//Integer puntuacion_total = pelicula.getPuntuacion_total() + puntuacion;
						pelicula.setPuntuacion_total(puntuacion_total);
//-------------------------------------------------------------------------------------------------------------
						
						this.peliculaService.update(pelicula);
						
						response.setContentType("text/plain");  // Set content type of the response so that jQuery knows what it can expect.
					    response.setCharacterEncoding("UTF-8"); // You want world domination, huh?
					    response.getWriter().write(puntuacion_total.toString());       // Write response body.
					}
					catch(NullPointerException e){
						System.out.println("No votado porque usuario no esta logueado.");
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