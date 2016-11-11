package dao;

import java.util.List;

import model.*;

public interface DAOActores {
	
	List<Actores> getAll();	
		
	Actores getById(Integer id_actor);
	
	void update(Actores actor);
	
	void delete(Actores actor);

	void save(Actores actor);
	
    List<Actores> getUltimasActivas();
	
	List<Actores> getInactivas(int offset, int cantRegistros);
	
	int getCantInactivas();
	
	List<Actores> getActivas();
}
