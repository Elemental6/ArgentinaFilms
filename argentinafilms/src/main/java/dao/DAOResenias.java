package dao;

import java.util.List;

import model.*;

public interface DAOResenias {

	List<Resenias> getAll();	
	
	Resenias getById(Integer id_resenia);
	
	void update(Resenias resenia);
	
	void delete(Integer id_resenia);

	void save(Resenias resenia);
	
	List<Resenias> getByUsuario(String id);	

}
