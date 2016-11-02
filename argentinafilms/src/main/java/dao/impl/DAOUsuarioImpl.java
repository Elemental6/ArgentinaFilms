package dao.impl;

import java.util.List;

import model.Usuarios;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;

import dao.DAOUsuario;


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
	public void add(Usuarios usuario) {
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

	
	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory){
		this.hibernateTemplate = new HibernateTemplate(sessionFactory);
	}

}
