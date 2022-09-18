package ar.com.codoacodo.herencia.clase6;

import ar.com.codoacodo.herencia.Articulo;
import ar.com.codoacodo.herencia.Buscador;

public class MainBuscador {

	public static void main(String[] args) {
		
	
		String claveDelUsuario = "harry potter";
		
		Buscador buscador = new Buscador(claveDelUsuario);
		
		buscador.buscar();
		Articulo[] resultados = buscador.getResultados();

		for(Articulo unResultado : resultados) {
			unResultado.getAutor();
			unResultado.getImg();
			unResultado.getPrecio();
		
			if(unResultado instanceof Libro) {
				Libro l = (Libro)unResultado;
				l.getIsbn();
				l.getNroPaginas();
			}
			if(unResultado instanceof Musica) {
				Musica m1 = (Musica)unResultado;
				m1.getSello();
			}
			if(unResultado instanceof Pelicula) {
				Pelicula p1 = (Pelicula)unResultado;
				p1.getProductora();
				p1.getFormato();
			}
		}
	
	}

}