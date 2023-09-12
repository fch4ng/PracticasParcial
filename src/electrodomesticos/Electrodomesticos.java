package electrodomesticos;

import java.util.Scanner;

public class Electrodomesticos {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		char turnoTrabajado;
		int codigoDeVendedor;
		double totalVendidoXVendedorDia;
		
		int contadorSucursal = 0;
		double acumuladorVentasSucursal = 0;
		int contadorVendedorSucursal = 0;
		int acumuladorVendedorsTotalesDeSucursal = 0;
		double acumuldarVentasTotalesXSucursal = 0;
		double promedioVentasTotalesVendedores = 0;
		double acumuladorVentasMananaSucursal = 0;
		double acumuladorVentasTardeSucursal = 0;
		double acumuldarVentasTotalesManana = 0;
		double acumuldarVentasTotalesTarde = 0;
		double promedioVentasManana = 0;
		double promedioVentasTarde = 0;
		
		
		final char FINCARGASUCURSAL = 'F';
		final char MANANA = 'M';
		final char TARDE = 'T';
		final int TOTALSUCURSALES = 15;
		
		
		do {
				do {
				
						System.out.println("Ingrese turno trabajado ´M´: Mañana o ´T´: Tarde o ´F´: para finalizar la carga de esta sucursal ");
						turnoTrabajado = input.next().toUpperCase().charAt(0);
						
						System.out.println("Ingrese codigo de vendedor (entero mayor a 0)");
						codigoDeVendedor = Integer.parseInt(input.next());
						
						System.out.println("Ingrese total vendido por vendedor en el dia");
						totalVendidoXVendedorDia = Double.parseDouble(input.next());
						
							if(turnoTrabajado == MANANA) {
								
								acumuladorVentasMananaSucursal = acumuladorVentasMananaSucursal + totalVendidoXVendedorDia;
								
							}else {
								
								acumuladorVentasTardeSucursal = acumuladorVentasTardeSucursal + totalVendidoXVendedorDia;
							}
						
						acumuladorVentasSucursal = acumuladorVentasSucursal + totalVendidoXVendedorDia;
						
						contadorVendedorSucursal++;
				
				}while(FINCARGASUCURSAL != turnoTrabajado);//no se corto carga
				
				contadorSucursal++;
				
				acumuldarVentasTotalesXSucursal = acumuldarVentasTotalesXSucursal + acumuladorVentasSucursal;
				
				acumuldarVentasTotalesManana = acumuldarVentasTotalesManana + acumuladorVentasMananaSucursal;
				
				acumuldarVentasTotalesTarde = acumuldarVentasTotalesTarde + acumuladorVentasTardeSucursal;
				
				acumuladorVendedorsTotalesDeSucursal = acumuladorVendedorsTotalesDeSucursal + contadorVendedorSucursal;
				
				System.out.println("N°" + contadorSucursal);
				System.out.println("Total recaudado: " + acumuladorVentasSucursal);
				
		}while(contadorSucursal != TOTALSUCURSALES);
		
		promedioVentasTotalesVendedores = acumuldarVentasTotalesXSucursal / acumuladorVendedorsTotalesDeSucursal;
		
		promedioVentasManana = (acumuldarVentasTotalesManana / acumuldarVentasTotalesXSucursal) * 100;
		
		promedioVentasTarde = (acumuldarVentasTotalesTarde / acumuldarVentasTotalesXSucursal) * 100;
		
		System.out.println("Promedio Ventas totales de " + acumuladorVendedorsTotalesDeSucursal + " es " + promedioVentasTotalesVendedores);
		System.out.println("Porcentaje Turno Mañana respecto a Total de ventas " + promedioVentasManana);
		System.out.println("Porcentaje Turno Tarde respecto a Total de ventas " + promedioVentasTarde);
	}

}
