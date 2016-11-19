package dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
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
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Directores> getInactivas(int offset, int cantRegistros) {
		DetachedCriteria crit = DetachedCriteria.forClass(Directores.class);
		crit.add(Restrictions.eq("estado", false));
		crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		return this.hibernateTemplate.findByCriteria(crit, offset, cantRegistros);
	}
	
	@Override
	public int getCantInactivas(){
		DetachedCriteria crit = DetachedCriteria.forClass(Directores.class);
		crit.add(Restrictions.eq("estado", false));
		crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		return this.hibernateTemplate.findByCriteria(crit).size();
	}

	@Override
	public void update(Directores director) {
		this.hibernateTemplate.update(director);
	}

	@Override
	public void delete(Directores director) {
		this.hibernateTemplate.delete(director);
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
