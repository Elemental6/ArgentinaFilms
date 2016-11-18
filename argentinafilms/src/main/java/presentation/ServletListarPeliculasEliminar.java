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

import dao.DAOPeliculas;
import model.Peliculas;


/**
 * Servlet implementation class ServletListarPeliculasEliminar
 */
@WebServlet("/ListarPeliculasEliminar")
public class ServletListarPeliculasEliminar extends HttpServlet {
	private static final long serialVersionUID = 1L;
public DAOPeliculas servicePelicula = null;
	
	@Override
	public void init(ServletConfig config) {
		WebApplicationContext context = WebApplicationContextUtils.getRequiredWebApplicationContext(config.getServletContext());
		this.servicePelicula = (DAOPeliculas) context.getBean(DAOPeliculas.class);
	}
		 
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int pagina = 1;
		int cantRegistrosXPagina = 10;
		int cantTotalRegistros = 0;
		List<Peliculas> peliculas = null;
		String busqueda = request.getParameter("buscar");
		
		if(request.getParameter("pagina") != null)
            pagina = Integer.parseInt(request.getParameter("pagina"));
		
		
		if(request.getParameter("buscar") != null){
			peliculas = this.servicePelicula.getByNombre(busqueda, (pagina-1)*cantRegistrosXPagina, cantRegistrosXPagina);
            cantTotalRegistros = this.servicePelicula.getCantActivas();
            }
		else{
			peliculas = this.servicePelicula.getActivos((pagina-1)*cantRegistrosXPagina, cantRegistrosXPagina);
		    cantTotalRegistros = this.servicePelicula.getCantActivas();
		}
		
		
		int cantPaginas = (int) Math.ceil(cantTotalRegistros * 1.0 / cantRegistrosXPagina); 
		
		request.getSession().setAttribute("PeliculasEliminar", peliculas);
		request.setAttribute("cantPaginas", cantPaginas);
        request.setAttribute("paginaActual", pagina);
	}

	

}
