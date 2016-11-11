package service;

import java.util.List;

import model.Peliculas;

public interface ServicePelicula {
	
	public List<Peliculas> getAll();
	
	public List<Peliculas> getActivas();
	
	public List<Peliculas> getUltimasCuatroActivas();
	
	List<Peliculas> getInactivas(int offset, int cantRegistros);
	
	public Peliculas getById(int id);
	
	public void add(Peliculas pelicula);
	
	public void update(Peliculas pelicula);
	
	public void delete(Peliculas pelicula);

	List<Peliculas> getByTextoEnNombre(String texto);

	public List<Peliculas> getByActor(int id);

	public int getCantInactivas();
}
