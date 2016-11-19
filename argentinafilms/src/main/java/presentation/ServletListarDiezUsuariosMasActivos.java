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

import model.Comentarios;
import model.Puntajes;
import model.Resenias;
import model.Usuarios;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import dao.DAOPuntajes;
import dto.UsuarioActividad;
import service.ServiceComentario;
import service.ServiceResenia;
import service.ServiceUsuario;


@SuppressWarnings("serial")
@WebServlet("/ListarDiezUsuariosMasActivos")
public class ServletListarDiezUsuariosMasActivos extends HttpServlet{

	public ServiceResenia serviceResenia = null;
	public ServiceUsuario serviceUsuario = null;
	public ServiceComentario serviceComentario = null;
	public DAOPuntajes servicePuntaje = null;
	
	@Override
	public void init(ServletConfig config) {
		WebApplicationContext context = WebApplicationContextUtils.getRequiredWebApplicationContext(config.getServletContext());
		this.serviceUsuario = (ServiceUsuario) context.getBean(ServiceUsuario.class);
		this.serviceComentario = (ServiceComentario) context.getBean(ServiceComentario.class);
		this.serviceResenia= (ServiceResenia) context.getBean(ServiceResenia.class);
		this.servicePuntaje = (DAOPuntajes) context.getBean(DAOPuntajes.class);
	}
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Usuarios> usuarios = this.serviceUsuario.getActivos();
		List<Resenias> resenias = this.serviceResenia.getAll();
		List<Comentarios> comentarios = this.serviceComentario.getAll();
		List<Puntajes> puntajes = this.servicePuntaje.getAll();
		ArrayList<UsuarioActividad> usuariosActividad = new ArrayList<UsuarioActividad>();
		ArrayList<UsuarioActividad> diezUsuariosMasActivos = new ArrayList<UsuarioActividad>();
		
		
		for(Usuarios usuario : usuarios)
		{
			UsuarioActividad usuarioCantReseniasCantComentarios = new UsuarioActividad(usuario, 0, 0, 0, 0);
			
			for(Puntajes puntaje : puntajes)
			{
				if(puntaje.getUsuario().getUsuario().compareTo(usuario.getUsuario()) == 0)
				{
					usuarioCantReseniasCantComentarios.setCant_puntuadas(usuarioCantReseniasCantComentarios.getCant_puntuadas()+1);
					usuarioCantReseniasCantComentarios.setTotal_actividad(usuarioCantReseniasCantComentarios.getTotal_actividad()+1);
				}
			}
			
			for(Resenias resenia : resenias)
			{
				if(resenia.getUsuario().getUsuario().compareTo(usuario.getUsuario())==0)
				{
					usuarioCantReseniasCantComentarios.setCant_resenias(usuarioCantReseniasCantComentarios.getCant_resenias()+1);
					usuarioCantReseniasCantComentarios.setTotal_actividad(usuarioCantReseniasCantComentarios.getTotal_actividad()+1);
				}
			}
				
			for(Comentarios comentario : comentarios)
			{
				if(comentario.getUsuario().getUsuario().compareTo(usuario.getUsuario())==0)
				{
					usuarioCantReseniasCantComentarios.setCant_comentarios(usuarioCantReseniasCantComentarios.getCant_comentarios()+1);
					usuarioCantReseniasCantComentarios.setTotal_actividad(usuarioCantReseniasCantComentarios.getTotal_actividad()+1);
				}
			}
			
			 usuariosActividad.add(usuarioCantReseniasCantComentarios);
		}

		
		Collections.sort(usuariosActividad, Collections.reverseOrder());

		diezUsuariosMasActivos.add(usuariosActividad.get(0));
		diezUsuariosMasActivos.add(usuariosActividad.get(1));
		diezUsuariosMasActivos.add(usuariosActividad.get(2));
		diezUsuariosMasActivos.add(usuariosActividad.get(3));
		diezUsuariosMasActivos.add(usuariosActividad.get(4));
		diezUsuariosMasActivos.add(usuariosActividad.get(5));
		diezUsuariosMasActivos.add(usuariosActividad.get(6));
		diezUsuariosMasActivos.add(usuariosActividad.get(7));
		diezUsuariosMasActivos.add(usuariosActividad.get(8));
		diezUsuariosMasActivos.add(usuariosActividad.get(9));
		
		request.setAttribute("diezUsuariosMasActivos", diezUsuariosMasActivos);
		
	}
	
		

}