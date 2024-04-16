package superORT_2022_THP_FIN;

import java.util.ArrayList;

public class Cliente {
	private String dni;
	private String nombre;
	private String apellido;
	private Carrito activo;
	private ArrayList<Carrito> carritos;

	/**
	 * Construye el cliente cargandole los datos del cliente proporcionados. Tambien
	 * inicializa lo concerniente a sus carritos de compra.
	 * 
	 * @param dni
	 * @param nombre
	 * @param apellido
	 */
	public Cliente(String dni, String nombre, String apellido) {
		setDni(dni);
		setNombre(nombre);
		setApellido(apellido);
		activo = null;
		carritos = new ArrayList<>();
	}

	/**
	 * Agrega un producto con su cantidad al carrito. Siempre se hace en un carrito
	 * sin finalizar. Cuando el cliente no tiene un carrito sin finalizar se creara
	 * uno nuevo.
	 * 
	 * @param producto
	 * @param cantidad
	 */
	public void agregarAlCarrito(Producto producto, int cantidad) {
		obtenerCarrito().agregarItem(producto, cantidad);
	}

	/**
	 * Finaliza la compra actual solo cuando hay un carrito activo. El carrito
	 * activo, de existir, se agrega a los carritos ya existentes y el campo que
	 * guarda el carrito activo se limpia para que la proxima vez se cree un nuevo
	 * carrito.
	 * 
	 * @return El resultado de la compra
	 */
	public ResultadoCompra finalizarCompra() {
		ResultadoCompra resultado = ResultadoCompra.CLIENTE_SIN_CARRITO;
		if (activo != null) {
			activo.finalizarCompra();
			carritos.add(activo);
			activo = null;
			resultado = ResultadoCompra.OK;
		}
		return resultado;
	}

	/**
	 * @return El apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * @return El dni
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * @return El nombre
	 */
	private String getNombre() {
		return nombre;
	}

	/**
	 * @param dni El dni a comparar para determinar si se trata del mismo cliente.
	 * @return True cuando el valor del dni provisto coincide con el del cliente.
	 */
	public boolean mismoCliente(String dni) {
		return this.dni.equals(dni);
	}

	/**
	 * Obtiene el carrito activo del cliente (si no existe lo crea).
	 * 
	 * @return El carrito activo.
	 */
	private Carrito obtenerCarrito() {
		if (activo == null) {
			activo = new Carrito();
		}
		return activo;
	}

	/**
	 * Obtiene el valor de la compra con mayor importe de todas las realizadas por
	 * el cliente (guardadas en los carritos de las compras ya cerradas).
	 * 
	 * @return El valor de la compra con mayor importe
	 */
	public double obtenerMontoMayorCompra() {
		double montoMayor = 0;
		double montoCarrito;
		for (Carrito carrito : carritos) {
			montoCarrito = carrito.obtenerCostoTotal();
			if (montoCarrito > montoMayor) {
				montoMayor = montoCarrito;
			}
		}
		return montoMayor;
	}

	/**
	 * @param apellido El valor para el apellido
	 */
	private void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * @param dni El valor para el dni
	 */
	private void setDni(String dni) {
		this.dni = dni;
	}

	/**
	 * @param nombre El valor para el nombre
	 */
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Desarrollar este metodo que debe devolver el nombre completo del Cliente.
	 * 
	 * @return El nombre completo del cliente
	 */
	public String getNombreCompleto() {
		// TODO Reemplazar por lo que corresponda
		
		String nombreCompleto = null;
		
		nombreCompleto = getNombre()+ " " + getApellido();
		
		return nombreCompleto;
	}
}
