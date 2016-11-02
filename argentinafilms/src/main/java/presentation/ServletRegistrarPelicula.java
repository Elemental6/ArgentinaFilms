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
 * Servlet implementation class ServletRegistrarPelicula
 */
@WebServlet("/ServletRegistrarPelicula")
public class ServletRegistrarPelicula extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public DAOPeliculas peliculaService = null;
	public DAOGeneros generosService = null;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletRegistrarPelicula() {
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
			// TODO: Deberia obtener al genero de un listbox
			Integer id_genero = Integer.parseInt(request.getParameter("id_genero")); 
			Generos genero = this.generosService.getById(id_genero);
			
			// Obtengo el usuario que esta logeado
			Usuarios usuario =  (Usuarios) request.getSession().getAttribute("Usuario");
			
			String nombre = request.getParameter("pelicula_nombre"); 
			int anio = Integer.parseInt(request.getParameter("pelicula_anio")); 
			String ubicacion = request.getParameter("pelicula_ubicacion"); 
			Integer duracion = Integer.parseInt(request.getParameter("pelicula_duracion")); 
			String synopsis = request.getParameter("pelicula_synopsis"); 
			// Siempre que se registre una nueva pelicula su puntuacion sera 0
			Integer puntuacion_total = 0; 				
			
			Peliculas pelicula = new Peliculas(nombre,anio,ubicacion,duracion,synopsis,puntuacion_total,usuario,genero);
			// Guardo la pelicula
			this.peliculaService.save(pelicula);
			
			// Nota: Al director y actores se los agrega  usando los servlets de asociar peliculas con actores y director
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
		
		this.peliculaService = (DAOPeliculas) context.getBean(DAOPeliculas.class);
		this.generosService = (DAOGeneros) context.getBean(DAOGeneros.class);
	}
}
