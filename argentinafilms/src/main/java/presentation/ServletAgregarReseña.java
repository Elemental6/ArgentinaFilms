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

import model.Resenias;
import model.Usuarios;
import service.ServiceResenia;

/**
 * Servlet implementation class ServletAgregarReseña
 */
@SuppressWarnings("serial")
@WebServlet("/AgregarReseña")
public class ServletAgregarReseña extends HttpServlet {
       
    public ServiceResenia serviceResenia = null;

    public void init(ServletConfig config) {
    	WebApplicationContext context = WebApplicationContextUtils.getRequiredWebApplicationContext(config.getServletContext());
    	this.serviceResenia = (ServiceResenia) context.getBean(ServiceResenia.class);
    }
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
		try {
			String reseniaCreada = request.getParameter("inputResenia");
			
			//Obtengo el usuario que está logueado
			Usuarios usuario = (Usuarios) request.getSession().getAttribute("Usuario");
			
			
			Resenias resenia = new Resenias();
			
			resenia.setUsuario(usuario);
			resenia.setResenia(reseniaCreada);
			
			//Guardo el comentario
			this.serviceResenia.add(resenia);
			
			System.out.println("Reseña guardada");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
