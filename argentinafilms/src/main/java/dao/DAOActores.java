package dao;

import java.util.List;

import model.*;

public interface DAOActores {
	
	List<Actores> getAll();	
		
	Actores getById(Integer id_actor);
	
	void update(Actores actor);
	
	void delete(Integer dni);

	void save(Actores actor);
}
