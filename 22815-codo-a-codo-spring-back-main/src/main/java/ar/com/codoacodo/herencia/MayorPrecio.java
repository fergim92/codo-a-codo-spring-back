package ar.com.codoacodo.herencia;

import java.util.Arrays;

public class MayorPrecio extends FiltroBase implements IFiltro {

	public MayorPrecio() {
		super("Mayor Precio");
	}
	
	public MayorPrecio(Articulo[] lista) {
		super("Mayor Precio",lista);
	};
	
	public void ordenar() {
		
		System.out.println("Ordenando por " + getNombre());
		//_3_|__5__|__4__|__2__|_9___|
		
		//_9_|__5__|__4__|__3__|_2___|
		
		//algoritmos de ordenamiento
		
		//bubuja/secuncial/(binaria?)/mergesort/heapsort/quicksort
		
		// a - b = 0 => iguales
		// a - b > 0 => a es mayor que b
		// a - b < 0 => b es mayor que a
		
		Arrays.sort(lista, (a, b) -> Float.compare(b.getPrecio(), a.getPrecio()));
	}
}
