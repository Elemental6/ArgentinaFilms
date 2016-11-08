package dao;

import java.util.List;

import model.*;

public interface DAOPeliculas {

	List<Peliculas> getAll();	
	
	List<Peliculas> getUltimasCuatroActivas();
	
	List<Peliculas> getInactivas();
	
	List<Peliculas> getActivas();
	
	Peliculas getById(Integer id_pelicula);
	
	void update(Peliculas pelicula);
	
	void delete(Peliculas pelicula);

	void save(Peliculas pelicula);

	List<Peliculas> getByTextoEnNombre(String texto);

}
