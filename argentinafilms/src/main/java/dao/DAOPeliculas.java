package dao;

import java.util.List;

import model.*;

public interface DAOPeliculas {

	List<Peliculas> getAll();	
	
	List<Peliculas> getLastThree();
	
	Peliculas getById(Integer id_pelicula);
	
	void update(Peliculas pelicula);
	
	void delete(Integer id_pelicula);

	void save(Peliculas pelicula);

}
