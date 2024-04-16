package triatlon_2023_Recu_THP;

import java.util.ArrayList;

public class Triatlon {

	private boolean inscripcionAbierta;
	private ArrayList<Competidor> enCompetencia;
	private ArrayList<Competidor> enMeta;

	public Triatlon() {
		enCompetencia = new ArrayList<>();
		enMeta = new ArrayList<>();
		inscripcionAbierta = true;
	}

	private Competidor buscarCompetidor(int nroCompetidor, ArrayList<Competidor> coleccion) {
		int pos = 0;
		while (pos < coleccion.size() && !coleccion.get(pos).mismoNumero(nroCompetidor))
			pos++;
		return (pos < coleccion.size()) ? coleccion.get(pos) : null;
	}

	private Competidor buscarCompetidor(String nombre) {
		int pos = 0;
		while (pos < enCompetencia.size() && !enCompetencia.get(pos).mismoNombre(nombre))
			pos++;
		return (pos < enCompetencia.size()) ? enCompetencia.get(pos) : null;
	}

	public void cerrarInscripcion() {
		inscripcionAbierta = false;
	}

	public void informarEstadoCompetidor(int nroCompetidor) {
		Competidor competidor = buscarCompetidor(nroCompetidor, enCompetencia);
		if (competidor == null)
			competidor = buscarCompetidor(nroCompetidor, enMeta);
		if (competidor == null)
			System.out.println("Competidor " + nroCompetidor + " no registrado");
		else
			competidor.informarEstado();
	}

	private void moverALaMeta(Competidor competidor) {
		if (enCompetencia.remove(competidor))
			enMeta.add(competidor);
	}

	public void registrarAbandono(int nroCompetidor) {
		// TODO - Registrar el abandono de un competidor. Tener en cuenta la salida esperada.
	}

	public int registrarCompetidor(String nombre) {
		int resultado = -1;
		Competidor competidor = buscarCompetidor(nombre);
		if (competidor == null) {
			competidor = new Competidor(nombre);
			enCompetencia.add(competidor);
			resultado = competidor.getNumero();
		}
		return resultado;
	}

	public void registrarTiempo(int nroCompetidor, Disciplina disciplina, int hrs, int mins, int secs) {
		if (inscripcionAbierta) {
			System.out.println("La inscripcion aun esta abierta");
		} else {
			Competidor competidor = buscarCompetidor(nroCompetidor, enCompetencia);
			if (competidor == null) {
				competidor = buscarCompetidor(nroCompetidor, enMeta);
				if (competidor == null) {
					System.out.println("Competidor inexistente");
				} else {
					System.out.println("El competidor ya est� en la meta");
				}
			} else if (competidor.registrarTiempo(disciplina, hrs, mins, secs)) {
				System.out.println("Tiempo registrado");
				if (competidor.completoCompetencia())
					moverALaMeta(competidor);
			} else {
				System.out.println("Error en la carga");
			}
		}
	}

}