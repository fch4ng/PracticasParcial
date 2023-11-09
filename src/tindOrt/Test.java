import java.util.ArrayList;

public class Test {

	private static void mostrarListado(TindOrt tindOrt, String email) {
		ArrayList<Persona> coincidencias = tindOrt.obtenerCoincidencias(email);
		if (coincidencias == null) {
			System.out.println(email + " no corresponde a ningún usuario.");
		}
		else if (coincidencias.size() == 0) {
			System.out.println("No hay coincidencias para " + email);
		}
		else {
			System.out.println("Listado de coincidencias para " + email);
			for (Persona p: coincidencias) {
				System.out.println(p);
			}
		}		
	}
	
	public static void main(String[] args) {
		TindOrt tindOrt = new TindOrt();

		tindOrt.registrarPersona("Juan", "juan@mail.com", Genero.MASCULINO, 30, Genero.FEMENINO, 25, 35);
		tindOrt.registrarPersona("Carlos", "carlos@mail.com", Genero.MASCULINO, 45, Genero.FEMENINO, 30, 50);
		tindOrt.registrarPersona("Carlos", "carlos@mail.com", Genero.MASCULINO, 45, Genero.FEMENINO, 25, 35);
		tindOrt.registrarPersona("Maria", "maria@mail.com", Genero.FEMENINO, 28, Genero.MASCULINO, 30, 40);
		tindOrt.registrarPersona("Ana", "ana@mail.com", Genero.FEMENINO, 32, Genero.MASCULINO, 28, 42);
		tindOrt.registrarPersona("Eva", "eva@mail.com", Genero.FEMENINO, 32, Genero.MASCULINO, 40, 50);

		mostrarListado(tindOrt, "juan@mail.com");
		mostrarListado(tindOrt, "carlos@mail.com");
	}

}


