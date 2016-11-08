package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import dao.DAOResenias;
import model.Resenias;
import service.ServiceResenia;

public class ServiceReseniaImpl implements ServiceResenia{
	
	@Autowired
	private DAOResenias daoResenia = null;

	@Override
	public List<Resenias> getAll() {
		return this.daoResenia.getAll();
	}

	@Override
	public Resenias getById(int id) {
		return this.daoResenia.getById(id);
	}

	@Override
	public void add(Resenias resenia) {
		this.daoResenia.save(resenia);
	}

	@Override
	public void update(Resenias resenia) {
		this.daoResenia.update(resenia);
	}

	@Override
	public void delete(int id) {
		this.daoResenia.delete(id);
	}
	
}
