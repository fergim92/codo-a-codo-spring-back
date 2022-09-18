package ar.com.codoacodo.herencia.clase6;

import ar.com.codoacodo.herencia.Articulo;

public class Libro extends Articulo{
	//atributos propios del libro
	private int nroPaginas;
	private String isbn;
	
	public Libro(String img, String titulo, String autor, float precio) {
	// la primer linea de codigo del constructor debe ser "invocar al padre"
		super(img,titulo,autor, precio);
	}
	
	public Libro(String img, String titulo, String autor, float precio, int nroPaginas, String isbn) {
		super(img, titulo, autor,precio);
		this.setNroPaginas(nroPaginas);
		this.setIsbn(isbn);
	}

	public int getNroPaginas() {
		return nroPaginas;
	}

	public void setNroPaginas(int nroPaginas) {
		this.nroPaginas = nroPaginas;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	@Override
	public String toString() {
		return super.toString() + ", Libro [nroPaginas=" + nroPaginas + ", isbn=" + isbn + "]";
		
	}

	
}