package presentation;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import dao.DAOPuntajes;
import service.ServicePelicula;
import model.Peliculas;
import model.Puntajes;
import model.Usuarios;

/**
 * Servlet implementation class ServletVerPelicula
 */
@WebServlet("/ServletVerPelicula")
public class ServletVerPelicula extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	public ServicePelicula servicePelicula = null;
	public DAOPuntajes servicePuntaje = null;

    public ServletVerPelicula() {
        super();
        // TODO Auto-generated constructor stub
    }
	
	@Override
	public void init(ServletConfig config) {
		WebApplicationContext context = WebApplicationContextUtils.getRequiredWebApplicationContext(config.getServletContext());
		this.servicePelicula = (ServicePelicula) context.getBean(ServicePelicula.class);
		this.servicePuntaje = (DAOPuntajes) context.getBean(DAOPuntajes.class);
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("pelicula_id"));
		try{
			Peliculas pelicula = new Peliculas();
			pelicula = this.servicePelicula.getById(id);
			
			request.getSession().setAttribute("selectPelicula", pelicula);

			HttpSession sesion = request.getSession(true);
			Usuarios usuario =  (Usuarios) sesion.getAttribute("userLogueado");

			Puntajes puntajeUserLogueado = this.servicePuntaje.getByUsuarioYPelicula(usuario, pelicula);
			request.getSession().setAttribute("puntajeUserLogueado", puntajeUserLogueado);

			request.getRequestDispatcher("/VerPelicula.jsp").forward(request, response);

		}
		catch(NullPointerException e){
			response.sendRedirect("Error404.jsp");
			return;
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
