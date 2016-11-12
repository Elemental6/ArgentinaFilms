package service.impl;

import java.util.List;

import model.Usuarios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import dao.DAOUsuario;
import service.ServiceUsuario;


@Transactional
public class ServiceUsuarioImpl implements ServiceUsuario{

	@Autowired
	private DAOUsuario daoUsuario = null;
	
	@Override
	public List<Usuarios> getAll() {
		return this.daoUsuario.getAll();
	}

	@Override
	public Usuarios getByUserName(String nombreUsuario) {
		return this.daoUsuario.getByUserName(nombreUsuario);
	}

	
	@Override
	public void add(Usuarios usuario){
		this.daoUsuario.save(usuario);
	}
	
	@Override
	public void update(Usuarios usuario) {
		this.daoUsuario.update(usuario);
	}

	@Override
	public void delete(String nombreUsuario) {
		this.daoUsuario.delete(nombreUsuario);
	}

	
	@Override
	public List<Usuarios> getActivos(int offset, int cantRegistros) {
		return this.daoUsuario.getActivos(offset, cantRegistros);
	}
	
	@Override
	public int getCantActivos() {
		return this.daoUsuario.getCantActivos();
	}

	public void setDaoUsuario(DAOUsuario daoUsuario) {
		this.daoUsuario = daoUsuario;
	}

}
