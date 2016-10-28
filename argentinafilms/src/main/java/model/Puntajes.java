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

	public Puntajes(Integer puntuacion, Peliculas pelicula, Usuarios usuario) {
		this.puntuacion = puntuacion;
		this.pelicula = pelicula;
		this.usuario = usuario;
	}

	public Integer getPuntaje_id() {
		return puntaje_id;
	}

	public void setPuntaje_id(Integer puntaje_id) {
		this.puntaje_id = puntaje_id;
	}

	public Integer getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(Integer puntuacion) {
		this.puntuacion = puntuacion;
	}

	public Peliculas getPelicula() {
		return pelicula;
	}

	public void setPelicula(Peliculas pelicula) {
		this.pelicula = pelicula;
	}

	public Usuarios getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuarios usuario) {
		this.usuario = usuario;
	}

}
