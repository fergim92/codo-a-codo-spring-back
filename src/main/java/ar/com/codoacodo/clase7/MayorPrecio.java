package ar.com.codoacodo.clase7;

import ar.com.codoacodo.herencia.Articulo;

public class MayorPrecio implements IFiltro {
	
	public Articulo[] ordenar(Articulo[] lista) {
		System.out.println("ordenando por mayor precio");
		return lista;
	}
}