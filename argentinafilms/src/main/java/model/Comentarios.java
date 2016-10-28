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

}
