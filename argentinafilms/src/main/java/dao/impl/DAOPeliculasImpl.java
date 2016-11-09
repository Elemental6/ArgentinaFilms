package dao.impl;

import java.util.List;



import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;

import dao.DAOPeliculas;
import model.*;
@SuppressWarnings("unchecked")

public class DAOPeliculasImpl implements DAOPeliculas {

	private HibernateTemplate hibernateTemplate = null;
	@Override
	public List<Peliculas> getAll() {
		return this.hibernateTemplate.loadAll(Peliculas.class);
	}
	
	
	@Override
	public List<Peliculas> getActivas() {
		DetachedCriteria crit = DetachedCriteria.forClass(Peliculas.class);
		crit.add(Restrictions.eq("estado", true));
		crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		return this.hibernateTemplate.findByCriteria(crit);
	}
	
	@Override
	public List<Peliculas> getInactivas() {
		DetachedCriteria crit = DetachedCriteria.forClass(Peliculas.class);
		crit.add(Restrictions.eq("estado", false));
		crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		return this.hibernateTemplate.findByCriteria(crit);
	}
	
	@Override
	public List<Peliculas> getByTextoEnNombre(String texto) {
		DetachedCriteria crit = DetachedCriteria.forClass(Peliculas.class);
		crit.add(Restrictions.like("nombre", "%" + texto + "%"));
		crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		return this.hibernateTemplate.findByCriteria(crit);
	}
	
	@Override
	public List<Peliculas> getUltimasCuatroActivas(){
		DetachedCriteria crit = DetachedCriteria.forClass(Peliculas.class);
		crit.add(Restrictions.eq("estado", true)).add(Restrictions.sqlRestriction("50=50 LIMIT 50"));
		crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		return this.hibernateTemplate.findByCriteria(crit);
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
	public void delete(Peliculas pelicula) {
		this.hibernateTemplate.delete(pelicula);
	}

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory){
		this.hibernateTemplate = new HibernateTemplate(sessionFactory);
	}

	@Override
	public void save(Peliculas pelicula) {
		this.hibernateTemplate.save(pelicula);
	}

	public List<Peliculas> getByActor(int id_actor) {
		return this.hibernateTemplate.find("select p from Peliculas as p join p.actores as a where a.id_actor = " + id_actor);
	}
}
