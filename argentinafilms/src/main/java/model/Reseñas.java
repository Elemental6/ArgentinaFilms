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
public class Rese�as {
	@Id
	@GeneratedValue
	private Integer id_rese�a;
	private String rese�a;
	private String aportadores;
	@ManyToOne
	private Usuarios usuario;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "ComentariosXReseña", joinColumns = @JoinColumn(name = "id_reseña"), inverseJoinColumns = @JoinColumn(name = "id_comentario"))
	private List<Comentarios> comentarios;
	
	public Rese�as() {
		// TODO Auto-generated constructor stub
	}

}
