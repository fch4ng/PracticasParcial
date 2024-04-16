package triatlon_2023_Recu_THP;

public class Tiempo {

	private int horas;
	private int minutos;
	private int segundos;

	public Tiempo(int horas, int minutos, int segundos) {
		setHoras(horas);
		setMinutos(minutos);
		setSegundos(segundos);
	}

	@Override
	public String toString() {
		return String.format("%d:%02d:%02d", horas, minutos, segundos).replaceAll(" ", "0");
	}

	public void acumular(Tiempo tiempo) {
		// TODO - Acumular el tiempo recibido al actual usando la clase auxiliar TiempoHelper.
		Tiempo tiempoAcumulado;
		
		tiempoAcumulado = TiempoHelper.crearInstancia(getHoras(), getMinutos(), getSegundos());
			
		addTiempo(tiempoAcumulado.getHoras(), tiempoAcumulado.getMinutos(), tiempoAcumulado.getSegundos());		
		
	}

	private int getHoras() {
		return horas;
	}

	private void setHoras(int horas) {
		this.horas = horas;
	}

	private int getMinutos() {
		return minutos;
	}

	private void setMinutos(int minutos) {
		this.minutos = minutos;
	}

	private int getSegundos() {
		return segundos;
	}

	private void setSegundos(int segundos) {
		this.segundos = segundos;
	}
	
	private void addTiempo(int horas, int minutos, int segundos) {
		this.horas =+ horas;
		this.minutos =+ minutos;
		this.segundos =+ segundos;
	}
	
}