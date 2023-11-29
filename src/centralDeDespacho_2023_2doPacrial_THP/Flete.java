package centralDeDespacho_2023_2doPacrial_THP;

import java.util.ArrayList;

public class Flete {
	private double PORCENTAJE_UMBRAL_LLENADO = 80;
	
	private String patente;
	private double cargaMaxima;
	private double cargaActual;
	private Sucursal destino;
	private ArrayList<Paquete> paquetes;
	
	/** 
	 * Este constructor inicializa un flete.
	 * @param patente
	 * @param cargaMaxima
	 */
	public Flete(String patente, double cargaMaxima) {
		// TODO
		
		setPatente(patente);
		setCargaMaxima(cargaMaxima);

	}
	
	private void setPatente(String patente) {
		this.patente = patente;
	}

	private void setCargaMaxima(double cargaMaxima) {
		this.cargaMaxima = cargaMaxima;
	}

	public String getPatente() {
		return patente;
	}

	public double getCargaMaxima() {
		return cargaMaxima;
	}

	public double getCargaActual() {
		return cargaActual;
	}

	public void setCargaActual(double cargaActual) {
		this.cargaActual = cargaActual;
	}

	public double getPORCENTAJE_UMBRAL_LLENADO() {
		return PORCENTAJE_UMBRAL_LLENADO;
	}

	public Sucursal getDestino() {
		return destino;
	}

	public void setDestino(Sucursal destino) {
		this.destino = destino;
	}

	/**
	 * Devuelve verdadero si la patente coincide con la patente del flete.
	 * @param patente
	 * @return
	 */
	public boolean mismaPatente(String patente) {
		// TODO
		
		boolean coincide = false;
		
		coincide = patente.equals(getPatente());
		
		return coincide;
	}
	
	/**
	 * Devuelve verdadero si la carga del flete es superior al umbral (80%).
	 * @return
	 */
	public boolean esDespachable() {
		// TODO
		boolean despachable = false;
		double porcentajeCargaMaxima = 0;
		
		porcentajeCargaMaxima = (getCargaMaxima() * getPORCENTAJE_UMBRAL_LLENADO()) * 100;
		
		despachable = getCargaActual() > porcentajeCargaMaxima;
		
		return despachable;
	}
	
	/**
	 * Devuelve verdadero si se cumplen las siguientes condiciones:
	 * - el flete no tiene asignado ning�n destino o en caso de tenerlo, coincide con el paquete.
	 * - el peso del paquete no har� sobrepasar la carga m�xima del flete.
	 * @param paquete
	 * @return
	 */
	private boolean puedeCargar(Paquete paquete) {
		// TODO
		
		boolean puedeCargar = false;
		boolean destinoCarga = false;
		boolean paqueteCarga = false;
		
		if(getDestino() == null || getDestino() == paquete.getDestino() ) {
			
			destinoCarga = true;
		}
		
		if(paquete.getPeso() < getCargaMaxima()) {
			
			paqueteCarga = true;
		}
		
		puedeCargar = destinoCarga && paqueteCarga;
		
		return puedeCargar;
	}
	
	/**
	 * Este m�todo debe verificar que el flete sea capaz de llevar este paquete.
	 * En caso afirmativo debe asegurarse que el flete tenga seteado ese destino
	 * y debe registrar el paquete actualizando la carga del flete.
	 * En caso que no lo pueda cargar, debe devolver false
	 * @param paquete
	 * @return
	 */
	public boolean cargarPaquete(Paquete paquete) {
		//TODO
		
		boolean cargarPaquete = false;
		
		cargarPaquete = puedeCargar(paquete) && esDespachable();
		
		return cargarPaquete;
	}

	@Override
	public String toString() {
		return "Flete [patente=" + patente + ", destino=" + destino + "]";
	}
}


