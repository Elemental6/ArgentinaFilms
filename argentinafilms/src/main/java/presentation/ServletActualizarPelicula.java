package presentation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import service.ServiceActor;
import service.ServiceDirector;
import service.ServiceGenero;
import service.ServicePelicula;
import util.CodigoAleatorio;
import util.ValidarDatos;
import model.*;

@WebServlet("/ServletActualizarPelicula")
@MultipartConfig
public class ServletActualizarPelicula extends HttpServlet {

	String rutaAbsoluta = null;
	String rutaRelativa = "imgs/peliculas";

	private static final long serialVersionUID = 1L;
	public ServicePelicula peliculaService = null;
	public ServiceGenero generosService = null;
	public ServiceDirector directoresService = null;
	public ServiceActor actoresService = null;

	private static final int THRESHOLD_SIZE = 1024 * 1024 * 3; // 3MB
	private static final int MAX_FILE_SIZE = 1024 * 1024 * 40; // 40MB
	private static final int MAX_REQUEST_SIZE = 1024 * 1024 * 50; // 50MB

	public ServletActualizarPelicula() {
		super();

	}
	@Override
	public void init(ServletConfig config) {
		WebApplicationContext context = WebApplicationContextUtils
				.getRequiredWebApplicationContext(config.getServletContext());
		this.peliculaService = (ServicePelicula) context.getBean(ServicePelicula.class);
		this.generosService = (ServiceGenero) context.getBean(ServiceGenero.class);
		this.directoresService = (ServiceDirector) context.getBean(ServiceDirector.class);
		this.actoresService = (ServiceActor) context.getBean(ServiceActor.class);

		rutaAbsoluta = config.getServletContext().getRealPath(rutaRelativa);
	}

	@SuppressWarnings({"rawtypes", "unused"})
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			if (!ValidarDatos.validarInteger(request.getParameter("id_pelicula_modificar"))) {
				request.setAttribute("tipoMensaje", "alert alert-dismissible alert-danger");
				request.setAttribute("Mensajedismisable",
						"<a class=\"close\" data-dismiss=\"alert\" aria-label=\"close\">&times;</a>");
				request.setAttribute("mensajeResultado",
						"El ID de la pelicula es invalido. Reintente por favor.");
				request.getRequestDispatcher("/AgregarPelicula.jsp").forward(request, response);
				return;

			}

			Integer pelicula_id = Integer.parseInt(request.getParameter("id_pelicula_modificar"));

			Peliculas pelicula = this.peliculaService.getById(pelicula_id);

			Usuarios usuario = (Usuarios) request.getSession().getAttribute("userLogueado");
			String nombre = null;
			Integer anio = null;
			Integer duracion = null;
			String synopsis = null;
			String synopsisSaltosLinea = null;
			Integer puntuacion_total = 0;
			String trailer = null;
			Integer id_genero = null;
			String poster = null;
			String nombreImagenPoster = null;

			Generos genero = new Generos();
			Integer id_director = null;
			String id_actor = null;

			try {
				synopsis = request.getParameter("txtAreaSynospsis");
				if (synopsis.equals(null)) {
					request.setAttribute("tipoMensaje", "alert alert-dismissible alert-danger");
					request.setAttribute("Mensajedismisable",
							"<a class=\"close\" data-dismiss=\"alert\" aria-label=\"close\">&times;</a>");
					request.setAttribute("mensajeResultado",
							"La synopsis no puede ser nula. Reintente por favor.");
					request.getRequestDispatcher("/AgregarPelicula.jsp").forward(request, response);
					return;
				}
				pelicula.setSynopsis(synopsis);

				nombre = request.getParameter("txtnombre");
				if (nombre.equals(null)) {
					request.setAttribute("tipoMensaje", "alert alert-dismissible alert-danger");
					request.setAttribute("Mensajedismisable",
							"<a class=\"close\" data-dismiss=\"alert\" aria-label=\"close\">&times;</a>");
					request.setAttribute("mensajeResultado",
							"El nombre de la pelicula no puede ser nulo. Reintente por favor.");
					request.getRequestDispatcher("/AgregarPelicula.jsp").forward(request, response);
					return;
				}
				pelicula.setNombre(nombre);
				anio = Integer.parseInt(request.getParameter("txtanio"));
				if (!ValidarDatos.validarInteger(request.getParameter("txtanio"))) {
					request.setAttribute("tipoMensaje", "alert alert-dismissible alert-danger");
					request.setAttribute("Mensajedismisable",
							"<a class=\"close\" data-dismiss=\"alert\" aria-label=\"close\">&times;</a>");
					request.setAttribute("mensajeResultado",
							"El anio de la pelicula debe ser un numero mayor que 1900. Reintente por favor.");
					request.getRequestDispatcher("/AgregarPelicula.jsp").forward(request, response);
					return;
				}
				pelicula.setAnio(anio);
				duracion = Integer.parseInt(request.getParameter("txtDuracion"));
				if (!ValidarDatos.validarInteger(request.getParameter("txtanio"))) {
					request.setAttribute("tipoMensaje", "alert alert-dismissible alert-danger");
					request.setAttribute("Mensajedismisable",
							"<a class=\"close\" data-dismiss=\"alert\" aria-label=\"close\">&times;</a>");
					request.setAttribute("mensajeResultado",
							"La duracion de la pelicula debe ser un numero mayor a 1 y menor a 300. Reintente por favor.");
					request.getRequestDispatcher("/AgregarPelicula.jsp").forward(request, response);
					return;
				}
				pelicula.setDuracion(duracion);
				trailer = request.getParameter("txtTrailer");
				trailer.trim();
				if (trailer.compareTo("") == 0) {
					trailer = "tjKqb-G6Fyc";
				}
				pelicula.setTrailer(trailer);

				if (request.getParameter("txtGenero").equals(null)) {
					request.setAttribute("tipoMensaje", "alert alert-dismissible alert-danger");
					request.setAttribute("Mensajedismisable",
							"<a class=\"close\" data-dismiss=\"alert\" aria-label=\"close\">&times;</a>");
					request.setAttribute("mensajeResultado",
							"Por favor seleccione un genero y reintente.");
					request.getRequestDispatcher("/AgregarPelicula.jsp").forward(request, response);
				}
				id_genero = Integer.parseInt(request.getParameter("txtGenero"));
				genero = this.generosService.getById(id_genero);
				pelicula.setGenero(genero);

				if (request.getParameter("txtdirector").equals(null)) {
					request.setAttribute("tipoMensaje", "alert alert-dismissible alert-danger");
					request.setAttribute("Mensajedismisable",
							"<a class=\"close\" data-dismiss=\"alert\" aria-label=\"close\">&times;</a>");
					request.setAttribute("mensajeResultado",
							"Por favor seleccione un Director y reintente.");
					request.getRequestDispatcher("/AgregarPelicula.jsp").forward(request, response);
				}
				id_director = Integer.parseInt(request.getParameter("txtdirector"));
				Directores director = this.directoresService.getById(id_director);
				pelicula.setDirector(director);

				if (request.getParameter("actoresIdS").equals(null)) {
					request.setAttribute("tipoMensaje", "alert alert-dismissible alert-danger");
					request.setAttribute("Mensajedismisable",
							"<a class=\"close\" data-dismiss=\"alert\" aria-label=\"close\">&times;</a>");
					request.setAttribute("mensajeResultado",
							"Por favor agrege al menos un actor y reintente.");
					request.getRequestDispatcher("/AgregarPelicula.jsp").forward(request, response);
				}
				id_actor = request.getParameter("actoresIdS");
				List<String> listaIds = Arrays.asList(id_actor.split("-"));
				Actores actor = new Actores();
				List<Actores> actores = new ArrayList<>();

				for (String elem : listaIds) {
					actor = this.actoresService.getById(Integer.parseInt(elem));
					actores.add(actor);// do whatever with
										// the element
				}

				pelicula.setActores(actores);

			} catch (Exception e) {
				e.printStackTrace();
			}

			/*
			 * if (item.getFieldName().equals("txtAreaSynospsis")) {
			 * 
			 * synopsis = item.getString();
			 * 
			 * if (synopsis.equals(null)){ request.setAttribute("tipoMensaje",
			 * "alert alert-dismissible alert-danger");
			 * request.setAttribute("Mensajedismisable",
			 * "<a class=\"close\" data-dismiss=\"alert\" aria-label=\"close\">&times;</a>"
			 * ); request.setAttribute("mensajeResultado",
			 * "La synopsis no puede ser nula. Reintente por favor." );
			 * request.getRequestDispatcher("/AgregarPelicula.jsp").
			 * forward(request, response); return; }
			 * 
			 * System.out.println("SYNOMPSIS: " + synopsis); }
			 */

			
			
			// TODO: Hacer que funcione la subida de imagen, a mi no me funciono //
			
			
			// checks if the request actually contains upload file
			if (!ServletFileUpload.isMultipartContent(request)) {
				PrintWriter writer = response.getWriter();
				
				//writer.println("Request does not contain upload data");
				writer.flush();
				request.setAttribute("tipoMensaje", "alert alert-dismissible alert-danger");
				request.setAttribute("Mensajedismisable",
						"<a class=\"close\" data-dismiss=\"alert\" aria-label=\"close\">&times;</a>");
				request.setAttribute("mensajeResultado",
						"La imagen no pudo ser subida, reintente por favor.");
				request.getRequestDispatcher("/AgregarPelicula.jsp").forward(request, response);
				
				return;
			}

			// configures upload settings
			DiskFileItemFactory factory = new DiskFileItemFactory();
			factory.setSizeThreshold(THRESHOLD_SIZE);
			factory.setRepository(new File(System.getProperty("java.io.tmpdir")));

			ServletFileUpload upload = new ServletFileUpload(factory);
			upload.setFileSizeMax(MAX_FILE_SIZE);
			upload.setSizeMax(MAX_REQUEST_SIZE);

			// constructs the directory path to store upload file
			// String uploadPath = getServletContext().getRealPath("")
			// + File.separator + UPLOAD_DIRECTORY;
			// // creates the directory if it does not exist
			// File uploadDir = new File(uploadPath);
			// if (!uploadDir.exists()) {
			// uploadDir.mkdir();
			// }

			try {
				// parses the request's content to extract file data
				List formItems = upload.parseRequest(request);
				Iterator iter = formItems.iterator();

				// iterates over form's fields
				while (iter.hasNext()) {
					FileItem item = (FileItem) iter.next();
					// processes only fields that are not form fields
					if (!item.isFormField()) {

						if ("file".equals(item.getFieldName())) {
							if (item.getName() == null || item.getName().isEmpty()) {
								nombreImagenPoster = "no-foto-film.jpg";
								poster = rutaRelativa + "/" + nombreImagenPoster;
							} else {
								nombreImagenPoster = CodigoAleatorio.getCadenaAlfanumAleatoria(15)
										+ ".jpg";
								poster = rutaRelativa + "/" + nombreImagenPoster;

								String fileName = new File(item.getName()).getName();
								// String filePath = uploadPath + File.separator
								// + fileName;
								File storeFile = new File(rutaAbsoluta, nombreImagenPoster);

								// saves the file on disk
								item.write(storeFile);
							}
						}

					}

				}
				System.out.println("Upload has been done successfully!");

			} catch (Exception ex) {
				ex.printStackTrace();
			}

			// String ubicacion = request.getParameter("txtUbicacion");

			pelicula.setNombre(nombre);
			pelicula.setAnio(anio);
			pelicula.setDuracion(duracion);
			// pelicula.setUbicacion(ubicacion);
			pelicula.setPuntuacion_total(puntuacion_total);

			synopsisSaltosLinea = synopsis.replace("\n", "<br />");

			pelicula.setSynopsis(synopsisSaltosLinea);
			pelicula.setTrailer(trailer);
			pelicula.setPoster(poster);
			pelicula.setEstado(false);
			pelicula.setUsuario(usuario);

			// Guardo la pelicula
			this.peliculaService.update(pelicula);

			System.out.println("Datos guardados");
			request.setAttribute("tipoMensaje", "alert alert-dismissable alert-success");
			request.setAttribute("mensajeResultado",
					"Pelicula modificada satisfactoriamente. Cambios pendientes a ser aceptados o rechazados..");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			request.setAttribute("tipoMensaje", "alert alert-dismissable alert-danger");
			request.setAttribute("mensajeResultado",
					"No se pudo modificar la pelicula. Reintente por favor.");
			request.getRequestDispatcher("/AgregarPelicula.jsp").forward(request, response);
			return;
		}

		request.getRequestDispatcher("/AgregarPelicula.jsp").forward(request, response);

	}
}
