package biblioteca_2_recu_THP_2023_11_23;

public class LibroMostrar {
	private String isbn;
	private String titulo;
	private int cantidad;
	
	//TODO: adaptar esta clase para que permita registrar dos atributos cantidades: cantidadDisponible y cantidadEnPrestamo

	public LibroMostrar(String isbn, String titulo, int cantidad) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.cantidad = cantidad;
	}

	public String toString() {
		return "ISBN: " + this.isbn + " - " + this.titulo + " - Ejemplares Disponibles: " + this.cantidad;
	}
}
