package superORT_2022_THP_FIN;

import java.util.ArrayList;

public class Carrito {
	private boolean finalizado;
	private ArrayList<Item> items;

	/**
	 * Construye el carrito, que inicialmente esta sin items y no finalizado.
	 */
	public Carrito() {
		finalizado = false;
		items = new ArrayList<>();
	}

	/**
	 * Agrega un nuevo item al carrito. Como se evita que en el carrito aparezcan
	 * dos o mas items con el mismo producto, si el producto ya existia en un item
	 * del carrito, la cantidad se reemplaza.
	 * 
	 * @param producto El producto a agregar en un item.
	 * @param cantidad la cantidad a asignar de ese producto.
	 */
	public void agregarItem(Producto producto, int cantidad) {
		if (!finalizado) {
			Item item = buscarItem(producto);
			if (item == null) {
				items.add(new Item(producto, cantidad));
			} else {
				item.setCantidad(cantidad);
			}
		}
	}
	
	/**
	 * @param producto El producto a encontrar en los items del carrito.
	 * @return El item del producto, o null.
	 */
	private Item buscarItem(Producto producto) {
		int pos = 0;
		while (pos < items.size() && !items.get(pos).mismoProducto(producto)) {
			pos++;
		}
		return (pos < items.size()) ? items.get(pos) : null;
	}

	/**
	 * @return True cuando el carrito esta finalizado (cerrado).
	 */
	public boolean estaFinalizado() {
		return finalizado;
	}

	/**
	 * Finaliza la compra poniendo finalizado en true.
	 */
	public void finalizarCompra() {
		finalizado = true;
	}

	/**
	 * @return El importe total de lo que se cargo en el carrito.
	 */
	public double obtenerCostoTotal() {
		double total = 0;
		for (Item item : items) {
			total += item.obtenerCosto();
		}
		return total;
	}

}
