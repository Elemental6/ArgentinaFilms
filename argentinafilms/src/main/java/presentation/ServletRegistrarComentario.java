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

/**
 * Servlet implementation class ServletRegistrarComentario
 */
@WebServlet("/ServletRegistrarComentario")
public class ServletRegistrarComentario extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public DAOComentarios comentarioService = null;
	public DAOResenias reseniaService = null;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletRegistrarComentario() {
        super();
       
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
		// TODO: Validar datos como la gente / Separar en capa de servicio si hay tiempo
		
				try{
					
					String comentario_string = request.getParameter("comentario");
					// Obtengo el usuario que esta logeado
					Usuarios usuario =  (Usuarios) request.getSession().getAttribute("Usuario");
					
					// Si se registra un nuevo comentario su puntaje sera 0
					Integer puntaje = 0;
					
					Comentarios comentario = new Comentarios(comentario_string, puntaje, usuario);
					// Primero guardo el comentario
					this.comentarioService.save(comentario);
					// Traigo la resenia a la cual se quiere agregar el comentario
					Resenias resenia = this.reseniaService.getById(Integer.parseInt(request.getParameter("id_resenia")));
					List<Comentarios> resenia_comentarios = resenia.getComentarios();
					// A esta resenia le agrego el comentario nuevo
					resenia_comentarios.add(comentario);
					resenia.setComentarios(resenia_comentarios);
					// Y la actualizo para que se asocie el nuevo comentario con la resenia
					this.reseniaService.update(resenia);
					
					System.out.println("Datos guardados");					
				}
					
						
				catch (Exception e){
					System.out.println(e.getMessage());
				}
	}
	@Override
	public void init(ServletConfig config) {
		WebApplicationContext context = WebApplicationContextUtils
				.getRequiredWebApplicationContext(config.getServletContext());
		this.comentarioService = (DAOComentarios) context.getBean(DAOComentarios.class);
		this.reseniaService = (DAOResenias) context.getBean(DAOResenias.class);
	}
}
