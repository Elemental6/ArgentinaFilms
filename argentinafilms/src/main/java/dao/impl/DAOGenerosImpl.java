package dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;

import dao.DAOGeneros;
import model.*;

public class DAOGenerosImpl implements DAOGeneros {

	private HibernateTemplate hibernateTemplate = null;
	@Override
	public List<Generos> getAll() {
		return this.hibernateTemplate.loadAll(Generos.class);
	}

	@Override
	public Generos getById(Integer id_genero) {
		return this.hibernateTemplate.get(Generos.class, id_genero);
	}

	@Override
	public void update(Generos genero) {
		this.hibernateTemplate.update(genero);
	}

	@Override
	public void delete(Integer id_genero) {
		this.hibernateTemplate.delete(id_genero);
	}

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory){
		this.hibernateTemplate = new HibernateTemplate(sessionFactory);
	}

	@Override
	public void save(Generos genero) {
		this.hibernateTemplate.save(genero);
		
	}
}
