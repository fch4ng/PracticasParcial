package amongUs;

public class Tripulante {

	private String nombre;
	private String color;
	private boolean vive;
	
	public Tripulante(String nombre, String color, boolean vive) {
		setNombre(nombre);
		  setColor(color);
		    setVive(vive);
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getColor() {
		return color;
	}
	
	public boolean isVive() {
		return vive;
	}
	
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	private void setColor(String color) {
		this.color = color;
	}
	
	private void setVive(boolean vive) {
		this.vive = vive;
	}
	
	

}
