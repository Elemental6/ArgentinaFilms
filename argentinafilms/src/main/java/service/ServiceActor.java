package service;

import java.util.List;

import model.Actores;

public interface ServiceActor {

	public List<Actores> getAll();
	
	public Actores getById(int id);
	
	public void add(Actores actor);
	
	public void update(Actores actor);
	
	public void delete(Actores actor);

	List<Actores> getDiezMasVisitados();
	
}