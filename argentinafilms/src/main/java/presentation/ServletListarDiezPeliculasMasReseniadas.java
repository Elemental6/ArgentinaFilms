//package presentation;
//
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//
//import javax.servlet.ServletConfig;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import model.Peliculas;
//
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.web.context.WebApplicationContext;
//import org.springframework.web.context.support.WebApplicationContextUtils;
//
//import com.google.gson.Gson;
//
//import config.AppConfig;
//import dto.PeliculaCantResenias;
//import service.ServicePelicula;
//
//
//@SuppressWarnings("serial")
//@WebServlet("/ListarDiezPeliculasMasVisitadas")
//public class ServletListarDiezPeliculasMasReseniadas extends HttpServlet{
//
//	public ServicePelicula servicePelicula = null;
//	
//	@Override
//	public void init(ServletConfig config) {
//		WebApplicationContext context = WebApplicationContextUtils.getRequiredWebApplicationContext(config.getServletContext());
//		this.servicePelicula = (ServicePelicula) context.getBean(ServicePelicula.class);
//	}
//	
//	
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		
//		
//		ArrayList<PeliculaCantResenias> peliculasMasReseniadas = new ArrayList<PeliculaCantResenias>();
//		
//		List<Peliculas> peliculas = this.servicePelicula.getActivas();
//
//		
//		for(Peliculas pelicula : peliculas)
//		{
//			PeliculaCantResenias peliculaResenia = new PeliculaCantResenias(pelicula.getNombre(), pelicula.getResenias().size());
//
//			peliculasMasReseniadas.add(peliculaResenia);
//			
//		}
//		
//		
//		int max = 0;
//		
//		for(DTOCantidadVentasXVendedor ventasXvendedor : ventasXvendedores){
//
//			if(ventasXvendedor.getCantVentas() > max){
//				max = ventasXvendedor.getCantVentas();
//				mejorVendedorDelMes = servicioEmpleado.ConseguirXDNI(ventasXvendedor.getDni());
//			}
//		}
//		
//		return mejorVendedorDelMes;
//		
//	}
//	
//		
//		String json = new Gson().toJson(peliculas);
//	
//		response.setContentType("application/json"); 
//		response.setCharacterEncoding("UTF-8"); 
//		response.getWriter().write(json);
//	}
//}