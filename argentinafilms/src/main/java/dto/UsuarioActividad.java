package dto;

import model.Usuarios;

public class UsuarioActividad implements Comparable<UsuarioActividad>{

	private Usuarios usuario;
	private int cant_resenias;
	private int cant_comentarios;
	private int cant_puntuadas;
	private int total_actividad;
	
	
	public UsuarioActividad(Usuarios usuario,
			int cant_resenias, int cant_comentarios, int cant_puntuadas,
			int total_actividad) {
		super();
		this.usuario = usuario;
		this.cant_resenias = cant_resenias;
		this.cant_comentarios = cant_comentarios;
		this.cant_puntuadas = cant_puntuadas;
		this.total_actividad = total_actividad;
	}

	public Usuarios getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuarios usuario) {
		this.usuario = usuario;
	}


	public int getCant_resenias() {
		return cant_resenias;
	}

	public void setCant_resenias(int cant_resenias) {
		this.cant_resenias = cant_resenias;
	}


	public int getCant_comentarios() {
		return cant_comentarios;
	}


	public void setCant_comentarios(int cant_comentarios) {
		this.cant_comentarios = cant_comentarios;
	}


	public int getCant_puntuadas() {
		return cant_puntuadas;
	}

	public void setCant_puntuadas(int cant_puntuadas) {
		this.cant_puntuadas = cant_puntuadas;
	}


	public int getTotal_actividad() {
		return total_actividad;
	}

	public void setTotal_actividad(int total_actividad) {
		this.total_actividad = total_actividad;
	}


	@Override
	public int compareTo(UsuarioActividad o) {
		if (total_actividad < o.total_actividad) {
            return -1;
        }
        if (total_actividad > o.total_actividad) {
            return 1;
        }
        return 0;
	}

	
	
}
