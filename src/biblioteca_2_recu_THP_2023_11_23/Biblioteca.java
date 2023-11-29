package biblioteca_2_recu_THP_2023_11_23;

import java.util.ArrayList;

public class Biblioteca {
	private ArrayList<Socio> socios;
	private ArrayList<Libro> catalogo;
	
	public Biblioteca() {
		this.socios = new ArrayList<Socio>();
		this.catalogo = new ArrayList<Libro>();
	}
	
	public boolean agregarSocio(Socio socio) {
		boolean resultado = false;
		if (this.buscarSocio(socio.getDni()) == null) {
			resultado = this.socios.add(socio);
		}
		return resultado;
	}
	
	public boolean agregarLibro(Libro libro) {
		boolean resultado = false;
		if (this.buscarLibro(libro.getIsbn()) == null) {
			resultado = this.catalogo.add(libro);
		}
		return resultado;
	}
	
	public boolean agregarEjemplares(String isbn, int cantidadEjemplares) {
		boolean resultado = false;
		Libro libro;
		libro = this.buscarLibro(isbn);
		if (libro != null) {
			libro.agregarEjemplares(cantidadEjemplares);
			resultado = true;
		}
		return resultado;
	}

	public void listadoLibrosConEjemplaresDisponibles() {
		ArrayList<LibroMostrar> lista = new ArrayList<>();
		lista = this.obtenerLibrosConDisponibilidad();
		this.mostrarListado(lista, "Listado libros con ejemplares disponibles");
	}
	
	private void mostrarListado(ArrayList<LibroMostrar> lista, String mensaje) {
		System.out.println(mensaje);
		for (LibroMostrar libroMostrar : lista)
			System.out.println(libroMostrar);
	}

	private ArrayList<LibroMostrar> obtenerLibrosConDisponibilidad(){
		ArrayList<LibroMostrar> lista = new ArrayList<>();
		int cantidad;
		for (Libro libro : catalogo) {
			cantidad = libro.getCantEjemplaresDisponibles();
			if(cantidad > 0)
				lista.add(new LibroMostrar(libro.getIsbn(), libro.getTitulo(), cantidad));
		}
		return lista;
	}
	
	public void listadoLibrosPorGenero(Genero genero) {
		ArrayList<LibroMostrar> lista = new ArrayList<>();
		lista = this.obtenerLibrosSegunGenero(genero);
		this.mostrarListado(lista, "Listado libros del genero " + genero);
	}
	
	private ArrayList<LibroMostrar> obtenerLibrosSegunGenero(Genero genero){
		ArrayList<LibroMostrar> lista = new ArrayList<>();
		for (Libro libro : catalogo) {
			if(libro.mismoGenero(genero))
				lista.add(new LibroMostrar(libro.getIsbn(), libro.getTitulo(), libro.getCantEjemplaresDisponibles()));
		}
		return lista;
	}
	
	public ResultadoPrestamo prestarEjemplar(String dni, String isbn) {
		ResultadoPrestamo resultado;
		Socio socio;
		Libro libro;
		Ejemplar ejemplar;
		
		socio = this.buscarSocio(dni);
		if (socio != null) {
			libro = this.buscarLibro(isbn);
			if (libro != null) {
				if (socio.puedeTomarPrestado()) {
					ejemplar = libro.buscarEjemplarAPrestar();
					if (ejemplar != null) {
						ejemplar.prestate();
						socio.agregarPrestamo(ejemplar);
						resultado = ResultadoPrestamo.PRETAMO_OK;
					} else {
						resultado = ResultadoPrestamo.SIN_EJEMPLAR;
					}
				} else {
					resultado = ResultadoPrestamo.MAXIMO_PERMITIDO;
				}
			} else {
				resultado = ResultadoPrestamo.LIBRO_INEXISTENTE;
			}
		} else {
			resultado = ResultadoPrestamo.SOCIO_INEXISTENTE;
		}
		return resultado;
	}
	
	private Socio buscarSocio(String dni) {
		int i = 0;
		Socio socio;
		Socio socioEncontrado = null;
		
		while (i < this.socios.size() && socioEncontrado == null) {
			socio = this.socios.get(i);
			if (socio.mismoDni(dni)) {
				socioEncontrado = socio;
			} else {
				i++;
			}
		}
		
		return socioEncontrado;
	}

	private Libro buscarLibro(String isbn) {
		int i = 0;
		Libro libro;
		Libro libroEncontrado = null;
		
		while (i < this.catalogo.size() && libroEncontrado == null) {
			libro = this.catalogo.get(i);
			if (libro.mismoIsbn(isbn)) {
				libroEncontrado = libro;
			} else {
				i++;
			}
		}

		return libroEncontrado;
	}
	
	//TODO: Armar el metodo "devolverEjemplar" que recibe:
	//El dni del Socio, el isbn del Libro y el numero de ejemplar
	//Debe hacer todas las verificaciones que hagan falta para poder devolver alguno de estos resultados:
	
	//SOCIO_INEXISTENTE: cuando el dni no corresponde a ningun socio de la biblioteca
	//LIBRO_INEXISTENTE: cuando el isbn no pertenece a ninguno libro de la biblioteca
	//EJEMPLAR_INEXISTENTE: cuando el numero de ejemplar con existe para el libro correspondiente
	//EJEMPLAR_NO_PRESTADO: cuando el ejemplar no esta actualmente prestado
	//SOCIO_SIN_EJEMPLAR: cuando el socio no posee ese ejemplar entre sus ejemplares prestados
	//DEVOLUCION_OK: cuando se puede realizar la devolucion correctamente
	
	//Firma del metodo aconsejada: public ResultadoDevolucion devolverEjemplar(String dni, String isbn, int numeroEjemplar) 

	public ResultadoDevolucion devolverEjemplar(String dni, String isbn, int numeroEjemplarDevolver) {
		
		ResultadoDevolucion resultado;
		Socio socio;
		Libro libro;
		Ejemplar ejemplar;
		
		socio = this.buscarSocio(dni);
		if (socio != null) {
			libro = this.buscarLibro(isbn);
			if (libro != null) {
				
					ejemplar = libro.buscarEjemplar();
					if (ejemplar != null) {
						ejemplar.devolvete();
						socio.devolverPrestamo(ejemplar);
						resultado = ResultadoDevolucion.DEVOLUCION_OK;
					} 
					
					
			} else {
				resultado = ResultadoDevolucion.LIBRO_INEXISTENTE;
			}
		} else {
			resultado = ResultadoDevolucion.SOCIO_INEXISTENTE;
		}
		return resultado;
		
	}



}
