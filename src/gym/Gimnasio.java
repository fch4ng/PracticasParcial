
import java.util.ArrayList;
import java.util.Scanner;

public class Gimnasio {
	private String nombre;
	private ArrayList<Socio> socios;
	static private Scanner input = new Scanner(System.in);
	
	public Gimnasio(String nombre) {
		this.nombre = nombre;
		this.socios = new ArrayList<Socio>();
	}
	
	private Socio buscarSocio(int dni) {
		Socio socioEncontrado = null;
		int i = 0;
		while (i < socios.size() && socioEncontrado == null) {
			Socio socio = socios.get(i);
			if (socio.getDni() == dni) {
				socioEncontrado = socio;
			}
			i++;	
		}
		return socioEncontrado;
	}
	
	public void inscribirSocio(int dni, String nombre, int categoria, double deuda) {
		if (categoria < 1 || categoria > 3) {
			System.out.println("La categoría tiene que estar entre 1 y 3");
		}
		else if (buscarSocio(dni) != null) {
			System.out.println("El socio ya existe");
		}
		else {
			Socio nuevoSocio = new Socio(dni, nombre, categoria, deuda);
			socios.add(nuevoSocio);
			System.out.println("Socio agregado con éxito");
		}
	}
	
	public void quitarSocio(int dni) {
		Socio socio = buscarSocio(dni);
		if (socio == null || socio.getDeuda() > 0) {
			System.out.println("El socio tiene deuda o no existe");
		}
		else {
			socios.remove(socio);
			System.out.println("Socio dado de baja");
		}
	}
	
	static private int pedirCategoria() {
		int categoria;
		System.out.println("Ingrese una categoría de 1 a 3: ");
		categoria = input.nextInt();
		input.nextLine();
		while (categoria < 1 || categoria > 3) {
			System.out.println("Error. Ingrese una categoría de 1 a 3: ");
			categoria = input.nextInt();
			input.nextLine();
		}
		return categoria;
	}
	
	static private double pedirMonto() {
		double monto;
		System.out.println("Ingrese un monto: ");
		monto = input.nextDouble();
		input.nextLine();
		while (monto <= 0) {
			System.out.println("Error, el monto tiene que ser mayor a cero");
			System.out.println("Ingrese un monto: ");
			monto = input.nextDouble();
			input.nextLine();
		}
		return monto;
	}
	
	public void listarDeudoresCategoria() {
		int categoria = pedirCategoria();
		double monto = pedirMonto();
		
		System.out.println("Listado de deudores de categoria " + categoria + " con deuda mayor a " + monto);
		for (Socio socio: this.socios) {
			if (socio.getCategoria() == categoria && socio.getDeuda() >= monto) {
				System.out.println(socio);
			}	
		}
	}
	
	public void ponerMoroso(int dni) {
		Socio socio = buscarSocio(dni);
		if (socio == null || socio.getDeuda() == 0) {
			System.out.println("El socio no tiene deuda o no existe");
		}
		else {
			socio.setEstado('M');
			System.out.println("Socio pasado a moroso");
		}
	}

}



