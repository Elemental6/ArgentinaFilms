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

import model.Usuarios;
import service.ServiceUsuario;

/**
 * Servlet implementation class ServletDarDeBajaUsuario
 */
@WebServlet("/DarDeBajaUsuario")
public class ServletDarDeBajaUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
public ServiceUsuario serviceUsuario = null;
	
	@Override
	public void init(ServletConfig config) {
		WebApplicationContext context = WebApplicationContextUtils.getRequiredWebApplicationContext(config.getServletContext());
		this.serviceUsuario = (ServiceUsuario) context.getBean(ServiceUsuario.class);
	}
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletDarDeBajaUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String usuarioIngresado = request.getParameter("userSeleccionado");
	
		String pagina = request.getParameter("pagActual");
		
		Usuarios usuario = this.serviceUsuario.getByUserName(usuarioIngresado);
		//usuario.setRango(nuevoRango);
		usuario.setEstado(false);
		this.serviceUsuario.update(usuario);

		request.setAttribute("tipoMensaje", "alert alert-dismissable alert-success");
        request.setAttribute("mensajeResultado", "El usuario " + usuario.getUsuario() + "fue dado de baja.");
		response.sendRedirect("DarDeBajaUsuario.jsp?pagina=" + pagina);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
