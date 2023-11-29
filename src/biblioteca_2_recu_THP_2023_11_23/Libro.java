package biblioteca_2_recu_THP_2023_11_23;

import java.util.ArrayList;

public class Libro {
	private String isbn;
	private String titulo;
	private String autor;
	private Genero genero;
	private ArrayList<Ejemplar> ejemplares;
	
	public Libro(String isbn, String titulo, String autor, Genero genero) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.genero = genero;
		this.ejemplares = new ArrayList<Ejemplar>();
	}
	
	public String getIsbn() {
		return isbn;
	}

	public String getTitulo() {
		return this.titulo;
	}

	public int getCantEjemplaresDisponibles() {
		int cantidadDisponible = 0;
		
		for (Ejemplar ejemplar: this.ejemplares) {
			if (ejemplar.estaDisponible()) {
				cantidadDisponible++;
			}
		}

		return cantidadDisponible;
	}

	public boolean mismoGenero(Genero genero) {
		return this.genero == genero;
	}

	public boolean mismoIsbn(String isbn) {
		return this.isbn.equals(isbn);
	}

	public Ejemplar buscarEjemplarAPrestar() {
		int i = 0;
		Ejemplar ejemplar;
		Ejemplar ejemplarAPrestar = null;

		while (i < this.ejemplares.size() && ejemplarAPrestar == null) {
			ejemplar = this.ejemplares.get(i);
			if (ejemplar.estaDisponible()) {
				ejemplarAPrestar = ejemplar;
			} else {
				i++;
			}
		}
		
		return ejemplarAPrestar;
	}
	
	public void agregarEjemplares(int cantidadEjemplares) {
		int numeroEjemplar = this.obtenerMayorNumeroEjemplar();
		for (int i = 1; i <= cantidadEjemplares; i++) {
			this.ejemplares.add(new Ejemplar(++numeroEjemplar));
		}
	}

	private int obtenerMayorNumeroEjemplar() {
		int numMax = 0;
		
		for (Ejemplar ejemplar: this.ejemplares) {
			if (ejemplar.getNumero() > numMax) {
				numMax = ejemplar.getNumero();
			}
		}
		return numMax;
	}

	//TODO: completar este metodo y usarlo donde considere necesario
	public Ejemplar buscarEjemplar(int numeroEjemplar) {
		
		
		
		//El return null esta puesto solamente para que compile
		return null;
	}

	public int getCantEjemplaresEnPrestamo() {
		//TODO: debe devolver la cantidad de ejemplares que estan actualmente prestados de este libro
		//El return 0 esta puesto solamente para que compile
		return 0;
	}


	
}
