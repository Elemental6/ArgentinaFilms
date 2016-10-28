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

}
