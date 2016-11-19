package presentation;

import java.io.IOException;
import java.util.ArrayList;
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

/**
 * Servlet implementation class EliminarComentario
 */
@WebServlet("/EliminarComentario")
public class EliminarComentario extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public DAOComentarios serviceComentario = null;
	public DAOResenias serviceResenia = null;
	@Override
	public void init(ServletConfig config) {
		WebApplicationContext context = WebApplicationContextUtils
				.getRequiredWebApplicationContext(config.getServletContext());
		this.serviceComentario = (DAOComentarios) context.getBean(DAOComentarios.class);
		this.serviceResenia = (DAOResenias) context.getBean(DAOResenias.class);

	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Integer comentarioSeleccionado = Integer
				.parseInt(request.getParameter("comentarioSeleccionada"));

		String pagina = request.getParameter("pagActual");

		Comentarios comentario = this.serviceComentario.getById(comentarioSeleccionado);
		List<Resenias> resenias = this.serviceResenia.getAll();
		for (Resenias resenia : resenias) {
			List<Comentarios> comentarios_resenias = resenia.getComentarios();

			for (Comentarios comentario_filtrar : comentarios_resenias) {

				if (comentario.getComentario_id().equals(comentario_filtrar.getComentario_id())) {
					List<Comentarios> actualizados = new ArrayList<Comentarios>();
					for (Comentarios comentario_filtrar2 : comentarios_resenias) {
						if (!comentario_filtrar2.getComentario_id()
								.equals(comentario.getComentario_id())) {
							actualizados.add(comentario_filtrar2);
						}

					}				

					resenia.setComentarios(actualizados);
					this.serviceResenia.update(resenia);
					this.serviceComentario.delete(comentario);
				}
			}
		}

		request.setAttribute("tipoMensaje", "alert alert-dismissable alert-success");
		request.setAttribute("mensajeResultado", "Comentario eliminado.");
		response.sendRedirect("EliminarComentario.jsp?pagina=" + pagina);
	}

}
