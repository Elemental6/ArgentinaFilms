package presentation;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Secciones;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.google.gson.Gson;

import service.ServiceSecciones;


@SuppressWarnings("serial")
@WebServlet("/ListarSecciones")
public class ServletListarSecciones extends HttpServlet{

	public ServiceSecciones serviceSecciones = null;
	
	@Override
	public void init(ServletConfig config) {
		WebApplicationContext context = WebApplicationContextUtils.getRequiredWebApplicationContext(config.getServletContext());
		this.serviceSecciones = (ServiceSecciones) context.getBean(ServiceSecciones.class);
	}
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Secciones> secciones = this.serviceSecciones.getAll();
		
		String json = new Gson().toJson(secciones);
	
		response.setContentType("application/json"); 
		response.setCharacterEncoding("UTF-8"); 
		response.getWriter().write(json);
	}
}
