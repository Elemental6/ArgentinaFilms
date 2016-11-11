package service.impl;

import java.util.List;

import model.Actores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import dao.DAOActores;
import service.ServiceActor;


@Transactional
public class ServiceActorImpl implements ServiceActor{

	@Autowired
	private DAOActores daoActor = null;
	
	@Override
	public List<Actores> getAll() {
		return this.daoActor.getAll();
	}

	@Override
	public Actores getById(int id) {
		return this.daoActor.getById(id);
	}

	
	@Override
	public void add(Actores actor){
		this.daoActor.save(actor);
	}
	
	@Override
	public void update(Actores actor) {
		this.daoActor.update(actor);
	}

	@Override
	public void delete(Actores actor) {
		this.daoActor.delete(actor);
	}

	

	public void setDaoUsuario(DAOActores daoActor) {
		this.daoActor = daoActor;
	}

}