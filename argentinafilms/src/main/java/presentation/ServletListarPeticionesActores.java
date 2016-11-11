package presentation;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import dao.DAOActores;
import model.Actores;
import model.Peliculas;
import service.ServicePelicula;

/**
 * Servlet implementation class ServletListarPeticionesActores
 */
@SuppressWarnings("serial")
@WebServlet("/ListarPeticionesActores")
public class ServletListarPeticionesActores extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public DAOActores actorService = null;

	@Override
	public void init(ServletConfig config) {
		WebApplicationContext context = WebApplicationContextUtils
				.getRequiredWebApplicationContext(config.getServletContext());
		this.actorService = (DAOActores) context.getBean(DAOActores.class);
	}
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletListarPeticionesActores() {
        super();


    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int pagina = 1;
		int cantRegistrosXPagina = 3;
		
		if(request.getParameter("pagina") != null)
            pagina = Integer.parseInt(request.getParameter("pagina"));
		
		List<Actores> actores = this.actorService.getInactivas((pagina-1)*cantRegistrosXPagina, cantRegistrosXPagina);
		
		int cantTotalRegistros = this.actorService.getCantInactivas();
		int cantPaginas = (int) Math.ceil(cantTotalRegistros * 1.0 / cantRegistrosXPagina); 
		
		request.getSession().setAttribute("peticionesActores", actores);
		request.setAttribute("cantPaginas", cantPaginas);
        request.setAttribute("paginaActual", pagina);
		response.sendRedirect("AceptarActores.jsp");
		
		

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		doGet(request, response);
	}

}
