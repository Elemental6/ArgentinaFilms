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
import dao.DAOResenias;
import model.Comentarios;
import model.Resenias;
import model.Usuarios;
import util.ValidarDatos;

/**
 * Servlet implementation class ServletComentarios
 */
@WebServlet("/Comentarios")
public class ServletComentarios extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public DAOResenias serviceResenias = null;
	public DAOComentarios serviceComentarios = null;
	@Override
	public void init(ServletConfig config) {
		WebApplicationContext context = WebApplicationContextUtils.getRequiredWebApplicationContext(config.getServletContext());
		this.serviceResenias = (DAOResenias) context.getBean(DAOResenias.class);
		this.serviceComentarios = (DAOComentarios) context.getBean(DAOComentarios.class);
	}
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletComentarios() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if (!ValidarDatos.validarInteger(request.getParameter("resenia_id"))){
			request.getSession().setAttribute("error404", true);
		}
		Integer id = Integer.parseInt(request.getParameter("resenia_id"));
		Resenias resenia = serviceResenias.getById(id);
		request.getSession().setAttribute("ReseniaComentarios", resenia);
		List<Comentarios> comentarios =resenia.getComentarios();
		request.getSession().setAttribute("Comentarios", comentarios);
		response.sendRedirect("Comentarios.jsp");
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		if (request.getSession().getAttribute("ReseniaComentarios").equals(null)){
			request.getRequestDispatcher("Inicio.jsp").forward(request, response);
		}
		
		Resenias resenia = (Resenias) request.getSession().getAttribute("ReseniaComentarios");		
		try {
			if (request.getParameter("comentariotxt").equals(null)){
				request.setAttribute("tipoMensaje", "alert alert-dismissible alert-danger");
				request.setAttribute("Mensajedismisable", "<a class=\"close\" data-dismiss=\"alert\" aria-label=\"close\">&times;</a>");
				request.setAttribute("mensajeResultado", "El comentario no puede ser nulo. Reintente por favor.");
				request.getRequestDispatcher("Comentarios?resenia_id="+ resenia.getId_resenia()).forward(request, response);
				return;
			}
			String comentarioCreado = request.getParameter("comentariotxt");
			String comentarioCreadoSaltosLinea = comentarioCreado.replace("\n", "<br />");
			
			if (request.getSession().getAttribute("userLogueado").equals(null)){
				request.setAttribute("tipoMensaje", "alert alert-dismissible alert-danger");
				request.setAttribute("Mensajedismisable", "<a class=\"close\" data-dismiss=\"alert\" aria-label=\"close\">&times;</a>");
				request.setAttribute("mensajeResultado", "Ingrese al sistema antes de agregar comentarios. Reintente por favor.");
				request.getRequestDispatcher("Comentarios?resenia_id="+ resenia.getId_resenia()).forward(request, response);
				return;
			}
			//Obtengo el usuario que esta logueado
			Usuarios usuario = (Usuarios) request.getSession().getAttribute("userLogueado");
			
			
		 
	        
	        List<Comentarios> comentarios = resenia.getComentarios();
	        Comentarios comentario = new Comentarios(comentarioCreadoSaltosLinea, 0, usuario);
	        comentarios.add(comentario);
	        resenia.setComentarios(comentarios);
			
	        this.serviceComentarios.save(comentario);
	        this.serviceResenias.update(resenia);
	        
	    	request.setAttribute("tipoMensaje", "alert alert-dismissable alert-success");
	        request.setAttribute("mensajeResultado", "Comentario agregado");	
			
			System.out.println("Comentario guardado");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}		
		
		response.sendRedirect("Comentarios?resenia_id="+ resenia.getId_resenia());
		
	}

}
