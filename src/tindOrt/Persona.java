
public class Persona {
	private String nombre;
	private String email;
	private Genero generoPropio;
	private int edadPropia;
	private Genero generoDeseado;
	private int edadMinimaDeseada;
	private int edadMaximaDeseada;
	
	public Persona(String nombre, String email, Genero generoPropio, int edadPropia, Genero generoDeseado,
			int edadMinimaDeseada, int edadMaximaDeseada) {
		this.nombre = nombre;
		this.email = email;
		this.generoPropio = generoPropio;
		this.edadPropia = edadPropia;
		this.generoDeseado = generoDeseado;
		this.edadMinimaDeseada = edadMinimaDeseada;
		this.edadMaximaDeseada = edadMaximaDeseada;
	}

	public String getNombre() {
		return nombre;
	}

	public String getEmail() {
		return email;
	}

	public Genero getGeneroPropio() {
		return generoPropio;
	}

	public int getEdadPropia() {
		return edadPropia;
	}

	public Genero getGeneroDeseado() {
		return generoDeseado;
	}

	public int getEdadMinimaDeseada() {
		return edadMinimaDeseada;
	}

	public int getEdadMaximaDeseada() {
		return edadMaximaDeseada;
	}
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", email=" + email + ", generoPropio=" + generoPropio + ", edadPropia="
				+ edadPropia + "]";
	}

}
