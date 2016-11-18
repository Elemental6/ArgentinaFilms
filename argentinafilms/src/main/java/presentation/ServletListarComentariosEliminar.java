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

import dao.DAOComentarios;
import model.Comentarios;


/**
 * Servlet implementation class ServletListarComentariosEliminar
 */
@WebServlet("/ListarComentariosEliminar")
public class ServletListarComentariosEliminar extends HttpServlet {
	private static final long serialVersionUID = 1L;
public DAOComentarios serviceComentario = null;
	
	@Override
	public void init(ServletConfig config) {
		WebApplicationContext context = WebApplicationContextUtils.getRequiredWebApplicationContext(config.getServletContext());
		this.serviceComentario = (DAOComentarios) context.getBean(DAOComentarios.class);
	}
		
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int pagina = 1;
		int cantRegistrosXPagina = 10;
		int cantTotalRegistros = 0;
		List<Comentarios> comentarios = null;
		
		
		if(request.getParameter("pagina") != null)
            pagina = Integer.parseInt(request.getParameter("pagina"));
		
		
	
		comentarios = this.serviceComentario.getActivos((pagina-1)*cantRegistrosXPagina, cantRegistrosXPagina);
		    cantTotalRegistros = this.serviceComentario.getCantidad();
		
		
		
		int cantPaginas = (int) Math.ceil(cantTotalRegistros * 1.0 / cantRegistrosXPagina); 
		
		request.getSession().setAttribute("ComentariosEliminar", comentarios);
		request.setAttribute("cantPaginas", cantPaginas);
        request.setAttribute("paginaActual", pagina);
	}


}
