package util;

import java.util.ArrayList;
import java.util.List;

import model.Peliculas;

final public class FiltrarListado {

	public FiltrarListado() {
		// TODO Auto-generated constructor stub
	}

	public static List<Peliculas> filtrarPeliculas(List<Peliculas> listado, String letra) {
		List<Peliculas> peliculas_filtradas = new ArrayList<Peliculas>();

		for (Peliculas pelicula : listado) {
			if (pelicula.getNombre().startsWith(letra)) {
				peliculas_filtradas.add(pelicula);
			}
		}
		return peliculas_filtradas;
	}

}
