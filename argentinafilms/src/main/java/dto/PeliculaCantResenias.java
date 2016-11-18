package dto;

import model.Peliculas;

public class PeliculaCantResenias implements Comparable<PeliculaCantResenias>{

	private Peliculas pelicula;
	private int cant_resenias;
	
	public PeliculaCantResenias(Peliculas pelicula, int cant_resenias){
		this.pelicula = pelicula;
		this.cant_resenias = cant_resenias;
	}
	
	public Peliculas getPelicula() {
		return this.pelicula;
	}
	public void setNombrePelicula(Peliculas pelicula) {
		this.pelicula = pelicula;
	}
	public int getCant_resenias() {
		return cant_resenias;
	}
	public void setCant_resenias(int cant_resenias) {
		this.cant_resenias = cant_resenias;
	}

	@Override
	public int compareTo(PeliculaCantResenias o) {
		   if (cant_resenias < o.cant_resenias) {
               return -1;
           }
           if (cant_resenias > o.cant_resenias) {
               return 1;
           }
           return 0;
	}
	
	
	
}
