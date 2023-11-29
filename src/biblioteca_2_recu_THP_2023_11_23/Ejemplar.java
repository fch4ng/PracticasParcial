package biblioteca_2_recu_THP_2023_11_23;

public class Ejemplar {
	private String fecha;
	private int numero;
	
	public Ejemplar(int numero) {
		this.numero = numero;
		this.fecha = "";
	}
	
	public boolean estaDisponible() {
		return fecha.equals("");
	}
	
	public void prestate() {
		this.fecha = Fecha.getFechaHoy();
	}

	public int getNumero() {
		return this.numero;
	}

	public boolean mismoNumero(int numero) {
		return this.numero == numero;
	}

	public void devolvete() {
		//TODO: debe hacer lo que consideres necesario para que el Ejemplar quede nuevamente disponible para ser prestado
	}
}
