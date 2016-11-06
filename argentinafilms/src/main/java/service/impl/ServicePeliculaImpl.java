package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import dao.DAOPeliculas;
import model.Peliculas;
import service.ServicePelicula;

@Transactional
public class ServicePeliculaImpl implements ServicePelicula{

	@Autowired
	private DAOPeliculas daoPelicula = null;
	
	@Override
	public List<Peliculas> getAll() {
		return this.daoPelicula.getAll();
	}

	@Override
	public Peliculas getById(int id) {
		return this.daoPelicula.getById(id);
	}

	@Override
	public void add(Peliculas pelicula) {
		this.daoPelicula.save(pelicula);
	}

	@Override
	public void update(Peliculas pelicula) {
		this.daoPelicula.update(pelicula);
	}

	@Override
	public void delete(int id) {
		this.daoPelicula.delete(id);
	}

	public void setDaoPelicula(DAOPeliculas daoPelicula) {
		this.daoPelicula = daoPelicula;
	}
}
