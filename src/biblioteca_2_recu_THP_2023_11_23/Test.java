package biblioteca_2_recu_THP_2023_11_23;

public class Test {
	private static Biblioteca biblio = new Biblioteca();
	public static void main(String[] args) {
		cargarLibros();
		cargarSocios();
		cargarEjemplares();
		
		//Muestro los libros de mi catalogo con ejemplares disponibles:
		biblio.listadoLibrosConEjemplaresDisponibles();
		System.out.println();

		//Muestro los libros de mi catalogo segun Genero:
		biblio.listadoLibrosPorGenero(Genero.CIENCIA_FICCION);
		biblio.listadoLibrosPorGenero(Genero.NOVELA);
		biblio.listadoLibrosPorGenero(Genero.POLICIAL);
		System.out.println();
		
		//TODO: Bug => por algun motivo siempre devuelve SOCIO_INEXISTENTE
		prestarEjemplar("12345678", "ISBN-FUNDA");
		prestarEjemplar("12345678", "ISBN-ALEPH");
		prestarEjemplar("12345678", "ISBN-TUNEL");
		prestarEjemplar("12345678", "ISBN-ROBOT");
		prestarEjemplar("11111111", "ISBN-ALEPH");
		prestarEjemplar("66666666", "ISBN-TUNEL");
		prestarEjemplar("12345678", "ISBN-CIEN");
		System.out.println();
		
		//Muestro los libros de mi catalogo con ejemplares disponibles
		//Luego de haber realizado algunos prestamos:
		biblio.listadoLibrosConEjemplaresDisponibles();
		System.out.println();

		//TODO: armar algunas pruebas para poder probar el metodo "devolverEjemplar"
		//Por ejemplo: devolverEjemplar("12345678", "ISBN-FUNDA", 1);

	}
	
	private static void prestarEjemplar(String dni, String isbn) {
		System.out.println("Le intento prestar al socio " + dni + " el libro con ISBN " + isbn + " con el resultado: ");
		System.out.println(biblio.prestarEjemplar(dni, isbn)); 
	}
	
	private static void cargarLibros() {
		biblio.agregarLibro(new Libro("ISBN-FUNDA", "Fundacion", "Isaac Asimov", Genero.CIENCIA_FICCION));
		biblio.agregarLibro(new Libro("ISBN-ROBOT", "Yo, Robot", "Isaac Asimov", Genero.CIENCIA_FICCION));
		biblio.agregarLibro(new Libro("ISBN-TUNEL", "El tunel", "Enresto Sabato", Genero.NOVELA));
		biblio.agregarLibro(new Libro("ISBN-ALEPH", "El Aleph", "Jorge Luis Borges", Genero.NOVELA));
		biblio.agregarLibro(new Libro("ISBN-ORIENT", "Asesinato en el Orient Express", "Agatha Christie", Genero.POLICIAL));
	}
	
	private static void cargarSocios() {
		biblio.agregarSocio(new Socio("12345678"));
		biblio.agregarSocio(new Socio("11111111"));
		biblio.agregarSocio(new Socio("22222222"));
	}
	
	private static void cargarEjemplares() {
		//Agrego tres ejemplares de Fundacion
		biblio.agregarEjemplares("ISBN-FUNDA", 3);
		//Agrego cuatro ejemplares de Yo, Robot
		biblio.agregarEjemplares("ISBN-ROBOT", 4);
		//Agrego cinco ejemplares de El tunel
		biblio.agregarEjemplares("ISBN-TUNEL", 5);
		//Agrego un ejemplar de El Aleph
		biblio.agregarEjemplares("ISBN-ALEPH", 1);
		//Agrego dos ejemplares de Asesinato en el ...
		biblio.agregarEjemplares("ISBN-ORIENT", 2);
	}

}
