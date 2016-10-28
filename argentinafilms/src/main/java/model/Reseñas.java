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
public class Reseñas {
	@Id
	@GeneratedValue
	private Integer id_reseña;
	private String reseña;
	private String aportadores;
	@ManyToOne
	private Usuarios usuario;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "ComentariosXReseÃ±a", joinColumns = @JoinColumn(name = "id_reseÃ±a"), inverseJoinColumns = @JoinColumn(name = "id_comentario"))
	private List<Comentarios> comentarios;
	
	public Reseñas() {
		// TODO Auto-generated constructor stub
	}

	public Integer getId_reseña() {
		return id_reseña;
	}

	public void setId_reseña(Integer id_reseña) {
		this.id_reseña = id_reseña;
	}

	public String getReseña() {
		return reseña;
	}

	public void setReseña(String reseña) {
		this.reseña = reseña;
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
