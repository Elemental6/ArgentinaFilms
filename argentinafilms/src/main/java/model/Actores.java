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

}
