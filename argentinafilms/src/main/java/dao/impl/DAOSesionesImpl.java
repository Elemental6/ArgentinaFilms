package dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;

import dao.DAOSesiones;
import model.*;

public class DAOSesionesImpl implements DAOSesiones {

	private HibernateTemplate hibernateTemplate = null;
	@Override
	public List<Sesiones> getAll() {
		return this.hibernateTemplate.loadAll(Sesiones.class);
	}

	@Override
	public Sesiones getById(Integer id_sesion) {
		return this.hibernateTemplate.get(Sesiones.class, id_sesion);
	}

	@Override
	public void update(Sesiones sesion) {
		this.hibernateTemplate.update(sesion);
	}

	@Override
	public void delete(Integer id_sesion) {
		this.hibernateTemplate.delete(id_sesion);
	}

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory){
		this.hibernateTemplate = new HibernateTemplate(sessionFactory);
	}

	@Override
	public void save(Sesiones sesion) {
		this.hibernateTemplate.save(sesion);
		
	}

}
