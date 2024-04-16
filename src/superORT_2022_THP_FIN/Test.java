package superORT_2022_THP_FIN;

public class Test {

	static SuperOrt miSuper;

	// TODO - Modificar, en las clases que corresponda, la visibilidad de los
	// atributos expuestos innecesariamente.

	public static void main(String[] args) {
		miSuper = new SuperOrt();
		//agregarProducto("LIM0001", "Balde plastico 15 litros", 1190.0);
		//agregarProducto("LIM0002", "Lampazo MOP algodon", 789.0);
		agregarProducto("ALM0001", "Arroz blanco grano largo 1 Kg", 453.5);
		//agregarProducto("ALM0001", "Arroz blanco grano largo 1 Kg", 453.5);
		agregarCliente("98765432", "Perico", "Perez");
		//agregarCliente("20202020", "Dany", "Vazquez");
		agregarAlCarrito("98765432", "ALM0001", 8);
		//agregarAlCarrito("19876542", "ALM0001", 1);
		//agregarAlCarrito("20202020", "LIM0001", 1);
		//agregarAlCarrito("20202020", "LIM0002", 2);
		//agregarAlCarrito("98765432", "LIM0005", 5);
		miSuper.mostrarMejoresClientes();
	}

	
	

	private static void agregarAlCarrito(String dniCliente, String codigoDeProducto, int cantidad) {
		System.out.println("Agregando algo al carrito de compras de un cliente");
		System.out.println("\tdni Cliente:\t" + dniCliente);
		System.out.println("\tcodigo producto:\t" + codigoDeProducto);
		System.out.println("\tcantidad prod.:\t" + cantidad);
		System.out.println("Resultado: " + miSuper.agregarAlCarrito(dniCliente, codigoDeProducto, cantidad));
		System.out.println();
	}

	private static void agregarCliente(String dni, String nombre, String apellido) {
		System.out.println("Agregando Cliente");
		System.out.println("\tdni:\t" + dni);
		System.out.println("\tnombre:\t" + nombre);
		System.out.println("\tapellido:\t" + apellido);
		if (miSuper.agregarCliente(dni, nombre, apellido)) {
			System.out.println("... Agregado OK");
		} else {
			System.out.println("Ups... Hubo un error al agregar el cliente");
		}
		System.out.println();
	}

	private static void agregarProducto(String codigoDeProducto, String descripcion, double precioUnitario) {
		System.out.println("Agregando Producto");
		System.out.println("\tcodigo:\t" + codigoDeProducto);
		System.out.println("\tdescripcion:\t" + descripcion);
		System.out.println("\tprecio unitario:\t" + precioUnitario);
		if (miSuper.agregarProducto(codigoDeProducto, descripcion, precioUnitario)) {
			System.out.println("... Agregado OK");
		} else {
			System.out.println("Ups... Hubo un error al agregar el producto");
		}
		System.out.println();
	}

}
