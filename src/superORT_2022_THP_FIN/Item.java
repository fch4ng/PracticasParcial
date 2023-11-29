package superORT_2022_THP_FIN;

public class Item {

	private int cantidad;
	private Producto producto;

	/**
	 * @param producto El producto del item
	 * @param cantidad La cantidad dl producto
	 */
	public Item(Producto producto, int cantidad) {
		this.setProducto(producto);
		this.setCantidad(cantidad);
	}

	/**
	 * @return La cantidad
	 */
	public int getCantidad() {
		return cantidad;
	}

	/**
	 * @return El producto
	 */
	public Producto getProducto() {
		return producto;
	}

	/**
	 * @param producto El producto contra el que hay que comparar para ver si es el mismo.
	 * @return True si se trata del mismo producto.
	 */
	public boolean mismoProducto(Producto producto) {
		return this.producto == producto;
	}

	/**
	 * @param cantidad El valor de la cantidad
	 */
	void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	/**
	 * @param producto el valor del producto
	 */
	private void setProducto(Producto producto) {
		this.producto = producto;
	}

	/**
	 * @return El valor del item (precio del producto * cantidad).
	 */
	public double obtenerCosto() {
		return this.producto.getPrecio() * cantidad;
	}

}
