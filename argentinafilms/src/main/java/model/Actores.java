package model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@SuppressWarnings("serial")
@Entity
public class Actores implements Serializable{
	@Id
	@GeneratedValue
	private Integer id_actor;

	private String nombre;
	private String apellido;
	private Integer edad;
	private boolean estado;
	int cant_visitas;
	
	public Actores() {
		// TODO Auto-generated constructor stub
	}
	
	public Actores(String nombre, String apellido, Integer edad, boolean estado) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.estado = estado;
	}

	public Actores(Integer id_actor, String nombre, String apellido, Integer edad, boolean estado) {
		super();
		this.id_actor = id_actor;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.estado = estado;
	}

	public Integer getId_actor() {
		return id_actor;
	}

	public void setId_actor(Integer id_actor) {
		this.id_actor = id_actor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public int getCant_visitas() {
		return cant_visitas;
	}

	public void setCant_visitas(int cant_visitas) {
		this.cant_visitas = cant_visitas;
	}
	
	
	
}
