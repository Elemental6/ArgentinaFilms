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

import com.google.gson.Gson;

import dao.DAOActores;
import model.Actores;
import model.Peliculas;
import service.ServicePelicula;

/**
 * Servlet implementation class ServletAceptarPeticionActor
 */
@WebServlet("/AceptarPeticionActor")
public class ServletAceptarPeticionActor extends HttpServlet {
	private static final long serialVersionUID = 1L;
public DAOActores serviceActor = null;
	
	@Override
	public void init(ServletConfig config) {
		WebApplicationContext context = WebApplicationContextUtils.getRequiredWebApplicationContext(config.getServletContext());
		this.serviceActor = (DAOActores) context.getBean(DAOActores.class);
	}
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletAceptarPeticionActor() {
        super();
        // TODO Auto-generated constructor stub
    }

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
		System.out.println("Entro aceptar peticion actor");
		String json = new Gson().toJson("");
		int id = Integer.parseInt(request.getParameter("idSeleccionado"));

		Actores actor = this.serviceActor.getById(id);
		actor.setEstado(true);
		serviceActor.update(actor);

		json = new Gson().toJson("ok");
		response.setContentType("application/json"); 
		response.setCharacterEncoding("UTF-8"); 
		response.getWriter().write(json);
	}

}
