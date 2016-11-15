package dao;

import java.util.List;

import model.Usuarios;

public interface DAOUsuario {

	List<Usuarios> getAll();
	
	Usuarios getByUserName(String nombreUsuario);
	
	void update(Usuarios usuario);
		
	void delete(String nombreUsuario);
	
	void save(Usuarios usuario);

	List<Usuarios> getActivos(int offset, int cantRegistros);

	int getCantActivos();

	List<Usuarios> getByNombre(String texto, int offset, int cantRegistros);

}
