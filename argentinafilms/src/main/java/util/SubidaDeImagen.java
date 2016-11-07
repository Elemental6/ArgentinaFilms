package util;

import java.io.File;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
@SuppressWarnings({"rawtypes", "unused"})


public class SubidaDeImagen {

	
	public static String Subir(HttpServletRequest request, HttpServletResponse response, String ruta, String nombre){
		FileItemFactory factory = new DiskFileItemFactory();
		ServletFileUpload upload = new ServletFileUpload(factory);

		String appPath = request.getServletContext().getRealPath("");
		
		List items;
		try {
			items = upload.parseRequest(request);
			
			for (Object item : items) {
				   FileItem uploaded = (FileItem) item;

				   if (!uploaded.isFormField()) {
				      File fichero = new File(appPath + ruta, nombre);
				      try {
						uploaded.write(fichero);

					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				   } else {
				      String key = uploaded.getFieldName();
				      String valor = uploaded.getString();
				   }
				}
			
		} catch (FileUploadException e) {
			e.printStackTrace();
		}
		

		return ruta + nombre;
		
	}
	
}
