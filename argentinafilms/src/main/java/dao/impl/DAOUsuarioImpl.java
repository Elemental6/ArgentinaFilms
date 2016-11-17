package dao.impl;

import java.util.List;

import model.Usuarios;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;

import dao.DAOUsuario;
@SuppressWarnings("unchecked")

public class DAOUsuarioImpl implements DAOUsuario{

	private HibernateTemplate hibernateTemplate = null;
	
	
	@Override
	public List<Usuarios> getAll() {
		return this.hibernateTemplate.loadAll(Usuarios.class);
	}

	@Override
	public Usuarios getByUserName(String nombreUsuario) {
		return this.hibernateTemplate.get(Usuarios.class, nombreUsuario);
	}

	@Override
	public void save(Usuarios usuario) {
		this.hibernateTemplate.save(usuario);
	}

	@Override
	public void update(Usuarios usuario) {
		this.hibernateTemplate.update(usuario);
	}

	@Override
	public void delete(String nombreUsuario) {
		this.hibernateTemplate.delete(nombreUsuario);
	}

	@Override
	public List<Usuarios> getActivos(int offset, int cantRegistros) {
		DetachedCriteria crit = DetachedCriteria.forClass(Usuarios.class);
		crit.add(Restrictions.eq("estado", true));
		crit.addOrder(Order.asc("nombre"));
		crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		return this.hibernateTemplate.findByCriteria(crit, offset, cantRegistros);
	}
	
	@Override
	public int getCantActivos(){
		DetachedCriteria crit = DetachedCriteria.forClass(Usuarios.class);
		crit.add(Restrictions.eq("estado", true));
		crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		return this.hibernateTemplate.findByCriteria(crit).size();
	}
	
	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory){
		this.hibernateTemplate = new HibernateTemplate(sessionFactory);
	}

	
	@Override
	public List<Usuarios> getByNombre(String texto, int offset, int cantRegistros) {
		DetachedCriteria crit = DetachedCriteria.forClass(Usuarios.class);
		crit.add(Restrictions.like("usuario", "%" + texto + "%"));
		crit.add(Restrictions.eq("estado", true));
		crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		return this.hibernateTemplate.findByCriteria(crit, offset, cantRegistros);
	}
}
