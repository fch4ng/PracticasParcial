package droide;

import java.util.ArrayList;

public class Droide {
	
	private String nombreDroide;
	private boolean droideOperativo;
	private ArrayList<Droide> droidesFueraDeServicio;
	private ArrayList<Pieza> piezas;
	
	
	public Droide(String nombreDroide, boolean droideOperativo) {
		this.nombreDroide           = nombreDroide;
		this.droideOperativo        = droideOperativo;
		this.droidesFueraDeServicio = new ArrayList<Droide>();
		this.piezas                 = new ArrayList<Pieza>();
	}
	
	private ArrayList<Pieza> autoRepararse (){
		
		//buscar en piezas si todas estan operativas
		
		
		
		//con pieza no operativa buscar en droidesFueraDeServicio si hay una piezaOperativa
		
		//si encuentra piezaOperativa agregar a autoRepararse y remover pieza noOperativa
		return piezas;
	}
	
	private Pieza buscarPieza() {
		int i = 0;
		Pieza pieza;
		Pieza piezaNoOperativa = null;
		
		while (i < this.piezas.size()) {
			pieza = this.piezas.get(i);
			
			if (piezas.getDni().equals(dni)) {
				pieza = persona;
			}else {
				i++;
			}
		}
		return pieza;
	}
	
	private Pieza remplazarPieza(int nroPieza, Pieza piezaRemplazo) {
		
		return piezaRemplazo;
	}
	
	

}
