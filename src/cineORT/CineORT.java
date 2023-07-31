package cineORT;

import java.util.ArrayList;

public class CineORT {
	
	private ArrayList<Funcion> funciones;
	private ArrayList<Cliente> clientes;
	private ArrayList<Sala> salas;
	
	
	public CineORT() {
		this.funciones = null;
		this.clientes = null;
		this.salas = null;
	}
	
	public void comprarEntrada(String dni, String codigoIdentificador, int cantidadButacas) {
		//recorre lista de clientes CLIENTE_INEXISTENTE:
		while(dni.equalsIgnoreCase(clientes.dni)) {
			
		}
		
		//recorre lista de funcion FUNCION_INEXISTENTE o FUNCION_SIN_CAPACIDAD
		//compra exitosa si todos los criterios se cumplen OK
		
	}

	public void obtenerMejoresClientes() {
		//que devuelva una colección con los clientes que, sumando todas sus entradas, 
		//tengan el monto total mayor. Puede haber ninguno, uno o varios clientes en 
		//la colección resultante
	}
	
	public void obtenerMejoresClientes(int montoMinimo) {
		//que reciba un monto total mínimo y devuelva una colección con los clientes que, 
		//sumando todas sus entradas, tengan un monto total superior al monto indicado. 
		//Puede haber ninguno, uno o varios clientes en la colección resultante
	}
}
