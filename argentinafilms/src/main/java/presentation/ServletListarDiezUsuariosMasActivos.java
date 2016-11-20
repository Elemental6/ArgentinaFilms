package presentation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Peliculas;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import dto.PeliculaCantResenias;
import service.ServicePelicula;


@SuppressWarnings("serial")
@WebServlet("/ListarDiezUsuariosMasActivos")
public class ServletListarDiezUsuariosMasActivos extends HttpServlet{

	public ServicePelicula servicePelicula = null;
	
	@Override
	public void init(ServletConfig config) {
		WebApplicationContext context = WebApplicationContextUtils.getRequiredWebApplicationContext(config.getServletContext());
		this.servicePelicula = (ServicePelicula) context.getBean(ServicePelicula.class);
	}
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		
//		ArrayList<PeliculaCantResenias> peliculasMasReseniadas = new ArrayList<PeliculaCantResenias>();
//		ArrayList<PeliculaCantResenias> diezPeliculasMasReseniadas = new ArrayList<PeliculaCantResenias>();
//		List<Peliculas> peliculas = this.servicePelicula.getActivas();
//
//		for(Peliculas pelicula : peliculas)
//		{
//			PeliculaCantResenias peliculaResenia = new PeliculaCantResenias(pelicula, pelicula.getResenias().size());
//			peliculasMasReseniadas.add(peliculaResenia);
//		}
//
//		Collections.sort(peliculasMasReseniadas, Collections.reverseOrder());
//
//		for(PeliculaCantResenias pelicula : peliculasMasReseniadas)
//			System.out.println(pelicula.getCant_resenias());
//		
//		
//		diezPeliculasMasReseniadas.add(peliculasMasReseniadas.get(0));
//		diezPeliculasMasReseniadas.add(peliculasMasReseniadas.get(1));
//		diezPeliculasMasReseniadas.add(peliculasMasReseniadas.get(2));
//		diezPeliculasMasReseniadas.add(peliculasMasReseniadas.get(3));
//		diezPeliculasMasReseniadas.add(peliculasMasReseniadas.get(4));
//		diezPeliculasMasReseniadas.add(peliculasMasReseniadas.get(5));
//		diezPeliculasMasReseniadas.add(peliculasMasReseniadas.get(6));
//		diezPeliculasMasReseniadas.add(peliculasMasReseniadas.get(7));
//		diezPeliculasMasReseniadas.add(peliculasMasReseniadas.get(8));
//		diezPeliculasMasReseniadas.add(peliculasMasReseniadas.get(9));
//		
//		request.setAttribute("diezPeliculasMasReseniadas", diezPeliculasMasReseniadas);
		
	}
	
		

}