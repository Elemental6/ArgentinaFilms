package service.impl;

import java.util.List;

import model.Directores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import dao.DAODirectores;
import service.ServiceDirector;


@Transactional
public class ServiceDirectorImpl implements ServiceDirector{

	@Autowired
	private DAODirectores daoDirector = null;
	
	@Override
	public List<Directores> getAll() {
		return this.daoDirector.getAll();
	}

	@Override
	public Directores getById(Integer id) {
		return this.daoDirector.getById(id);
	}

	
	@Override
	public void add(Directores director){
		this.daoDirector.save(director);
	}
	
	@Override
	public void update(Directores director) {
		this.daoDirector.update(director);
	}

	@Override
	public void delete(Integer id) {
		this.daoDirector.delete(id);
	}

	

	public void setDaoUsuario(DAODirectores daoDirector) {
		this.daoDirector = daoDirector;
	}

}