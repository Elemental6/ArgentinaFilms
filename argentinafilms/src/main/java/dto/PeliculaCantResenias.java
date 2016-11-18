package dto;

public class PeliculaCantResenias {

	private String nombrePelicula;
	private int cant_resenias;
	
	public PeliculaCantResenias(String nombrePelicula, int cant_resenias){
		this.nombrePelicula = nombrePelicula;
		this.cant_resenias = cant_resenias;
	}
	
	public String getNombrePelicula() {
		return nombrePelicula;
	}
	public void setNombrePelicula(String nombrePelicula) {
		this.nombrePelicula = nombrePelicula;
	}
	public int getCant_resenias() {
		return cant_resenias;
	}
	public void setCant_resenias(int cant_resenias) {
		this.cant_resenias = cant_resenias;
	}
	
	
	
}
