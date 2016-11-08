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
		
					
				
				
				Integer errores = 0;
				try{
					String nombre = request.getParameter("director_nombre");
					if (!ValidarDatos.validarString(nombre)) errores++;	
					
					String apellido = request.getParameter("director_apellido");
					if (!ValidarDatos.validarString(apellido)) errores++;
					
					Integer edad = Integer.parseInt(request.getParameter("director_edad"));
					if (!ValidarDatos.validarInteger(request.getParameter("director_edad"))) errores++;
					
					if (errores == 0){
						Directores director = new Directores (nombre,apellido,edad);
						// Guardar actor
						this.directorService.save(director);
									
						System.out.println("Datos guardados");
						request.setAttribute("tipoMensaje", "alert alert-dismissable alert-success");
				        request.setAttribute("mensajeResultado", "Director agregado");	     
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
		        request.getRequestDispatcher("/AgregarDirector.jsp").forward(request, response);
	}
	@Override
	public void init(ServletConfig config) {
		WebApplicationContext context = WebApplicationContextUtils
				.getRequiredWebApplicationContext(config.getServletContext());
		this.directorService = (DAODirectores) context.getBean(DAODirectores.class);
	
	}
}
