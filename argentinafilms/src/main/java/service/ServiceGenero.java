package service;

import java.util.List;

import model.Generos;

public interface ServiceGenero {

	public List<Generos> getAll();
	
	public Generos getById(Integer id);
	
	public void add(Generos genero);
	
	public void update(Generos genero);
	
	public void delete(Integer id);
	
}
