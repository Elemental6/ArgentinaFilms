package model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@SuppressWarnings("serial")
@Entity
public class Secciones implements Serializable{

	@Id
	@GeneratedValue
	private int id_seccion;
	private String descripcion;
	private int cant_visitas;
	
	public Secciones(){
		
	}

	public int getId_seccion() {
		return id_seccion;
	}

	public void setId_seccion(int id_seccion) {
		this.id_seccion = id_seccion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getCant_visitas() {
		return cant_visitas;
	}

	public void setCant_visitas(int cant_visitas) {
		this.cant_visitas = cant_visitas;
	}
	
	
}
