package RPG;

import java.util.ArrayList;

import com.ort.entidades.Cliente;

public class Mitologia {
	
	private ArrayList <Leyenda> leyendas = new ArrayList <Leyenda>();

	public Mitologia() {
		this.leyendas = null;
	}
	
	public boolean eliminarPersonaje(String nombrePersonaje) {
		
		boolean personajeEliminado = false;
		Leyenda leyenda = null;
		int pos = 0;

		while (pos < leyendas.size() && !leyendas.get(pos).mismoPersonaje(nombrePersonaje)) {
			pos++;
		}
		if (pos < leyendas.size()) {
			leyendas = leyendas.get(pos);
		}
		
		return personajeEliminado;
	}
	
	public RESULTADO_ENFRENTAMIENTO enfrentarPersonajes (String nombrePersonaje1, String nombrePersonaje2) {
		
	}
	

}
