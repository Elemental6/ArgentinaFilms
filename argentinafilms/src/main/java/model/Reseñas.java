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

}
