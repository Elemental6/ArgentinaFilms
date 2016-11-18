package service;

import java.util.List;
import model.Comentarios;

public interface ServiceComentario {
	
	public List<Comentarios> getAll();

	public Comentarios getById(int id);
	
	public void add(Comentarios comentario);
	
	public void update(Comentarios comentario);
	
	public void delete(Comentarios comentario);


}
