package dao;

import java.util.List;

import model.*;

public interface DAOPeliculas {

	List<Peliculas> getAll();	
	
	Peliculas getById(Integer id_pelicula);
	
	void update(Peliculas pelicula);
	
	void delete(Integer id_pelicula);

	void save(Peliculas pelicula);

}
