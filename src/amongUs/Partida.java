package amongUs;

import java.util.ArrayList;

public class Partida {
	
	ArrayList<Tripulante> tripulantes;
	ArrayList<Impostor> impostores;
	
	
	public Partida() {
		
		generarPartida();
	}


	private void generarPartida() {
		
		tripulantes.add(new Tripulante(null, null, false) );
		
		impostores.add(new Impostor(null, null, false));
		
	}
	
	public void obtenerBandoGanador() {
		
		while() {
			
		}
		
	}
	

}
