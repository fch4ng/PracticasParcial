package cineORT;

public class Funcion {
	
	private String codigoIdentificador;
	private String titulo;
	private int duracion;
	private double precioButaca;
	private Sala sala;
	
	
	public Funcion(String codigoIdentificador, String titulo, int duracion, double precioButaca, Sala sala) {
		this.codigoIdentificador = codigoIdentificador;
		this.titulo = titulo;
		this.duracion = duracion;
		this.precioButaca = precioButaca;
		this.sala = sala;
	}
	
	public void cambiarFuncionDeSala(String codigoIdentificdor, int salaActual, int salaNueva) {
		//recorre lista de funcion FUNCION_INEXISTENTE
		//recorre lista de salas SALA_INEXISTENTE: la sala no existe entre las existentes
		//recorre lista de salas CAPACIDAD_SALA_INSUFICIENTE
		//cambio de sala si todos los criterios se cumplen OK
	}

}
