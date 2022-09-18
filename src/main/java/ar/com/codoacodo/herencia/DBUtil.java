package ar.com.codoacodo.herencia;

import ar.com.codoacodo.herencia.clase6.Libro;
import ar.com.codoacodo.herencia.clase6.Musica;
import ar.com.codoacodo.herencia.clase6.Pelicula;

public class DBUtil {

	public Articulo[] obtenerResultado(String claveBusqueda) {
		
		Libro l1 = new Libro("http://sitio.com.ar/img/img1.jpg","tiulo" + claveBusqueda,"AUTOR1",4390);
		l1.setIsbn("9789876378253");
		l1.setNroPaginas(72);
		//Tambien podriamos pasado estos datos por parametro al constructor enves de usar el setter
		
		
		Musica m1 = new Musica("http://sitio.com.ar/img/img2.jpg","tiulo" + claveBusqueda,"AUTOR m1",40500);
		m1.setSello("SONY MUSIC");
		// m1.setListaDeTemas no se lo pasamos asi que queda vacio "null"
		
		Pelicula p1= new Pelicula("http://sitio.com.ar/img/img3.jpg","tiulo" + claveBusqueda,"AUTOR p1",2040);
		p1.setFormato("BLUE RAY");
		p1.setProductora("FOX");
		
		//crear un vector/array/arreglo!
		//inician en la posicion 0
		/*Articulo[] resultados = new Articulo[3];//vector vacio
		resultados[0] = primero;
		resultados[1] = segundo;
		resultados[2] = tercero;*/
		
		//Articulo[] res = new Articulo[] {primero,segundo,tercero};//vector los tres datos cargados
		
		//return primero;
		
		return new Articulo[] {l1,m1, p1};
	}
}