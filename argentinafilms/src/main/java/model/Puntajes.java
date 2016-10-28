package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Puntajes {
	@Id
	@GeneratedValue
	private Integer puntaje_id;	
	private Integer puntuacion;
	@ManyToOne
	private Peliculas pelicula;
	@ManyToOne
	private Usuarios usuario;
	
	public Puntajes() {
		// TODO Auto-generated constructor stub
	}

}
