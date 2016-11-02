package dao;

import java.util.List;

import model.*;

public interface DAODirectores {

	List<Directores> getAll();	
	
	Directores getById(Integer id_director);
	
	void update(Directores director);
	
	void delete(Integer id_director);

	void save(Directores director);

}
