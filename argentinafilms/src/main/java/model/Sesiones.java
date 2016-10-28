package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Sesiones {
	@Id
	@GeneratedValue
	private Integer sesion_id;
	private java.sql.Timestamp fecha_inicio;
	private java.sql.Timestamp fecha_cierre;
	@ManyToOne
	private Usuarios usuario;
	
	public Sesiones() {
		// TODO Auto-generated constructor stub
	}

}
