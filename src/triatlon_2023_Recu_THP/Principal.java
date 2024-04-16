package triatlon_2023_Recu_THP;

import java.util.ArrayList;

public class Principal {

	private static final int COMPETIDOR_INICIAL = 1;
	private static final int MAXIMO_COMPETIDORES = 5;
	private static Triatlon triatlon = null;

	public static void main(String[] args) {
		triatlon = new Triatlon();
		ArrayList<Integer> competidores = new ArrayList<>();
		agregarCompetidores(competidores);
		registrarTiempo(1, Disciplina.NATACION, 0, 18, 28);
		triatlon.cerrarInscripcion();
		registrarTiempo(1, Disciplina.NATACION, 0, 18, 28);
		registrarTiempo(1, Disciplina.CARRERA, 0, 27, 46);
		registrarTiempo(1, Disciplina.CICLISMO, 0, 40, 59);
		registrarTiempo(1, Disciplina.CARRERA, 0, 27, 46);
		registrarTiempo(1, Disciplina.NATACION, 0, 19, 3);
		registrarTiempo(2, Disciplina.NATACION, 0, 19, 3);
		registrarTiempo(3, Disciplina.NATACION, 0, 31, 3);
		registrarTiempo(4, Disciplina.NATACION, 0, 30, 54);
		registrarTiempo(4, Disciplina.CICLISMO, 1, 9, 39);
		registrarTiempo(4, Disciplina.CARRERA, 0, 41, 7);
		registrarTiempo(5, Disciplina.NATACION, -1, -1, -1);
		registrarTiempo(50, Disciplina.NATACION, 0, 31, 3);
		registrarAbandono(1);
		registrarAbandono(3);
		registrarAbandono(3);
		mostrarEstados(competidores);
	}

	private static void mostrarEstados(ArrayList<Integer> competidores) {
		for (Integer nroCompetidor : competidores) {
			triatlon.informarEstadoCompetidor(nroCompetidor);
		}
	}

	private static void registrarAbandono(int nroCompetidor) {
		triatlon.registrarAbandono(nroCompetidor);
		
	}

	private static void registrarTiempo(int nroCompetidor, Disciplina disciplina, int horas, int minutos, int segundos) {
		System.out.printf("Competidor %s - %s - %d hrs, %d mins, %d secs\n", nroCompetidor, disciplina, horas, minutos, segundos);
		triatlon.registrarTiempo(nroCompetidor, disciplina, horas, minutos, segundos);
	}

	private static void agregarCompetidores(ArrayList<Integer> competidores) {
		String nombre;
		int nro;
		for (int c = COMPETIDOR_INICIAL; c <= MAXIMO_COMPETIDORES; c++) {
			nombre = "COMPETIDOR " + c;
			nro = triatlon.registrarCompetidor(nombre);
			competidores.add(nro);
			System.out.printf("Registrado %s con numero de competidor %d.\n", nombre, nro);
		}
	}

}