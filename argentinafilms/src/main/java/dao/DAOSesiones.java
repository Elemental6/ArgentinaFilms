package dao;

import java.util.List;

import model.*;

public interface DAOSesiones {

	List<Sesiones> getAll();	
	
	Sesiones getById(Integer id_sesion);
	
	void update(Sesiones sesion);
	
	void delete(Integer id_sesion);

	void save(Sesiones sesion);

}
