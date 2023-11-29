package superORT_2022_THP_FIN;

public class MejorCliente {

	private String dni;
	private String nombreCompleto;
	
	
	public MejorCliente(String dni, String nombreCompleto) {
		
		setDni(dni);
		setNombreCompleto(nombreCompleto);
	
	}


	private String getDni() {
		return dni;
	}


	private void setDni(String dni) {
		this.dni = dni;
	}


	public String getNombreCompleto() {
		return nombreCompleto;
	}


	private void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}
	
	
	
	
}
