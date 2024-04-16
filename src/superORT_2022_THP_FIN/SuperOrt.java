package superORT_2022_THP_FIN;

import java.util.ArrayList;

public class SuperOrt {
	private ArrayList<Cliente> clientes;
	private ArrayList<Producto> productos;

	/**
	 * Crea la aplicacion preparando las colecciones de productos y clientes.
	 */
	public SuperOrt() {
		clientes = new ArrayList<>();
		productos = new ArrayList<>();
	}

	/**
	 * A partir del dni de un posible cliente y de un codigo de producto, busca en
	 * determinado orden estos elementos en sus colecciones. De encontrarlos, agrega
	 * el producto y la cantidad al carrito de compras activo del cliente.
	 * 
	 * @param dni
	 * @param codProd
	 * @param cant
	 * @return El resultado de la operacion.
	 */
	public ResultadoItem agregarAlCarrito(String dni, String codProd, int cant) {
		ResultadoItem resultado = ResultadoItem.OK;
		Cliente cliente = buscarCliente(dni);
		if (cliente != null) {
			Producto producto = buscarProducto(codProd);
			if (producto != null) {
				cliente.agregarAlCarrito(producto, cant);
			} else {
				resultado = ResultadoItem.PRODUCTO_INEXISTENTE;
			}
		} else {
			resultado = ResultadoItem.CLIENTE_INEXISTENTE;
		}
		return resultado;
	}

	/**
	 * Busca un cliente a partir de su dni.
	 * 
	 * @param dniCliente Dni del cliente a buscar.
	 * @return El cliente o null.
	 */
	private Cliente buscarCliente(String dniCliente) {
		int pos = 0;
		while (pos < clientes.size() && !clientes.get(pos).mismoCliente(dniCliente)) {
			pos++;
		}
		return (pos < clientes.size()) ? clientes.get(pos) : null;
	}

	/**
	 * Busca un producto a partir de su codigo.
	 * 
	 * @param codigoProducto Codigo del producto a buscar.
	 * @return El producto o null.
	 */
	private Producto buscarProducto(String codigoProducto) {
		int pos = 0;
		while (pos < productos.size() && !productos.get(pos).mismoProducto(codigoProducto)) {
			pos++;
		}
		return (pos < productos.size()) ? productos.get(pos) : null;
	}

	/**
	 * Finaliza la compra de un cliente a partir de un dni.
	 * 
	 * @param dni EL dni del cliente cuya compra debe finalizarse.
	 * @return El resultado de la compra.
	 */
	public ResultadoCompra finalizarCompra(String dni) {
		ResultadoCompra resultado = ResultadoCompra.OK;
		Cliente cliente = buscarCliente(dni);
		if (cliente != null) {
			resultado = cliente.finalizarCompra();
		} else {
			resultado = ResultadoCompra.CLIENTE_INEXISTENTE;
		}
		return resultado;
	}

	/**
	 * Obtiene el o los clientes que hayan realizado la compra con mayor importe
	 * entre todas las existentes.
	 * 
	 * @return Una coleccion con los clientes implicados.
	 */
	public ArrayList<MejorCliente> obtenerClientesMayorCompra() {
		ArrayList<MejorCliente> mejoresClientes = new ArrayList<>();
		double mayorImporteCompra = 0;
		for (Cliente cliente : clientes) {
			double mayorCompraCliente = cliente.obtenerMontoMayorCompra();
			if (mayorCompraCliente >= mayorImporteCompra) {
				if (mayorCompraCliente > mayorImporteCompra) {
					mejoresClientes.clear();
					mayorImporteCompra = mayorCompraCliente;
				}
				mejoresClientes.add(new MejorCliente(cliente.getDni(), cliente.getNombreCompleto()));
			}
		}
		return mejoresClientes;
	}

	/**
	 * Agrega un producto a los productos existentes siempre que sea nuevo.
	 * 
	 * @param codigoProducto
	 * @param descripcion
	 * @param precioUnitario
	 * @return True cuando se pudo agregar el producto.
	 */
	public boolean agregarProducto(String codigoProducto, String descripcion, double precioUnitario) {
		// TODO Completar el agregado evitando cargar repetidos.
		
		boolean productoAgregado =  false;
		
			
		if(buscarProducto(codigoProducto) == null) {
			
			productos.add(new Producto(codigoProducto, descripcion, precioUnitario));
			
			productoAgregado = true;
			
		}		
		
		return productoAgregado;
	}

	/**
	 * Agrega un cliente a los clientes existentes siempre que sea nuevo.
	 * 
	 * @param dni
	 * @param nombre
	 * @param apellido
	 * @return True cuando se pudo agregar el cliente.
	 */
	public boolean agregarCliente(String dni, String nombre, String apellido) {
		// TODO Completar el agregado evitando cargar repetidos.
		
		boolean clienteAgregado =  false;
		
		
		if(buscarCliente(dni) == null) {
			
			clientes.add(new Cliente(dni, nombre, apellido));
			
			clienteAgregado = true;
			
		}
		
		return clienteAgregado;
	}
	
	
	public void mostrarMejoresClientes() {
		for (MejorCliente cliente : obtenerClientesMayorCompra()) {
			System.out.println(cliente.getNombreCompleto());
		}
	}
	
}
