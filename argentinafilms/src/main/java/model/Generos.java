package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Generos {
	@Id
	@GeneratedValue
	private Integer genero_id;
	private String genero;
	
	public Generos() {
		// TODO Auto-generated constructor stub
	}

}
