package presentation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import service.ServiceActor;
import service.ServiceGenero;
import model.Actores;
import model.Generos;

import com.google.gson.Gson;

/**
 * Servlet implementation class ServletCargarGenero
 */
@WebServlet("/ServletCargarGenero")
public class ServletCargarGenero extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public ServiceGenero generoService = null;  
   
    public ServletCargarGenero() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			List<Generos> generos  = new ArrayList<Generos>(); 
			generos = this.generoService.getAll();
			
			
					String json = new Gson().toJson(generos);
					
					response.setContentType("text/plain");
					response.getWriter().write(json);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void init(ServletConfig config) {
		WebApplicationContext context = WebApplicationContextUtils.getRequiredWebApplicationContext(config.getServletContext());
		this.generoService = (ServiceGenero) context.getBean(ServiceGenero.class);
		
	}
}
