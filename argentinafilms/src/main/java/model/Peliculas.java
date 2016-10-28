package model;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Peliculas {
	@Id
	@GeneratedValue
	private Integer id_pelicula;

	private String nombre;
	private Date fecha;
	private String ubicacion;
	private Integer duracion;
	private String synopsis;
	
	private Integer puntuacion_total;
	
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "PeliculaXActores", joinColumns = @JoinColumn(name = "id_pelicula"), inverseJoinColumns = @JoinColumn(name = "id_actor"))
	private List<Actores> actores;	
	
	@ManyToOne
	private Directores director;	

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "ReseÃ±asXPelicula", joinColumns = @JoinColumn(name = "id_pelicula"), inverseJoinColumns = @JoinColumn(name = "id_reseÃ±a"))
	private List<Reseñas> reseñas;
	
	@ManyToOne
	private Usuarios usuario;
	
	@ManyToOne
	private Generos genero;
	
	public Peliculas() {
		// TODO Auto-generated constructor stub
	}

	public Integer getId_pelicula() {
		return id_pelicula;
	}

	public void setId_pelicula(Integer id_pelicula) {
		this.id_pelicula = id_pelicula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public Integer getDuracion() {
		return duracion;
	}

	public void setDuracion(Integer duracion) {
		this.duracion = duracion;
	}

	public String getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}

	public Integer getPuntuacion_total() {
		return puntuacion_total;
	}

	public void setPuntuacion_total(Integer puntuacion_total) {
		this.puntuacion_total = puntuacion_total;
	}

	public List<Actores> getActores() {
		return actores;
	}

	public void setActores(List<Actores> actores) {
		this.actores = actores;
	}

	public Directores getDirector() {
		return director;
	}

	public void setDirector(Directores director) {
		this.director = director;
	}

	public List<Reseñas> getReseñas() {
		return reseñas;
	}

	public void setReseñas(List<Reseñas> reseñas) {
		this.reseñas = reseñas;
	}

	public Usuarios getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuarios usuario) {
		this.usuario = usuario;
	}

	public Generos getGenero() {
		return genero;
	}

	public void setGenero(Generos genero) {
		this.genero = genero;
	}

}
