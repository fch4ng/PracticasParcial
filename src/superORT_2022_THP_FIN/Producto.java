package superORT_2022_THP_FIN;

public class Producto {
	private String codigo;
	private String descripcion;
	private double precio;

	public Producto(String codigo, String descripcion, double precio) {
		this.setCodigo(codigo);
		this.setDescripcion(descripcion);
		this.setPrecio(precio);
	}

	/**
	 * @param codigo El codigo del producto para comparar
	 * @return True si el codigo del producto es igual al recibido.
	 */
	public boolean mismoProducto(String codigo) {
		return this.codigo.equals(codigo);
	}

	/**
	 * @return El codigo del producto.
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo El valor del codigo del producto.
	 */
	private void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return La descripcion del producto.
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion La descripcion del producto.
	 */
	private void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @return El precio del producto.
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * @param precio El valor para el precio del producto.
	 */
	private void setPrecio(double precio) {
		this.precio = precio;
	}
}
