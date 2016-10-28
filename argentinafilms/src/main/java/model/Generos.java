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

	public Integer getGenero_id() {
		return genero_id;
	}

	public void setGenero_id(Integer genero_id) {
		this.genero_id = genero_id;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

}
