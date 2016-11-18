package dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;

import dao.DAOComentarios;
import model.*;

public class DAOComentariosImpl implements DAOComentarios {

	private HibernateTemplate hibernateTemplate = null;
	@Override
	public List<Comentarios> getAll() {
		return this.hibernateTemplate.loadAll(Comentarios.class);
	}

	@Override
	public Comentarios getById(Integer id_comentario) {
		return this.hibernateTemplate.get(Comentarios.class, id_comentario);
	}

	@Override
	public void update(Comentarios comentario) {
		this.hibernateTemplate.update(comentario);
	}

	@Override
	public void delete(Comentarios comentario) {
		this.hibernateTemplate.delete(comentario);
	}

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory){
		this.hibernateTemplate = new HibernateTemplate(sessionFactory);
	}

	@Override
	public void save(Comentarios comentario) {
		this.hibernateTemplate.save(comentario);
		
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Comentarios> getActivos(int offset, int cantRegistros) {
		DetachedCriteria crit = DetachedCriteria.forClass(Comentarios.class);

		crit.addOrder(Order.asc("comentario_id"));
		
		crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		return this.hibernateTemplate.findByCriteria(crit, offset, cantRegistros);
	}

	@Override
	public int getCantidad(){
		return this.hibernateTemplate.loadAll(Comentarios.class).size();
	}
}
