import java.util.ArrayList;

public class TindOrt {
	
	private ArrayList<Persona> personas;
	
	public TindOrt() {
		this.personas = new ArrayList<Persona>();
	}

	static private boolean validarEdad(int edad) {
		return edad >= 18 && edad <= 70;
	}
	
	private Persona buscarPersonaPorNombre(String nombre) {
		Persona personaEncontrada = null;
		int i = 0;
		while (i < personas.size() && personaEncontrada == null) {
			Persona persona = personas.get(i);
			if (persona.getNombre().equals(nombre)) {
				personaEncontrada = persona;
			}
			i++;	
		}
		return personaEncontrada;
	}
	
	private Persona buscarPersonaPorEmail(String email) {
		Persona personaEncontrada = null;
		int i = 0;
		while (i < personas.size() && personaEncontrada == null) {
			Persona persona = personas.get(i);
			if (persona.getEmail().equals(email)) {
				personaEncontrada = persona;
			}
			i++;	
		}
		return personaEncontrada;
	}
	
	public void registrarPersona(String nombre, String email, Genero generoPropio, int edadPropia, Genero generoDeseado,
			int edadMinimaDeseada, int edadMaximaDeseada) {
		
		if (nombre.isEmpty() || email.isEmpty()) {
			System.out.println("El nombre y el email no pueden ser vacíos");
		}
		else if (!validarEdad(edadPropia) || !validarEdad(edadMinimaDeseada) || !validarEdad(edadMaximaDeseada)) {
			System.out.println("Las edades deben ser entre 18 y 70");
		}
		else if (generoPropio == Genero.INDISTINTO) {
			System.out.println("El género propio no puede ser indistinto");
		}
		else if (buscarPersonaPorNombre(nombre) != null) {
			System.out.println("Ya existe una persona con ese nombre");
		}
		else if (buscarPersonaPorEmail(email) != null) {
			System.out.println("Ya existe una persona con ese email");
		}
		else {
			Persona persona = new Persona(nombre, email, generoPropio, edadPropia, generoDeseado, edadMinimaDeseada, edadMaximaDeseada);
			personas.add(persona);
			System.out.println("Persona agregada a TindOrt");
		}
	}
	
	static boolean verificarCoincidenciaParcial (Persona persona1, Persona persona2) {
		return (persona1.getGeneroDeseado() == persona2.getGeneroPropio() 
					|| persona1.getGeneroDeseado() == Genero.INDISTINTO)
				&& persona1.getEdadMinimaDeseada() <= persona2.getEdadPropia()
				&& persona1.getEdadMaximaDeseada() >= persona2.getEdadPropia();
	}
	
	static boolean verificarCoincidenciaTotal (Persona persona1, Persona persona2) {
		return  verificarCoincidenciaParcial (persona1, persona2) 
				&& verificarCoincidenciaParcial (persona2, persona1);
	}
	
	public ArrayList<Persona> obtenerCoincidencias(String email) {
		ArrayList<Persona> coincidencias = null;
		
		Persona persona1 = buscarPersonaPorEmail(email);
		if (persona1 == null) {
			System.out.println("Esta persona no existe con ese correo");
		}
		else {
			coincidencias = new ArrayList<Persona>();
			for (Persona persona2 : this.personas) {
				if (persona1 != persona2 && verificarCoincidenciaTotal(persona1, persona2)) {
					coincidencias.add(persona2);
				}
			}
		}
		return coincidencias;
	}
	
}







