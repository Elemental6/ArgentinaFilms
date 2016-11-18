package presentation;
	 
 	import java.io.IOException;
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
 	 
 	import com.google.gson.Gson;
 	 
 	import service.ServicePelicula;
 	 
 	 
 	@SuppressWarnings("serial")
 	@WebServlet("/ListarDiezPeliculasMasVisitadas")
 	public class ServletListarDiezPeliculasMasVisitadas extends HttpServlet{
 	 
 	  public ServicePelicula servicePelicula = null;
 	  
 	  @Override
 	  public void init(ServletConfig config) {
 	    WebApplicationContext context = WebApplicationContextUtils.getRequiredWebApplicationContext(config.getServletContext());
 	    this.servicePelicula = (ServicePelicula) context.getBean(ServicePelicula.class);
 	  }
 	  
 	  
 	  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 	    
 	    List<Peliculas> peliculas = this.servicePelicula.getDiezMasVisitadas();
 	    
 	    String json = new Gson().toJson(peliculas);
 	  
 	    response.setContentType("application/json"); 
 	    response.setCharacterEncoding("UTF-8"); 
 	    response.getWriter().write(json);
 	  }
 	} 