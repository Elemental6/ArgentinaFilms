package model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Usuarios {
	@Id
	private String usuario;
	private String nombre;
	private String apellido;
	private String email;
	private String rango;
	private boolean estado;
	
	public Usuarios() {
		// TODO Auto-generated constructor stub
	}

}
