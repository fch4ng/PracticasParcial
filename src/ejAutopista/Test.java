package ejAutopista;

import java.util.Scanner;

public class Test {

	
	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		      final int AUTOPISTA_MINIMO = 0;
	              final int FIN_DE_CARGA = 0; 
		String autopistaMayorRecaudacion = null;
		      int totalAutopistaMayorRec = 0;
		       int totalGeneralRecaudado = 0;
		    int promedioRecaudacionTotal = 0;
		     int totalRecaudadoAutopista = 0;
		    
		    int numeroAutopista;
		    int cantidadCabinasAutopista;
		    int numeroCabina;
		    int turnoCabina;
		    int totalCabinaRecaudado;
		
		//solicitar numero de autopista al usuario
		do {
			
			System.out.println("Ingrese numero de autopista");
			numeroAutopista = Integer.parseInt(input.next());
			
		}while(numeroAutopista < AUTOPISTA_MINIMO);
		
		
		//solicitar la cantidad de cabinas que posee, 0 finaliza la carga
		do {
			
			System.out.println("Ingrese cantidad de cabinas que tiene la autopista");
			cantidadCabinasAutopista = Integer.parseInt(input.next());
			
				//por cada cabina ingresar numero de cabina, turno, total recaudado
				for(int i = 0; i <= cantidadCabinasAutopista; i++ ) {
					
					System.out.println("Ingrese numero de cabina");
					numeroCabina = Integer.parseInt(input.next());
					
					System.out.println("Ingrese turno '1', '2', o '3'");
					turnoCabina = Integer.parseInt(input.next());
					
					System.out.println("Ingrese total recaudado");
					totalCabinaRecaudado = Integer.parseInt(input.next());
					
					if(totalCabineRecaudado > totalCabinaMax) { //como hago contador para cabina de mayoer recaudacion?
						
						
					}
					
					totalRecaudadoAutopista = totalRecaudadoAutopista + totalCabinaRecaudado;
					
				}
				
				System.out.println("El total recaudado por " + numeroAutopista + " es de " + totalRecaudadoAutopista);
		
		}while(cantidadCabinasAutopista < FIN_DE_CARGA);
		//al finalizar carga mostrar 
		
		totalGeneralRecaudado = totalGeneralRecaudado + totalRecaudadoAutopista;
		
		//total recaudado general
		
		System.out.println("El total general recaudado fue de " + totalGeneralRecaudado);
		
		//numero de autopista con mayor recaudacion y el total de la misma
				
		System.out.println("La autopista con mayor recaudacion fue " + autopistaMayorRecaudacion + " con un total de " + totalAutopistaMayorRec);
		
		//promedio de recaudacion por turno de todas las autopistas
		
		
		System.out.println("El promedio de recaudacion por turno de todas las pistas fue " + promedioRecaudacionTotal);

	}

}
