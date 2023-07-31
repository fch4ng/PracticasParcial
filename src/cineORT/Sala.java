package cineORT;

public class Sala {
	
	private int numeroDeSala;
	private int capacidadTotalDeButacas;
	
	
	public Sala(int capacidadTotalDeButacas) {
		setNumeroDeSala();
		this.capacidadTotalDeButacas = capacidadTotalDeButacas;
	}


	private int setNumeroDeSala() {
		
		generarNumeroDeSala();
		
		return numeroDeSala;
	}


	private void generarNumeroDeSala() {
		//contador que arranque en 1 y vaya sumando de a 1 para crear salas nuevas
		
	}
	
	

}
