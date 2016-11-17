package service;

import model.Secciones;

public interface ServiceSecciones {

	public void save(Secciones seccion);
	
	public Secciones getById(Integer id_seccion);

	public void update(Secciones seccion);
	
}
