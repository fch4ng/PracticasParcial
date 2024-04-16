package zoologico;

import java.util.Scanner;

public class AlimentarLeon {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		
		/*
		 	Un zoológico necesita alimentar y obtener información de un león que se encuentra en rehabilitación luego de una cirugía.
			Por día se alimenta 3 veces a este león y por cada tanda se lo alimenta hasta que este no tenga más ganas de comer.
			Cada vez que se le da comida dentro de una tanda se debe ingresar la cantidad en kg (numero entero) 
			de alimento que se le dio y se le debe preguntar si quiere seguir comiendo('S','N')
			
		 */
		
		
		/*	
		 	• Se desea saber cuál de las 3 comidas fue la que el León comió mas Kg de alimento y cual fue esa cantidad.
			• El total en kg de alimento recibido.
			• Promedio de alimento por tanda
			
		*/
		int cantidadKilogramosAlimento;
					 char sigoComiendo;
		int acumuladorKilogramosComida;
				 int cantidadComidaMax = 0;
				  	int numeroTandaMax = 0;
		   int totalKilogramosAlimento = 0;
	   double promedioAlimentoPorTanda = 0;
				
						 final char NO = 'N';
						 final char SI = 'S';
						final int CERO = 0;
			  final int NUMEROTANDAMAX = 3;
		
		
		
		for(int numeroTanda = 1; numeroTanda < 4; numeroTanda++) {
			
			//Por día se alimenta 3 veces a este león y por cada tanda se lo alimenta hasta que este no tenga más ganas de comer.
			System.out.println("Tanda de comida " + numeroTanda);
				
			acumuladorKilogramosComida = 0;
			
			do {
				
				
				do {
					
					//Cada vez que se le da comida dentro de una tanda se debe ingresar la cantidad en kg (numero entero)
					System.out.println("Ingrese cantidad de kilogramos de alimento");
					cantidadKilogramosAlimento = Integer.parseInt(input.next());
					
				}while(cantidadKilogramosAlimento <= CERO);
				
				acumuladorKilogramosComida = acumuladorKilogramosComida + cantidadKilogramosAlimento;
				
					do {
						
						//se le debe preguntar si quiere seguir comiendo('S','N')
						System.out.println("Deseas seguir comiendo (S-SI N-NO)");
						sigoComiendo = input.next().toUpperCase().charAt(0);
						
					}while(sigoComiendo != NO && sigoComiendo !=SI);
				
					
												
			}while(sigoComiendo != NO);
			
			//Se desea saber cuál de las 3 comidas fue la que el León comió mas Kg de alimento y cual fue esa cantidad.
			if(acumuladorKilogramosComida > cantidadComidaMax) {
				
				cantidadComidaMax = acumuladorKilogramosComida;
				numeroTandaMax = numeroTanda;
			}
		
			//El total en kg de alimento recibido
			totalKilogramosAlimento = totalKilogramosAlimento + acumuladorKilogramosComida;
			
			
			
		}
		
		//Promedio de alimento por tanda
		promedioAlimentoPorTanda = (double)totalKilogramosAlimento / NUMEROTANDAMAX;
		
		System.out.println("La Tanda N° " + numeroTandaMax + " tuveo la cantidad maxima de kilogramos de comida " + cantidadComidaMax);
		System.out.println("Total de alimento recibido " + totalKilogramosAlimento);
		System.out.println("El promedio de alimento por las 3 Tandas fue " + promedioAlimentoPorTanda);
	}

}
