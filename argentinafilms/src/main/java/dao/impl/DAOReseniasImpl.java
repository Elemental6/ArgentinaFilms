package dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;

import dao.DAOResenias;
import model.*;

public class DAOReseniasImpl implements DAOResenias {

	private HibernateTemplate hibernateTemplate = null;
	@Override
	public List<Resenias> getAll() {
		return this.hibernateTemplate.loadAll(Resenias.class);
	}

	@Override
	public Resenias getById(Integer id_resenia) {
		return this.hibernateTemplate.get(Resenias.class, id_resenia);
	}

	@Override
	public void update(Resenias resenia) {
		this.hibernateTemplate.update(resenia);
	}

	@Override
	public void delete(Integer id_resenia) {
		this.hibernateTemplate.delete(id_resenia);
	}

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory){
		this.hibernateTemplate = new HibernateTemplate(sessionFactory);
	}

	@Override
	public void save(Resenias resenia) {
		this.hibernateTemplate.save(resenia);
		
	}


}
