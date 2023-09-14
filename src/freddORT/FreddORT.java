package freddORT; // faltan correcciones a algunos loops cuando se carga 'Z' no esta cortando el loop

import java.util.Scanner;

public class FreddORT {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		char tamanioPedido;
		int cantidadDeGustos;
		double importeCobrado;
		double cantidadDeCalorias;
		String nombreCliente;
		String nombreGusto;
				
		
		    double importeCobradoMasComision = 0;
		double acumImporteCobradoMasComision = 0;
		       double promedioImporteCompras = 0;
		             int pedidoMenosCalorias = 0;
		                double pedidoMasCaro = Double.MIN_VALUE;
		           double gustoMenosCalorias = Double.MAX_VALUE;
		           int cantidadGustosElegido = 1;
		                  int contadorGustos = 0;
		               int acumuladorPedidos = 0;
				               int acumChico = 0;
				             int acumMediano = 0;
				              int acumGrande = 0;
				        int porcPedidosTipoC = 0;
		                  boolean FINPEDIDOS = false;
		         String nombreClienteMasCaro = "";
		     String nombreGustoMenosCalorias = "";
		
					final double CINCUENTA = 50;
					      final char CHICO = 'C';
					    final char MEDIANO = 'M';
					     final char GRANDE = 'G';
					  final char FINPEDIDO = 'F';
					   final int GUSTOSMIN = 0;
					   final int GUSTOSMAX = 4;
		
			do {
					do {
					
						System.out.println("Selecciones tamaño del pedido 'C' (Chico), 'M' (Mediano). 'G' (Grande), 'Z' (Finalizar) ");
						tamanioPedido = input.next().toUpperCase().charAt(0);
					
					}while(tamanioPedido != CHICO && tamanioPedido != MEDIANO && tamanioPedido != GRANDE && tamanioPedido != FINPEDIDO);
				
					
					
						switch(tamanioPedido) {
							case CHICO:
								acumChico++;
								break;
							case MEDIANO:
								acumMediano++;
								break;
							case GRANDE:
								acumGrande++;
								break;
							default:
						
						}
						
						acumuladorPedidos++;
						
						FINPEDIDOS = (acumuladorPedidos == 20 || tamanioPedido == FINPEDIDO);
					
						do {
				
							System.out.println("Ingrese cantidad de gusto (maximo 4)");
							cantidadDeGustos = Integer.parseInt(input.next());
							input.nextLine();
							
						}while(cantidadDeGustos > GUSTOSMAX || cantidadDeGustos <= GUSTOSMIN);
				
						cantidadGustosElegido = cantidadDeGustos;
							
							do {
							
								System.out.println("Ingrese nombre del gusto");
								nombreGusto = input.nextLine();
						
								System.out.println("Ingrese cantidad de calorias");
								cantidadDeCalorias = Double.parseDouble(input.next());
								input.nextLine();
								
								contadorGustos++;
							
							}while(contadorGustos <= cantidadDeGustos);
						
						
						do {
				
							System.out.println("Ingrese importe a cobrar");
							importeCobrado = Double.parseDouble(input.next());
							input.nextLine();
							
						}while(importeCobrado < 0);
				
						importeCobradoMasComision = importeCobrado + CINCUENTA;
						
						acumImporteCobradoMasComision = acumImporteCobradoMasComision + importeCobradoMasComision;
				
						do {
						
							System.out.println("Ingrese nombre del cliente");
							nombreCliente = input.nextLine();
							
						}while(nombreCliente == null);
						
							if(importeCobradoMasComision > pedidoMasCaro) {
								
								pedidoMasCaro = importeCobradoMasComision;
								nombreClienteMasCaro = nombreCliente;
								
							}else {
								
							}
							
							
							if(gustoMenosCalorias < cantidadDeCalorias) {
								
								gustoMenosCalorias = cantidadDeCalorias;
								pedidoMenosCalorias = acumuladorPedidos;
								nombreGustoMenosCalorias = nombreGusto;
								
								System.out.println("Gusto con menos calorias: " + nombreGustoMenosCalorias);
								System.out.println("Correspondiente a pedido: " + pedidoMenosCalorias);
								
							}
													
			}while(!FINPEDIDOS);
				
			promedioImporteCompras = acumImporteCobradoMasComision / acumuladorPedidos;
			
			porcPedidosTipoC = (acumChico / acumuladorPedidos)*100;
		
		System.out.println("Cantidad de Pedidos por Tamaño");
		System.out.println("Chico: " + acumChico);
		System.out.println("Mediano: " + acumMediano);
		System.out.println("Grande: " + acumGrande);
		System.out.println("Promedio total importe de compras: " + promedioImporteCompras);
		System.out.println("Pedido mas caro: " + pedidoMasCaro + " Cliente: " + nombreClienteMasCaro);
		System.out.println("Porcentaje de pedidos de tipo ‘C’: " + porcPedidosTipoC);
		
	}

}
