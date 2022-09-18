package ar.com.codoacodo.herencia.clase6;

import ar.com.codoacodo.herencia.Articulo;

public class MainClase6 {

	public static void main(String[] args) {
		Libro libro1 = new Libro("/libro.jpg", "Iron Man", "Alguien", 3500);
		
		Articulo articulo = new Articulo("/libro.jpg", "Iron Man", "Alguien", 3500);
		
		Articulo a = new Libro("/libro.jpg", "Iron Man 2", "Alguien2", 4500);
		// Formas de usar el DownCasting
		// Libro libroDentroDeA = (Libro)a;
		// ((Libro)a).getAutor();
		// String auto = ((Libro)a).getAutor();
		
		Articulo[] resultados = new Articulo[2];
		resultados[0] = libro1;
		resultados[1] = articulo;
		
	}

}
