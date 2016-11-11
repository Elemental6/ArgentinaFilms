package presentation;


import java.util.ArrayList;
import java.util.List;
import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import service.ServiceActor;
import service.ServiceDirector;
import service.ServiceGenero;
import service.ServicePelicula;
import util.CodigoAleatorio;
import util.SubidaDeImagen;
import model.*;



@WebServlet("/ServletRegistrarPelicula")
public class ServletRegistrarPelicula extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	public ServicePelicula peliculaService = null;
	public ServiceGenero generosService = null;
	public ServiceDirector directoresService = null;
	public ServiceActor actoresService = null;
    
	
    public ServletRegistrarPelicula() {
        super();
       
    }
    @Override
    public void init(ServletConfig config) {
		WebApplicationContext context = WebApplicationContextUtils.getRequiredWebApplicationContext(config.getServletContext());
		this.peliculaService = (ServicePelicula) context.getBean(ServicePelicula.class);
		this.generosService = (ServiceGenero) context.getBean(ServiceGenero.class);
		this.directoresService = (ServiceDirector) context.getBean(ServiceDirector.class);
		this.actoresService = (ServiceActor) context.getBean(ServiceActor.class);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// TODO: Validar datos como la gente / Separar en capa de servicio si hay tiempo
		try{
			
			
			// Obtengo el usuario que esta logeado
			Usuarios usuario =  (Usuarios) request.getSession().getAttribute("Usuario");
			// TODO: Deberia obtener al genero de un listbox
			
			Generos genero = new Generos();
			
			
			String nombre = request.getParameter("txtnombre");
			Integer anio =null;
			if(request.getParameter("txtanio")!=""){
				anio  = Integer.parseInt(request.getParameter("txtanio"));
			}
			String ubicacion = request.getParameter("txtUbicacion");
			
			
			Integer duracion = Integer.parseInt(request.getParameter("txtDuracion")); 
			String synopsis = request.getParameter("txtAreaSynospsis"); 
			// Siempre que se registre una nueva pelicula su puntuacion sera 0
			Integer puntuacion_total = 0;
			Peliculas pelicula = new Peliculas(nombre,anio,ubicacion,duracion,synopsis,puntuacion_total,usuario,null);
			String poster  = SubidaDeImagen.Subir(request, response, "imgs\\peliculas\\", CodigoAleatorio.getCadenaAlfanumAleatoria(15) + ".jpg");
			
			
			// Poster y trailer podrian ser nulos
			String trailer = request.getParameter("txtTrailer");
			Integer id_genero ;
			if(request.getParameter("txtGenero")!= "")
			{
				id_genero =Integer.parseInt(request.getParameter("txtGenero"));
				genero = this.generosService.getById(id_genero);
				pelicula.setGenero(genero);
			}  
			pelicula.setTrailer(trailer);
			pelicula.setPoster(poster);
			pelicula.setEstado(false);
			Integer id_director;
			if(request.getParameter("txtdirector")!="")
			{
				id_director	= Integer.parseInt(request.getParameter("txtdirector"));
				Directores director = this.directoresService.getById(id_director);
				pelicula.setDirector(director);
			}

			if(request.getParameter("txtactor")!=""){
				
			Integer id_actor =Integer.parseInt(request.getParameter("txtactor"));
			Actores actor = new Actores();
			List<Actores> actores = new ArrayList<>();
			
			actor = this.actoresService.getById(id_actor);
				actores.add(actor);
				pelicula.setActores(actores);
			}
			
			
			pelicula.setPoster(poster);
			 //Guardo la pelicula
			this.peliculaService.add(pelicula);
			
			// Nota: Al director y actores se los agrega  usando los servlets de asociar peliculas con actores y director
			System.out.println("Datos guardados");
		}
		catch (Exception e){
			System.out.println(e.getMessage());
			request.setAttribute("tipoMensaje", "alert alert-dismissable alert-danger");
	        request.setAttribute("mensajeResultado", "No se pudo cargar la pelìcula. Reintente por favor.");
			request.getRequestDispatcher("/AgregarPelicula.jsp").forward(request, response);
			return;
		}
	
		
		request.getRequestDispatcher("/Inicio.jsp").forward(request, response);
	
	}
}
