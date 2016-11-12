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
import model.Actores;
import util.ValidarDatos;


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
		
		
		Integer errores = 0;
		try{
			String nombre = request.getParameter("actor_nombre");
			if (!ValidarDatos.validarString(nombre)) errores++;	
			
			String apellido = request.getParameter("actor_apellido");
			if (!ValidarDatos.validarString(apellido)) errores++;
			
			Integer edad = Integer.parseInt(request.getParameter("actor_edad"));
			if (!ValidarDatos.validarInteger(request.getParameter("actor_edad"))) errores++;
			
			if (errores == 0){
				Actores actor = new Actores (nombre,apellido,edad, false);
				// Guardar actor
				this.actorService.save(actor);
							
				System.out.println("Datos guardados");
				request.setAttribute("tipoMensaje", "alert alert-dismissable alert-success");
		        request.setAttribute("mensajeResultado", "Actor agregado");	     
			}
			
		}		
		catch (Exception e){
			System.out.println(e.getLocalizedMessage());
			
		}
		finally{
			if (errores >= 1){
				request.setAttribute("tipoMensaje", "alert alert-dismissable alert-danger");
		        request.setAttribute("mensajeResultado", "Datos incorrectos");
			}
		}
        request.getRequestDispatcher("/AgregarActor.jsp").forward(request, response);
	}
	@Override
	public void init(ServletConfig config) {
		WebApplicationContext context = WebApplicationContextUtils
				.getRequiredWebApplicationContext(config.getServletContext());
		this.actorService = (DAOActores) context.getBean(DAOActores.class);
		this.peliculaService = (DAOPeliculas) context.getBean(DAOPeliculas.class);
	}
}
