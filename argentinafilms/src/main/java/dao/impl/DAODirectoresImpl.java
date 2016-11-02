package dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;

import dao.DAODirectores;
import model.*;

public class DAODirectoresImpl implements DAODirectores {
	private HibernateTemplate hibernateTemplate = null;
	@Override
	public List<Directores> getAll() {
		return this.hibernateTemplate.loadAll(Directores.class);
	}

	@Override
	public Directores getById(Integer id_director) {
		return this.hibernateTemplate.get(Directores.class, id_director);
	}

	@Override
	public void update(Directores director) {
		this.hibernateTemplate.update(director);
	}

	@Override
	public void delete(Integer id_director) {
		this.hibernateTemplate.delete(id_director);
	}

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory){
		this.hibernateTemplate = new HibernateTemplate(sessionFactory);
	}

	@Override
	public void save(Directores director) {
		this.hibernateTemplate.save(director);
		
	}

}
