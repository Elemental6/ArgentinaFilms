package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import dao.DAOSecciones;
import model.Secciones;
import service.ServiceSecciones;

@Transactional
public class ServiceSeccionesImpl implements ServiceSecciones{

	@Autowired
	private DAOSecciones daoSecciones = null;
	
	@Override
	public List<Secciones> getAll() {
		return this.daoSecciones.getAll();
	}
	
	@Override
	public void save(Secciones seccion) {
		this.daoSecciones.save(seccion);
	}

	@Override
	public Secciones getById(Integer id_seccion) {
		return this.daoSecciones.getById(id_seccion);
	}

	@Override
	public void update(Secciones seccion) {
		this.daoSecciones.update(seccion);
	}

}
