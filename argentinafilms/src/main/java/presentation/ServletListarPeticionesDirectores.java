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

import service.ServiceDirector;
import model.Directores;

/**
 * Servlet implementation class ServletListarPeticionesActores
 */

@WebServlet("/ListarPeticionesDirectores")
public class ServletListarPeticionesDirectores extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public ServiceDirector serviceDirector = null;

	@Override
	public void init(ServletConfig config) {
		WebApplicationContext context = WebApplicationContextUtils
				.getRequiredWebApplicationContext(config.getServletContext());
		this.serviceDirector = (ServiceDirector) context.getBean(ServiceDirector.class);
	}
    /**


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int pagina = 1;
		int cantRegistrosXPagina = 3;
		
		if(request.getParameter("pagina") != null)
            pagina = Integer.parseInt(request.getParameter("pagina"));
		
		List<Directores> directores = this.serviceDirector.getInactivas((pagina-1)*cantRegistrosXPagina, cantRegistrosXPagina);
		
		int cantTotalRegistros = this.serviceDirector.getCantInactivas();
		int cantPaginas = (int) Math.ceil(cantTotalRegistros * 1.0 / cantRegistrosXPagina); 
		
		request.getSession().setAttribute("peticionesDirectores", directores);
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
