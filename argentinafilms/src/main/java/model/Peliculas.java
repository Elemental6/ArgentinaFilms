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
	@JoinTable(name = "Rese√±asXPelicula", joinColumns = @JoinColumn(name = "id_pelicula"), inverseJoinColumns = @JoinColumn(name = "id_rese√±a"))
	private List<ReseÒas> reseÒas;
	
	@ManyToOne
	private Usuarios usuario;
	
	@ManyToOne
	private Generos genero;
	
	public Peliculas() {
		// TODO Auto-generated constructor stub
	}

}
