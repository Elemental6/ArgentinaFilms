package model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@SuppressWarnings("serial")
@Entity
public class Generos implements Serializable{
	@Id
	@GeneratedValue
	private Integer genero_id;
	private String genero;
	
	public Generos() {
		// TODO Auto-generated constructor stub
	}

	public Generos(String genero) {
		this.genero = genero;
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
