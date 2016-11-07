package dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;

import dao.DAOPeliculas;
import model.*;

public class DAOPeliculasImpl implements DAOPeliculas {

	private HibernateTemplate hibernateTemplate = null;
	@Override
	public List<Peliculas> getAll() {
		this.hibernateTemplate.setMaxResults(999);
		return this.hibernateTemplate.loadAll(Peliculas.class);
	}
	
	@Override
	public List<Peliculas> getLastThree(){
		this.hibernateTemplate.setMaxResults(3);
		return this.hibernateTemplate.loadAll(Peliculas.class);
	}

	@Override
	public Peliculas getById(Integer id_pelicula) {
		return this.hibernateTemplate.get(Peliculas.class, id_pelicula);
	}

	@Override
	public void update(Peliculas pelicula) {
		this.hibernateTemplate.update(pelicula);
	}

	@Override
	public void delete(Integer id_pelicula) {
		this.hibernateTemplate.delete(id_pelicula);
	}

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory){
		this.hibernateTemplate = new HibernateTemplate(sessionFactory);
	}

	@Override
	public void save(Peliculas pelicula) {
		this.hibernateTemplate.save(pelicula);
	}

}
