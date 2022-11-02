package ejCaminones;

import java.util.ArrayList;

public class Empresa {

	private String nombreEmpresa;
	private ArrayList<Provincia> listaDeProvincias;
	private ArrayList<Camion> listaDeCamiones;
	private ArrayList<Paquete> listaDePaquetes;
	private ArrayList<RegistroPendiente> listaRegistroPendiente;
	
	
	
	public Empresa(String nombreEmpresa, ArrayList<Provincia> listaDeProvincias, ArrayList<Camion> listaDeCamiones,
			ArrayList<Paquete> listaDePaquetes, ArrayList<RegistroPendiente> listaRegistroPendiente) {
		this.nombreEmpresa = nombreEmpresa;
		this.listaDeProvincias = listaDeProvincias;
		this.listaDeCamiones = listaDeCamiones;
		this.listaDePaquetes = listaDePaquetes;
		this.listaRegistroPendiente = listaRegistroPendiente;
	}

	public boolean agregarPaquete(double peso, double valorAsegurado, String nombreProvincia) {
		boolean sePudoAgregar = false;
		
		buscarProvincia(nombreProvincia);
		
		Paquete paqueteNuevo = new Paquete(peso, valorAsegurado);
		
		listaDePaquetes.add(paqueteNuevo);
		
		return sePudoAgregar;
	}

	public void cargarPaquete() {
		
		for (int i = 0; i < listaDePaquetes.size(); i+) {
			
		}
		
	}

	public void reincorporarPaquetes() {
		
	}

	private Provincia buscarProvincia(String nombreProvincia) {
		
	}

	private void agregarResultado(Paquete paquete, Motivo motivo) {
		
	}

	private Camion buscarCamion(Provincia provincia) {
		
	}
}
