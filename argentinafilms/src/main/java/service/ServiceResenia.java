package service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import model.Resenias;

@Transactional
public interface ServiceResenia {
	
	public List<Resenias> getAll();
	
	public Resenias getById(int id);
	
	public void add(Resenias resenia);
	
	public void update(Resenias resenia);
	
	public void delete(int id);
}
