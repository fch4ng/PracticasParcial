package registroMarea;

public class LectorDeMareas {
	
	
	
	public LectorDeMareas() {
		
	}
	
	public RegistroDeMarea getRegistroDeMarea() {
		return registroDeMarea;
		
	}
	
	public boolean esFechaISO(String fecha) {
		
		return esFechaISO;
	}
	
	public boolean esFinDeCarga(String carga) {
		
		return esFinDeCarga;
	}
	
	public String obtenerFecha() {
		
		return registroDeMarea.getFecha();
	}
	
	public String obtenerMareaMinima() {
		
		return registroDeMarea.getMareaMinima;
	}
}
