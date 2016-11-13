package model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@SuppressWarnings("serial")
@Entity
public class Resenias implements Serializable{
	@Id
	@GeneratedValue
	private Integer id_resenia;
	@Column(length=812)
	private String resenia;
	private String aportadores;
	@ManyToOne
	private Usuarios usuario;
	
	@Transient
	Peliculas pelicula;
	
	@LazyCollection(LazyCollectionOption.FALSE)
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "ComentariosXResenia", joinColumns = @JoinColumn(name = "id_resenia"), inverseJoinColumns = @JoinColumn(name = "id_comentario"))
	private List<Comentarios> comentarios;
	
	public Resenias() {
		// TODO Auto-generated constructor stub
	}

	

	public Resenias(String resenia, String aportadores, Usuarios usuario,
			List<Comentarios> comentarios) {
		super();
		this.resenia = resenia;
		this.aportadores = aportadores;
		this.usuario = usuario;
		this.comentarios = comentarios;
	}



	public Resenias(Integer id_resenia, String resenia, String aportadores, Usuarios usuario,
			List<Comentarios> comentarios) {
		super();
		this.id_resenia = id_resenia;
		this.resenia = resenia;
		this.aportadores = aportadores;
		this.usuario = usuario;
		this.comentarios = comentarios;
	}

	@Transient
	public Peliculas getPelicula(){
		return pelicula;
	}
	@Transient
	public void setPelicula(Peliculas pelicula){
		this.pelicula = pelicula;
	}

	public Integer getId_resenia() {
		return id_resenia;
	}



	public void setId_resenia(Integer id_resenia) {
		this.id_resenia = id_resenia;
	}



	public String getResenia() {
		return resenia;
	}



	public void setResenia(String resenia) {
		this.resenia = resenia;
	}



	public String getAportadores() {
		return aportadores;
	}

	public void setAportadores(String aportadores) {
		this.aportadores = aportadores;
	}

	public Usuarios getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuarios usuario) {
		this.usuario = usuario;
	}

	public List<Comentarios> getComentarios() {
		return comentarios;
	}

	public void setComentarios(List<Comentarios> comentarios) {
		this.comentarios = comentarios;
	}

}
