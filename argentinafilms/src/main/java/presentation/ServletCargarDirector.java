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

import service.ServiceDirector;
import model.Directores;

import com.google.gson.Gson;

/**
 * Servlet implementation class ServletCargarGenero
 */
@WebServlet("/ServletCargarDirector")
public class ServletCargarDirector extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public ServiceDirector directorService = null;  
   
    public ServletCargarDirector() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			List<Directores> directores  = new ArrayList<Directores>(); 
			directores = this.directorService.getAll();
			
			
					String json = new Gson().toJson(directores);
					
					response.setContentType("text/plain");
					response.getWriter().write(json);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void init(ServletConfig config) {
		WebApplicationContext context = WebApplicationContextUtils.getRequiredWebApplicationContext(config.getServletContext());
		this.directorService = (ServiceDirector) context.getBean(ServiceDirector.class);
		
	}
}
