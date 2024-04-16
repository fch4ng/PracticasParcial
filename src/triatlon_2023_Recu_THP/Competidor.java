package triatlon_2023_Recu_THP;

import java.util.ArrayList;

public class Competidor {

	private static int proximoCompetidor = 1;

	private int numero;
	private String nombre;
	private boolean abandono;
	private ArrayList<Tiempo> tiempos;

	public Competidor(String nombre) {
		this.nombre = nombre;
		this.numero = proximoCompetidor++;
		this.abandono = false;
		this.tiempos = new ArrayList<>();
	}

	public boolean abandonoCompetencia() {
		return this.abandono;
	}

	public boolean completoCompetencia() {
		return tiempos.size() == Disciplina.values().length;
	}

	public int getNumero() {
		return numero;
	}

	public boolean mismoNombre(String nombre) {
		return this.nombre.equals(nombre);
	}

	public boolean mismoNumero(int nroCompetidor) {
		return this.numero == nroCompetidor;
	}

	public void registrarAbandono() {
		this.abandono = true;
	}

	public boolean registrarTiempo(Disciplina disciplina, int hrs, int mins, int secs) {
		boolean resultado = false;
		Tiempo tiempoPorRegistrar;
		
		if (disciplina.ordinal() == tiempos.size()) {
			// Es la disciplina correcta, debe cargarse
			// TODO - Agregar el tiempo solo si los valores indicado son validos. Ayudarse con TiempoHelper
			
			tiempoPorRegistrar = TiempoHelper.crearInstancia(hrs, mins, secs);
			
			if(tiempos.add(tiempoPorRegistrar)) {
				
				resultado = true;
			}
			
			
		}
		return resultado;
	}

	public void informarEstado() {
		System.out.print("El competidor " + numero);
		// TODO - Informar el estado del competidor (en la meta, abandono o en competencia) con su tiempo total.
		mostrarTiemposParciales();

	}

	private void mostrarTiemposParciales() {
		// TODO - Mostrar los tiempos del competidor en cada disciplina, la haya cumplido o no.
	}

	private void mostrarTiempoParcial(Disciplina disciplina) {
		System.out.print("\t"+ disciplina + ": \t");
		if (disciplina.ordinal() < tiempos.size()) {
			System.out.println(tiempos.get(disciplina.ordinal()));
		} else {
			System.out.println("No registrado");
		}
	}

	private Tiempo tiempoTotal() {
		// TODO - Devolver una instancia de Tiempo con los tiempos acumulados. Usar TiempoHelper.
		
		Tiempo tiempoTotal = TiempoHelper.crearInstancia(tiempos.size());
		
		
		
		return tiempoTotal; // Reemplazar, este valor es para que no marque error.
	}

	@Override
	public String toString() {
		return "Competidor [numero=" + numero + ", nombre=" + nombre + ", abandono=" + abandono + ", acumulado="
				+ tiempoTotal() + "]";
	}

}