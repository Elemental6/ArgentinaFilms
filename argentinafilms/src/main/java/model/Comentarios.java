package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Comentarios {
	@Id
	@GeneratedValue
	private Integer comentario_id;
	private String comentario;
	private Integer puntaje;
	@ManyToOne
	private Usuarios usuario;
	
	public Comentarios() {
		// TODO Auto-generated constructor stub
	}

	public Integer getComentario_id() {
		return comentario_id;
	}

	public void setComentario_id(Integer comentario_id) {
		this.comentario_id = comentario_id;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public Integer getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(Integer puntaje) {
		this.puntaje = puntaje;
	}

	public Usuarios getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuarios usuario) {
		this.usuario = usuario;
	}

}
