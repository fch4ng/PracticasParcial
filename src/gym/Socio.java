
public class Socio {

	private int dni;
	private String nombre;
	private int categoria;
	private double deuda;
	private char estado;
	
	public Socio(int dni, String nombre, int categoria, double deuda) {
		this.dni = dni;
		this.nombre = nombre;
		this.categoria = categoria;
		this.deuda = deuda;
		this.estado = 'N';
	}

	public int getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	public int getCategoria() {
		return categoria;
	}

	public double getDeuda() {
		return deuda;
	}

	public char getEstado() {
		return estado;
	}

	public void setEstado(char estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Socio [dni=" + dni + ", nombre=" + nombre + ", categoria=" + categoria + ", deuda=" + deuda
				+ ", estado=" + estado + "]";
	}
	
}
