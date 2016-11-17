package service;

import java.util.List;

import model.Secciones;

public interface ServiceSecciones {

	public void save(Secciones seccion);
	
	public Secciones getById(Integer id_seccion);

	public void update(Secciones seccion);

	public List<Secciones> getAll();
	
}
