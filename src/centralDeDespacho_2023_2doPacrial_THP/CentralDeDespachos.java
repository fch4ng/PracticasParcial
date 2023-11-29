package centralDeDespacho_2023_2doPacrial_THP;

import java.util.ArrayList;

public class CentralDeDespachos {
	private ArrayList<Flete> fletesDisponibles;
	private ArrayList<Flete> fletesDespachados;
	private ArrayList<Paquete> paquetesPendientes;
	
	public CentralDeDespachos() {
		fletesDisponibles = new ArrayList<>();
		fletesDespachados = new ArrayList<>();
		paquetesPendientes = new ArrayList<>();
	}
	
	private Flete buscarFlete(String patente, ArrayList<Flete> listaFletes) {		
		int index = 0;
		while (index < listaFletes.size() && !listaFletes.get(index).mismaPatente(patente)) {			
			index++;
		}
		return index < listaFletes.size() ? listaFletes.get(index) : null;
	}
	
	public boolean agregarFlete(String patente, double cargaMaxima) {
		boolean pudo = false;
		if (buscarFlete(patente, fletesDisponibles) == null) {
			fletesDisponibles.add(new Flete(patente, cargaMaxima));
			pudo = true;
		}
		return pudo;
	}
	
	public void agregarPaquete(Sucursal sucursal, double peso) {
		paquetesPendientes.add(new Paquete(sucursal, peso));
	}

	public int paquetesPendientes() {
		return paquetesPendientes.size();
	}
	

	
	/**
	 * Procesa todos los paquetes pendientes de despacho.
	 * Para cada paquete busca el primer flete disponible que pueda cargarlo.
	 * Si lo puede cargar, lo elimina de la lista, de otro modo permanece en la lista de pendientes.
	 * Si al cargar un paquete en un flete este sobrepasa el umbral m�nimo de despacho, el flete debe
	 *   eliminarse de la lista de fletes disponibles y agregarse a la de fletes despachados.
	 * @return
	 */
	public int despacharPendientes() {
		// TODO
		
		//se que tengo que recorrer el arraylist de paquetesPendientes y cargarlos al arraylist de fletesDespachados
		//pero estoy trabado
		
		return fletesDespachados.size();
	}
	
	/**
	 * Lista todos los fletes despachados y para cada uno muestra:
	 * - patente
	 * - destino
	 * - paquete (nro de seguimiento del paquete m�s pesado)
	 * - peso (peso del paquete m�s pesado dentro del flete)
	 */
	public void listarFletesDespachadosConPaqueteMasPesado() {
		System.out.println("Listado de fletes despachados con su paquete m�s pesado:");
		// TODO
		for (Flete flete : fletesDespachados) {
			System.out.println(flete.toString());
			
			//pendiente resolver paquete mas pesado por pantalla
		}
	}
}

