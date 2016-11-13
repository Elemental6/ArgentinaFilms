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
import util.ValidarDatos;


/**
 * Servlet implementation class ServletRegistrarDirectores
 */
@WebServlet("/ServletRegistrarDirectores")
public class ServletRegistrarDirector extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public DAODirectores directorService = null;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletRegistrarDirector() {
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
			
				
				try{
					String nombre = request.getParameter("director_nombre");
					if (!ValidarDatos.validarNombresyApellidos(nombre)){						
						request.setAttribute("tipoMensaje", "alert alert-dismissible alert-danger");
						request.setAttribute("Mensajedismisable", "<a class=\"close\" data-dismiss=\"alert\" aria-label=\"close\">&times;</a>");
						request.setAttribute("mensajeResultado", "El nombre no permite caracteres especiales o numeros. Reintente por favor.");
						request.getRequestDispatcher("/AgregarDirector.jsp").forward(request, response);
						return;
					}
					
					String apellido = request.getParameter("director_apellido");
					if (!ValidarDatos.validarNombresyApellidos(apellido)){
						request.setAttribute("tipoMensaje", "alert alert-dismissible alert-danger");
						request.setAttribute("Mensajedismisable", "<a class=\"close\" data-dismiss=\"alert\" aria-label=\"close\">&times;</a>");
						request.setAttribute("mensajeResultado", "El apellido no permite caracteres especiales o numeros. Reintente por favor.");
						request.getRequestDispatcher("/AgregarDirector.jsp").forward(request, response);
						return;
					} 
					
					Integer edad = Integer.parseInt(request.getParameter("director_edad"));
					if (!ValidarDatos.validarInteger(request.getParameter("director_edad"))){
						request.setAttribute("tipoMensaje", "alert alert-dismissible alert-danger");
						request.setAttribute("Mensajedismisable", "<a class=\"close\" data-dismiss=\"alert\" aria-label=\"close\">&times;</a>");
						request.setAttribute("mensajeResultado", "La edad debe ser entre 1 y 120 anios. Reintente por favor.");
						request.getRequestDispatcher("/AgregarDirector.jsp").forward(request, response);
						return;
					}
					
					
						Directores director = new Directores (nombre,apellido,edad);
						// Guardar actor
						this.directorService.save(director);
									
						System.out.println("Datos guardados");
						request.setAttribute("tipoMensaje", "alert alert-dismissable alert-success");
				        request.setAttribute("mensajeResultado", "Director agregado");	     
					
					
				}		
				catch (Exception e){
					System.out.println(e.getLocalizedMessage());
					request.setAttribute("tipoMensaje", "alert alert-dismissable alert-danger");
			        request.setAttribute("mensajeResultado", "Datos incorrectos");
				}
			
		        request.getRequestDispatcher("/AgregarDirector.jsp").forward(request, response);
	}
	@Override
	public void init(ServletConfig config) {
		WebApplicationContext context = WebApplicationContextUtils
				.getRequiredWebApplicationContext(config.getServletContext());
		this.directorService = (DAODirectores) context.getBean(DAODirectores.class);
	
	}
}
