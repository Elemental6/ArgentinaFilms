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

import service.ServiceDirector;

import com.google.gson.Gson;

import model.Directores;

/**
 * Servlet implementation class ServletRechazarPeticionActor
 */
@WebServlet("/RechazarPeticionDirector")
public class ServletRechazarPeticionDirector extends HttpServlet {
	private static final long serialVersionUID = 1L;
public ServiceDirector serviceDirector = null;
	
	@Override
	public void init(ServletConfig config) {
		WebApplicationContext context = WebApplicationContextUtils.getRequiredWebApplicationContext(config.getServletContext());
		this.serviceDirector = (ServiceDirector) context.getBean(ServiceDirector.class);
	}
    /**
     * @see HttpServlet#HttpServlet()
     */

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String json = new Gson().toJson("");
		Integer id = Integer.parseInt(request.getParameter("idSeleccionado"));
		
	
		Directores director = new Directores();
		director.setId_director(id);
		serviceDirector.delete(director);
		
		System.out.println("Entro Rechazar peticion director +> " + id);
		json = new Gson().toJson("ok");
		response.setContentType("application/json"); 
		response.setCharacterEncoding("UTF-8"); 
		response.getWriter().write(json);
	}

}
