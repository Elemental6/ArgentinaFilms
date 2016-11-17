package dao.impl;

import java.util.List;

import model.Secciones;
import dao.DAOSecciones;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;

public class DAOSeccionesImpl implements DAOSecciones{

	private HibernateTemplate hibernateTemplate = null;

	@Override
	public List<Secciones> getAll() {
		return this.hibernateTemplate.loadAll(Secciones.class);
	}
	
	@Override
	public Secciones getById(Integer id_seccion) {
		return this.hibernateTemplate.get(Secciones.class, id_seccion);
	}

	@Override
	public void update(Secciones seccion) {
		this.hibernateTemplate.update(seccion);
	}

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory){
		this.hibernateTemplate = new HibernateTemplate(sessionFactory);
	}

	@Override
	public void save(Secciones seccion) {
		this.hibernateTemplate.save(seccion);
	}


}
