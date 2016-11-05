package dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;

import dao.DAOPuntajes;
import model.*;

public class DAOPuntajesImpl implements DAOPuntajes {

	private HibernateTemplate hibernateTemplate = null;
	@Override
	public List<Puntajes> getAll() {
		return this.hibernateTemplate.loadAll(Puntajes.class);
	}

	@Override
	public Puntajes getById(Integer id_puntaje) {
		return this.hibernateTemplate.get(Puntajes.class, id_puntaje);
	}

	@Override
	public void update(Puntajes puntaje) {
		this.hibernateTemplate.update(puntaje);
	}

	@Override
	public void delete(Integer id_puntaje) {
		this.hibernateTemplate.delete(id_puntaje);
	}

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory){
		this.hibernateTemplate = new HibernateTemplate(sessionFactory);
	}

	@Override
	public void save(Puntajes puntaje) {
		this.hibernateTemplate.save(puntaje);
		
	}
}

