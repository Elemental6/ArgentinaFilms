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

import service.ServicePelicula;
import model.Peliculas;

@SuppressWarnings("serial")
@WebServlet("/ServletListarUltimasPeliculas")
public class ServletListarUltimasPeliculas extends HttpServlet{

	public ServicePelicula peliculaService = null;
	
	@Override
	public void init(ServletConfig config) {
		WebApplicationContext context = WebApplicationContextUtils
				.getRequiredWebApplicationContext(config.getServletContext());
		this.peliculaService = (ServicePelicula) context.getBean(ServicePelicula.class);
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Peliculas> peliculas = this.peliculaService.getUltimasCuatroActivas();
		request.getSession().setAttribute("UltimasPeliculas", peliculas);
	}
	
}
