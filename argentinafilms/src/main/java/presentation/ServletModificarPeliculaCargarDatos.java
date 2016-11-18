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

import service.ServicePelicula;
import model.Peliculas;

/**
 * Servlet implementation class ModificarPelicula
 */
@WebServlet("/ModificarPeliculaCargarDatos")
public class ServletModificarPeliculaCargarDatos extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public ServicePelicula servicePelicula = null;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletModificarPeliculaCargarDatos() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
    public void init(ServletConfig config) {
		WebApplicationContext context = WebApplicationContextUtils.getRequiredWebApplicationContext(config.getServletContext());
		this.servicePelicula = (ServicePelicula) context.getBean(ServicePelicula.class);
		
	}
    
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try{
			Integer id = Integer.parseInt(request.getParameter("id"));
		
			Peliculas pelicula = this.servicePelicula.getById(id);
			
			
			String json = new Gson().toJson(pelicula);
			
			response.setContentType("text/plain");
			response.getWriter().write(json);
		}
		catch(NumberFormatException e){
			request.getSession().setAttribute("error404", true);
		}


	}



		
		
	}


