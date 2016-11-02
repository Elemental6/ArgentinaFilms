package dao;

import java.util.List;

import model.*;

public interface DAOComentarios {

	List<Comentarios> getAll();	
	
	Comentarios getById(Integer id_comentario);
	
	void update(Comentarios comentario);
	
	void delete(Integer id_comentario);

	void save(Comentarios comentario);

}
