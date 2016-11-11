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

import dao.DAOUsuario;
import model.Peliculas;
import model.Usuarios;
import service.ServicePelicula;

/**
 * Servlet implementation class ServletVerPerfil
 */
@WebServlet("/ServletVerPerfil")
public class ServletVerPerfil extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public DAOUsuario serviceUsuarios = null;
	@Override
	public void init(ServletConfig config) {
		WebApplicationContext context = WebApplicationContextUtils.getRequiredWebApplicationContext(config.getServletContext());
		this.serviceUsuarios = (DAOUsuario) context.getBean(DAOUsuario.class);
	}
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletVerPerfil() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		String usuariostring = request.getParameter("usuario");
		try{
			Usuarios usuario = new Usuarios();
			usuario = this.serviceUsuarios.getByUserName(usuariostring);
						
			request.getSession().setAttribute("perfilUsuario", usuario);
			//response.sendRedirect("VerPerfil.jsp");
			request.getRequestDispatcher("/VerPerfil.jsp").forward(request, response);

			
			
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
		doGet(request, response);
	}

}
