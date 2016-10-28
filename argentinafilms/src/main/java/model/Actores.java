package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Actores {
	@Id
	@GeneratedValue
	private Integer id_actor;

	private String nombre;
	private String apellido;
	private Integer edad;
	
	public Actores() {
		// TODO Auto-generated constructor stub
	}
	
	public Actores(String nombre, String apellido, Integer edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
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
	
}
