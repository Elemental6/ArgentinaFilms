package dao;

import java.util.List;

import model.*;

public interface DAOGeneros {

	List<Generos> getAll();	
	
	Generos getById(Integer id_genero);
	
	void update(Generos genero);
	
	void delete(Integer id_genero);

	void save(Generos genero);

}
