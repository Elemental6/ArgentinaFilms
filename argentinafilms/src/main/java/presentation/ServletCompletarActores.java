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

import com.google.gson.Gson;

import service.ServiceActor;
import model.Actores;

/**
 * Servlet implementation class ServletCompletarActores
 */
@WebServlet("/ServletCompletarActores")
public class ServletCompletarActores extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public ServiceActor actorService = null;  
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletCompletarActores() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			List<Actores> actores  = new ArrayList<Actores>(); 
			actores = this.actorService.getAll();
			
			
					String json = new Gson().toJson(actores);
					
					response.setContentType("text/plain");
					response.getWriter().write(json);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		
		
		
	    //adding some data

	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	public void init(ServletConfig config) {
		WebApplicationContext context = WebApplicationContextUtils.getRequiredWebApplicationContext(config.getServletContext());
		this.actorService = (ServiceActor) context.getBean(ServiceActor.class);
		
	}
	
	
}
