package dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;

import dao.DAOActores;
import model.*;
@SuppressWarnings("unchecked")


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
	public void delete(Actores actor) {
		this.hibernateTemplate.delete(actor);
	}

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory){
		this.hibernateTemplate = new HibernateTemplate(sessionFactory);
	}

	@Override
	public void save(Actores actor) {
		this.hibernateTemplate.save(actor);
		
	}

	@Override
	public List<Actores> getActivas() {
		DetachedCriteria crit = DetachedCriteria.forClass(Actores.class);
		crit.add(Restrictions.eq("estado", true));
		crit.addOrder(Order.asc("nombre"));
		crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		return this.hibernateTemplate.findByCriteria(crit);
	}
	
	@Override
	public List<Actores> getInactivas(int offset, int cantRegistros) {
		DetachedCriteria crit = DetachedCriteria.forClass(Actores.class);
		crit.add(Restrictions.eq("estado", false));
		crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		return this.hibernateTemplate.findByCriteria(crit, offset, cantRegistros);
	}
	
	@Override
	public int getCantInactivas(){
		DetachedCriteria crit = DetachedCriteria.forClass(Actores.class);
		crit.add(Restrictions.eq("estado", false));
		crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		return this.hibernateTemplate.findByCriteria(crit).size();
	}

	@Override
	public List<Actores> getUltimasActivas(){
		DetachedCriteria crit = DetachedCriteria.forClass(Actores.class);
		crit.add(Restrictions.eq("estado", true));
		crit.addOrder(Order.desc("id_actor"));
		crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		return this.hibernateTemplate.findByCriteria(crit, 0, 9);
	}
	
}
