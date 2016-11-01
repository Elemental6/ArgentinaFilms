package dao;

import java.util.List;

import model.Usuarios;

public interface DAOUsuario {

	List<Usuarios> getAll();
	
	Usuarios getByUserName(String nombreUsuario);
	
	void add(Usuarios usuario);
	
	void update(Usuarios usuario);
	
	void delete(String nombreUsuario);
	
}
