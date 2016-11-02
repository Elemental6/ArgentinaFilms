package dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;

import dao.DAOActores;
import model.*;

public class DAOActoresImpl implements DAOActores {

	private HibernateTemplate hibernateTemplate = null;
	@Override
	public List<Actores> getAll() {
		return this.hibernateTemplate.loadAll(Actores.class);
	}

	@Override
	public Actores getById(Integer id_actor) {
		return this.hibernateTemplate.get(Actores.class, id_actor);
	}

	@Override
	public void update(Actores actor) {
		this.hibernateTemplate.update(actor);
	}

	@Override
	public void delete(Integer id_actor) {
		this.hibernateTemplate.delete(id_actor);
	}

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory){
		this.hibernateTemplate = new HibernateTemplate(sessionFactory);
	}

	@Override
	public void save(Actores actor) {
		this.hibernateTemplate.save(actor);
		
	}

}
