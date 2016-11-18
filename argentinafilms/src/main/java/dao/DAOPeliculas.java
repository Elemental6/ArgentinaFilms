package dao;

import java.util.List;

import model.*;

public interface DAOPeliculas {

	List<Peliculas> getAll();	
	
	List<Peliculas> getUltimasActivas();
	
	List<Peliculas> getInactivas(int offset, int cantRegistros);
	
	List<Peliculas> getActivas();
	
	Peliculas getById(Integer id_pelicula);
	
	void update(Peliculas pelicula);
	
	void delete(Peliculas pelicula);

	void save(Peliculas pelicula);

	List<Peliculas> getByTextoEnNombre(String texto);
	
	List<Peliculas> getByActor(int id);
	
	List<Peliculas> getByDirector(int id);
	
	List<Peliculas> getByUsuario(String id);
	
	Peliculas getByResenia(int id);

	int getCantInactivas();

	List<Peliculas> getDiezMasVisitadas();
	
	 int getCantActivas();
	
	 List<Peliculas> getByNombre(String texto, int offset, int cantRegistros);
	
	List<Peliculas> getActivos(int offset, int cantRegistros) ;


}
