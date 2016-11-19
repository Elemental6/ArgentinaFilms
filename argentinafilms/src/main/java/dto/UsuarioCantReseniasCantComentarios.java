package dto;

import model.Usuarios;

public class UsuarioCantReseniasCantComentarios implements Comparable<UsuarioCantReseniasCantComentarios>{

	private Usuarios usuario;
	private int cant_resenias;
	private int cant_comentarios;
	private int total_actividad;
	
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
	
	public int getTotal() {
		return total_actividad;
	}
	public void setTotal(int total_actividad) {
		this.total_actividad = total_actividad;
	}
	
	@Override
	public int compareTo(UsuarioCantReseniasCantComentarios o) {
		if (cant_resenias < o.cant_resenias) {
            return -1;
        }
        if (cant_resenias > o.cant_resenias) {
            return 1;
        }
        return 0;
	}

	
	
}
