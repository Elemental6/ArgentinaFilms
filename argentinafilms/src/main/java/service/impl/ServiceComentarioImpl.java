package service.impl;

import java.util.List;

import model.Comentarios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import dao.DAOComentarios;
import service.ServiceComentario;


@Transactional
public class ServiceComentarioImpl implements ServiceComentario{

	@Autowired
	private DAOComentarios daoComentario = null;
	
	@Override
	public List<Comentarios> getAll() {
		return this.daoComentario.getAll();
	}

	@Override
	public Comentarios getById(int id) {
		return this.daoComentario.getById(id);
	}

	
	@Override
	public void add(Comentarios comentario){
		this.daoComentario.save(comentario);
	}
	
	@Override
	public void update(Comentarios comentario) {
		this.daoComentario.update(comentario);
	}

	@Override
	public void delete(Comentarios comentario) {
		this.daoComentario.delete(comentario);
	}

	public void setDaoUsuario(DAOComentarios daoComentario) {
		this.daoComentario = daoComentario;
	}

}