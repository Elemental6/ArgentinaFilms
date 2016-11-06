package service.impl;

import java.util.List;

import model.Generos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import dao.DAOGeneros;
import service.ServiceGenero;


@Transactional
public class ServiceGeneroImpl implements ServiceGenero{

	@Autowired
	private DAOGeneros daoGenero = null;
	
	@Override
	public List<Generos> getAll() {
		return this.daoGenero.getAll();
	}

	@Override
	public Generos getById(Integer id) {
		return this.daoGenero.getById(id);
	}

	
	@Override
	public void add(Generos genero){
		this.daoGenero.save(genero);
	}
	
	@Override
	public void update(Generos genero) {
		this.daoGenero.update(genero);
	}

	@Override
	public void delete(Integer id) {
		this.daoGenero.delete(id);
	}

	public void setDaoUsuario(DAOGeneros daoGenero) {
		this.daoGenero = daoGenero;
	}

}