package registroMarea;

public class RegistroDeMarea {
	
	
		 String fecha;
	 double mareaMinima;
	 double mareaMaxima;
	
	 
	 public RegistroDeMarea(String fecha, double mareaMinima, double mareaMaxima) {
		this.fecha = fecha;
		this.mareaMinima = mareaMinima;
		this.mareaMaxima = mareaMaxima;
	
	 }
	 
	 public double getDiferencia() {
		 
		 double diferencia;
		 
		 diferencia = getMareaMinima() - getMareaMaxima();
		 
		 return diferencia;
	 }
		
	 public boolean mismaFecha(String fecha) {
		 
	 }

	public String getFecha() {
		return fecha;
	}

	public double getMareaMinima() {
		return mareaMinima;
	}

	public double getMareaMaxima() {
		return mareaMaxima;
	}

	@Override
	public String toString() {
		return "RegistroDeMarea [fecha=" + fecha + ", mareaMinima=" + mareaMinima + ", mareaMaxima=" + mareaMaxima
				+ "]";
	}
	 
	 
}
