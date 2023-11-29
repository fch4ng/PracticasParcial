package biblioteca_2_recu_THP_2023_11_23;

import java.util.ArrayList;

public class Socio {
	private static final int TOPE_PRESTAMOS = 3;
	private String dni;
	private ArrayList<Ejemplar> ejemplaresEnPrestamo;
	
	public Socio(String dni) {
		this.dni = dni;
		this.ejemplaresEnPrestamo = new ArrayList<Ejemplar>();
	}
	
	public boolean mismoDni(String dni) {
		return this.dni.equals(dni);
	}
	
	public boolean puedeTomarPrestado() {
		return this.ejemplaresEnPrestamo.size() < Socio.TOPE_PRESTAMOS;
	}
	
	public void agregarPrestamo(Ejemplar ejemplarPrestado) {
		if (ejemplarPrestado != null) {
			this.ejemplaresEnPrestamo.add(ejemplarPrestado);
		}
	}

	public String getDni() {
		return this.dni;
	}

	//TODO: Este metodo debe eliminar al ejemplar de la lista de ejemplares prestados a este Socio (si existe)
	//y marcar al ejemplar como disponible nuevamente
	//Debe devolver un valor booleano que indique si logro completar la devolucion del ejemplar
	public boolean devolverPrestamo(Ejemplar ejemplar) {
		
		//El return true esta puesto solamente para que compile
		return true;
	}
}
