package presentation;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Usuarios;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import service.ServiceUsuario;


@SuppressWarnings("serial")
@WebServlet("/ListarUsuarios")
public class ServletListarUsuarios extends HttpServlet{



	public ServiceUsuario serviceUsuario = null;
	
	@Override
	public void init(ServletConfig config) {
		WebApplicationContext context = WebApplicationContextUtils.getRequiredWebApplicationContext(config.getServletContext());
		this.serviceUsuario = (ServiceUsuario) context.getBean(ServiceUsuario.class);
	}
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int pagina = 1;
		int cantRegistrosXPagina = 10;
		int cantTotalRegistros = 0;
		List<Usuarios> usuarios = null;
		String busqueda = request.getParameter("buscar");
		
		if(request.getParameter("pagina") != null)
            pagina = Integer.parseInt(request.getParameter("pagina"));
		
		
		if(request.getParameter("buscar") != null){
            usuarios = this.serviceUsuario.getByNombre(busqueda, (pagina-1)*cantRegistrosXPagina, cantRegistrosXPagina);
            cantTotalRegistros = this.serviceUsuario.getCantActivos();
		}
		else{
			usuarios = this.serviceUsuario.getActivos((pagina-1)*cantRegistrosXPagina, cantRegistrosXPagina);
			cantTotalRegistros = this.serviceUsuario.getCantActivos();
		}
		
		
		int cantPaginas = (int) Math.ceil(cantTotalRegistros * 1.0 / cantRegistrosXPagina); 
		
		request.getSession().setAttribute("usuarios", usuarios);
		request.setAttribute("cantPaginas", cantPaginas);
        request.setAttribute("paginaActual", pagina);


	}
	
	
}
