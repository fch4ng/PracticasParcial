package droide;

public class Pieza {
	
	private String nombrePieza;
	private boolean piezaOperativa;
	
	
	
	public Pieza(String nombrePieza, boolean piezaOperativa) {
		this.nombrePieza = nombrePieza;
		this.piezaOperativa = piezaOperativa;
		
	}

	public String getNombrePieza() {
		return nombrePieza;
	}


	public boolean isPiezaOperativa() {
		return piezaOperativa;
	}
	
	
	
	

}
