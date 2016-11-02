package dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
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
	public void delete(Integer id_comentario) {
		this.hibernateTemplate.delete(id_comentario);
	}

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory){
		this.hibernateTemplate = new HibernateTemplate(sessionFactory);
	}

	@Override
	public void save(Comentarios comentario) {
		this.hibernateTemplate.save(comentario);
		
	}

}
