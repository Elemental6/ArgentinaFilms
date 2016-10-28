package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Directores {
	@Id
	@GeneratedValue
	private Integer id_director;

	private String nombre;
	private String apellido;
	private Integer edad;
	
	public Directores() {
		// TODO Auto-generated constructor stub
	}

	public Directores(String nombre, String apellido, Integer edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	public Integer getId_director() {
		return id_director;
	}

	public void setId_director(Integer id_director) {
		this.id_director = id_director;
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
