package dao;

import java.util.List;

import model.*;

public interface DAODirectores {

	List<Directores> getAll();	
	
	Directores getById(Integer id_director);
	
	void update(Directores director);
	
	void delete(Directores director);

	void save(Directores director);

	List<Directores> getInactivas(int offset, int cantRegistros);

	int getCantInactivas();

}
