package model;

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
	private int anio;
	private String ubicacion;
	private Integer duracion;
	private String synopsis;
	private Integer puntuacion_total;
	private String poster;
	private String trailer;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "PeliculaXActores", joinColumns = @JoinColumn(name = "id_pelicula"), inverseJoinColumns = @JoinColumn(name = "id_actor"))
	private List<Actores> actores;	
	
	@ManyToOne
	private Directores director;	

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "ReseniasXPelicula", joinColumns = @JoinColumn(name = "id_pelicula"), inverseJoinColumns = @JoinColumn(name = "id_resenia"))
	private List<Resenias> resenias;
	
	@ManyToOne
	private Usuarios usuario;
	
	@ManyToOne
	private Generos genero;
	
	public Peliculas() {
		// TODO Auto-generated constructor stub
	}

	public Peliculas(String nombre, int anio, String ubicacion, Integer duracion, String synopsis, Integer puntuacion_total, List<Actores> actores, Directores director, List<Resenias> resenias, Usuarios usuario, Generos genero) {
		this.nombre = nombre;
		this.setAnio(anio);
		this.ubicacion = ubicacion;
		this.duracion = duracion;
		this.synopsis = synopsis;
		this.puntuacion_total = puntuacion_total;
		this.actores = actores;
		this.director = director;
		this.resenias = resenias;
		this.usuario = usuario;
		this.genero = genero;
	}

	

	public String getPoster() {
		return poster;
	}

	public void setPoster(String poster) {
		this.poster = poster;
	}

	public String getTrailer() {
		return trailer;
	}

	public void setTrailer(String trailer) {
		this.trailer = trailer;
	}

	public Peliculas(String nombre, int anio, String ubicacion, Integer duracion, String synopsis,
			Integer puntuacion_total, String poster, String trailer, Usuarios usuario,
			Generos genero) {
		super();
		this.nombre = nombre;
		this.anio = anio;
		this.ubicacion = ubicacion;
		this.duracion = duracion;
		this.synopsis = synopsis;
		this.puntuacion_total = puntuacion_total;
		this.poster = poster;
		this.trailer = trailer;
		this.usuario = usuario;
		this.genero = genero;
	}

	public Peliculas(String nombre, int anio, String ubicacion, Integer duracion, String synopsis,
			Integer puntuacion_total, Usuarios usuario, Generos genero) {
		super();
		this.nombre = nombre;
		this.anio = anio;
		this.ubicacion = ubicacion;
		this.duracion = duracion;
		this.synopsis = synopsis;
		this.puntuacion_total = puntuacion_total;
		this.usuario = usuario;
		this.genero = genero;
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

	public List<Resenias> getResenias() {
		return resenias;
	}

	public void setResenias(List<Resenias> resenias) {
		this.resenias = resenias;
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

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

}
