package service;

import java.util.List;
import model.Peliculas;

public interface ServicePelicula {
	
	public List<Peliculas> getAll();
	
	public List<Peliculas> getLastThree();
	
	public Peliculas getById(int id);
	
	public void add(Peliculas pelicula);
	
	public void update(Peliculas pelicula);
	
	public void delete(int id);
	
}
