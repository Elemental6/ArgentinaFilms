package model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Usuarios {
	@Id
	private String usuario;
	private String pass;
	private String nombre;
	private String apellido;
	private String email;
	private String rango;
	private String codActivacion;
	private boolean estado;
	private String avatar = null;
	public Usuarios() {
		// TODO Auto-generated constructor stub
	}
	
	public Usuarios(String usuario, String pass, String nombre, String apellido, String email, String rango, boolean estado) {
		this.usuario = usuario;
		this.pass = pass;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.rango = rango;
		this.estado = estado;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRango() {
		return rango;
	}

	public void setRango(String rango) {
		this.rango = rango;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getCodActivacion() {
		return codActivacion;
	}

	public void setCodActivacion(String codActivacion) {
		this.codActivacion = codActivacion;
	}

	
}
