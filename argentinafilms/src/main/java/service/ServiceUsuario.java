package service;

import java.util.List;

import model.Usuarios;

public interface ServiceUsuario {

	public List<Usuarios> getAll();
	
	public Usuarios getByUserName(String nombreUsuario);
	
	public void add(Usuarios usuario);
	
	public void update(Usuarios usuario);
	
	public void delete(String nombreUsuario);
	
}
