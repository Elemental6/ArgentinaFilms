package presentation;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
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
import util.ValidarDatos;
import model.*;


@MultipartConfig
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
		
		try{			
			
			// Obtengo el usuario que esta logeado

			Usuarios usuario =  (Usuarios) request.getSession().getAttribute("userLogeado");
			
			// TODO: Deberia obtener al genero de un listbox
			
			String nombre = request.getParameter("txtnombre");

			if (nombre.equals(null)){						
				request.setAttribute("tipoMensaje", "alert alert-dismissible alert-danger");
				request.setAttribute("Mensajedismisable", "<a class=\"close\" data-dismiss=\"alert\" aria-label=\"close\">&times;</a>");
				request.setAttribute("mensajeResultado", "El nombre de la pelicula no puede ser nulo. Reintente por favor.");
				request.getRequestDispatcher("/AgregarPelicula.jsp").forward(request, response);
				return;

			}

			String ubicacion = request.getParameter("txtUbicacion");

			Integer anio = null;
			if (!ValidarDatos.validarInteger(request.getParameter("txtanio"))){
				request.setAttribute("tipoMensaje", "alert alert-dismissible alert-danger");
				request.setAttribute("Mensajedismisable", "<a class=\"close\" data-dismiss=\"alert\" aria-label=\"close\">&times;</a>");
				request.setAttribute("mensajeResultado", "El anio de la pelicula debe ser un numero mayor que 1900. Reintente por favor.");
				request.getRequestDispatcher("/AgregarPelicula.jsp").forward(request, response);
				return;
			}
			
			anio = Integer.parseInt(request.getParameter("txtanio"));
		
			
			Integer duracion = null;
			
			if (!ValidarDatos.validarInteger(request.getParameter("txtDuracion"))){
				request.setAttribute("tipoMensaje", "alert alert-dismissible alert-danger");
				request.setAttribute("Mensajedismisable", "<a class=\"close\" data-dismiss=\"alert\" aria-label=\"close\">&times;</a>");
				request.setAttribute("mensajeResultado", "La duracion de la pelicula debe ser un numero mayor a 1 y menor a 300. Reintente por favor.");
				request.getRequestDispatcher("/AgregarPelicula.jsp").forward(request, response);
				return;
			}
			 
			duracion = Integer.parseInt(request.getParameter("txtDuracion"));			
			

			String synopsis = request.getParameter("txtAreaSynospsis"); 
			if (synopsis.equals(null)){
				request.setAttribute("tipoMensaje", "alert alert-dismissible alert-danger");
				request.setAttribute("Mensajedismisable", "<a class=\"close\" data-dismiss=\"alert\" aria-label=\"close\">&times;</a>");
				request.setAttribute("mensajeResultado", "La synopsis no puede ser nula. Reintente por favor.");
				request.getRequestDispatcher("/AgregarPelicula.jsp").forward(request, response);
				return;
			}

			Integer puntuacion_total = 0;

			Peliculas pelicula = new Peliculas();

			String trailer = request.getParameter("txtTrailer");

			trailer.trim();
			
			Generos genero = new Generos();

			Integer id_genero = null;

			if(request.getParameter("txtGenero")!= "")
			{
				id_genero = Integer.parseInt(request.getParameter("txtGenero"));
				genero = this.generosService.getById(id_genero);
				pelicula.setGenero(genero);

			}  
			else{
				request.setAttribute("tipoMensaje", "alert alert-dismissible alert-danger");
				request.setAttribute("Mensajedismisable", "<a class=\"close\" data-dismiss=\"alert\" aria-label=\"close\">&times;</a>");
				request.setAttribute("mensajeResultado", "Por favor seleccione un genero y reintente.");
				request.getRequestDispatcher("/AgregarPelicula.jsp").forward(request, response);
			}
			
			Integer id_director = null;
			if(request.getParameter("txtdirector")!="")
			{
				id_director	= Integer.parseInt(request.getParameter("txtdirector"));
				Directores director = this.directoresService.getById(id_director);
				pelicula.setDirector(director);
			}

			String id_actor =request.getParameter("actoresIdS");
			
			if(request.getParameter("actoresIdS")!=""){
			List<String> listaIds = Arrays.asList(id_actor.split("-"));
			if(request.getParameter("txtactor")!=""){
			Actores actor = new Actores();
			List<Actores> actores = new ArrayList<>();
			
			for(String elem : listaIds){
				actor = this.actoresService.getById( Integer.parseInt(elem));
				actores.add(actor);//do whatever with the element
				}
				
				pelicula.setActores(actores);
			}
			}

			pelicula.setNombre(nombre);
			pelicula.setAnio(anio);
			pelicula.setDuracion(duracion);
			pelicula.setUbicacion(ubicacion);
			pelicula.setPuntuacion_total(puntuacion_total);
			pelicula.setSynopsis(synopsis);
			pelicula.setTrailer(trailer);
			//pelicula.setPoster(poster);
			pelicula.setEstado(false);
			pelicula.setUsuario(usuario);

			 //Guardo la pelicula
			this.peliculaService.add(pelicula);
			
			// Nota: Al director y actores se los agrega  usando los servlets de asociar peliculas con actores y director
			System.out.println("Datos guardados");
			request.setAttribute("tipoMensaje", "alert alert-dismissable alert-success");
	        request.setAttribute("mensajeResultado", "Pelicula agregada. Pendiente a ser aceptada o rechazada..");	     
		}
		catch (Exception e){
			System.out.println(e.getMessage());
			request.setAttribute("tipoMensaje", "alert alert-dismissable alert-danger");
	        request.setAttribute("mensajeResultado", "No se pudo cargar la pelicula. Reintente por favor.");
			request.getRequestDispatcher("/AgregarPelicula.jsp").forward(request, response);
			return;
		}
	
		
		request.getRequestDispatcher("/AgregarPelicula.jsp").forward(request, response);
	
	}
}
