package model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@SuppressWarnings("serial")
@Entity
public class Sesiones implements Serializable{
	@Id
	@GeneratedValue
	private Integer sesion_id;
	private java.sql.Timestamp fecha_inicio;
	private java.sql.Timestamp fecha_cierre;
	
	@ManyToOne
	private Usuarios usuario;
	
	public Sesiones() {
		// TODO Auto-generated constructor stub
	}

	public Sesiones(Timestamp fecha_inicio, Timestamp fecha_cierre, Usuarios usuario) {
		this.fecha_inicio = fecha_inicio;
		this.fecha_cierre = fecha_cierre;
		this.usuario = usuario;
	}

	public Integer getSesion_id() {
		return sesion_id;
	}

	public void setSesion_id(Integer sesion_id) {
		this.sesion_id = sesion_id;
	}

	public java.sql.Timestamp getFecha_inicio() {
		return fecha_inicio;
	}

	public void setFecha_inicio(java.sql.Timestamp fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}

	public java.sql.Timestamp getFecha_cierre() {
		return fecha_cierre;
	}

	public void setFecha_cierre(java.sql.Timestamp fecha_cierre) {
		this.fecha_cierre = fecha_cierre;
	}

	public Usuarios getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuarios usuario) {
		this.usuario = usuario;
	}

}
