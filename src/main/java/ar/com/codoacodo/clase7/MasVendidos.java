package ar.com.codoacodo.clase7;

import ar.com.codoacodo.herencia.Articulo;

public class MasVendidos extends Ordenador implements IFiltro {
	public MasVendidos (String nombre) {
		super(nombre);
	}
	
	public Articulo[] ordenar(Articulo[] lista) {
		System.out.println("ordenando por mas vendido");
		return lista;
	}
}