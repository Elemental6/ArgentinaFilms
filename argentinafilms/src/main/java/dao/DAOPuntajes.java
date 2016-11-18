package dao;

import java.util.List;

import model.*;

public interface DAOPuntajes {

	List<Puntajes> getAll();	
	
	Puntajes getById(Integer id_puntaje);
	
	void update(Puntajes puntaje);
	
	void delete(Integer id_puntaje);

	void save(Puntajes puntaje);

	Puntajes getByUsuarioYPelicula(Usuarios usuario, Peliculas id_pelicula);

	List<Puntajes> getByPelicula(int id);

}
