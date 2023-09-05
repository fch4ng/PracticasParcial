package PruebaDeAtletismo;

import java.util.Scanner;

public class PruebaDeAtletismo {

	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		/*Un entrenador le ha propuesto a un atleta recorrer una ruta de cinco kilómetros durante 10 días
		para determinar si es apto para la prueba de 5 kilómetros que se desarrollará en el Parque
		Centenario. No se sabe si está apto y para eso nos piden que hagamos el siguiente sistema.*/
		
		int tiempoDePrueba;
		
		   int diaMenorTiempo = 0;
		double promedioTiempo = 0;
		 int acumuladorTiempo = 0;
		      int contadorDia = 0;
		      boolean menor20 = false;
		   boolean tiempoMenor15 = false;
		boolean promedioTiempo18 = false;
		          boolean esApto = false;
		
		
		final int TIEMPO15 = 15;
		final int TIEMPO18 = 18;
		final int TIEMPO20 = 20;
		final int TIEMPOMIN = 0;
		final int TIEMPOMAX = 100;
		final int DIASMAX = 10;
		
		int menorTiempo = TIEMPOMAX;
		
		/*Nos ingresan por cada día de entrenamiento (se debe validar el dato):
		- Tiempo de la prueba en minutos (entero mayor que 0 y menor a 100)*/
		do {
			do {
		
				System.out.println("Ingrese tiempo de ejecucion de prueba");
				tiempoDePrueba = Integer.parseInt(input.next());
		
			}while(tiempoDePrueba > TIEMPOMAX || tiempoDePrueba < TIEMPOMIN);
			
			contadorDia++;
			acumuladorTiempo = acumuladorTiempo + tiempoDePrueba;
		
			if(tiempoDePrueba < menorTiempo) {
				
				diaMenorTiempo = contadorDia;
				   menorTiempo = tiempoDePrueba;
			}
		/*Para considerarlo apto debe cumplir las siguientes condiciones:
		- Que en ninguna de las pruebas haga un tiempo mayor a 20 minutos. (Esto es
			determinante.)
		- Que al menos en una de las pruebas realice un tiempo menor de 15 minutos.
		- Que su promedio sea menor o igual a 18 minutos.*/
		
			           menor20 = tiempoDePrueba < TIEMPO20;
			      
			      tiempoMenor15 = tiempoDePrueba < TIEMPO15;
		
		}while(contadorDia < DIASMAX && menor20);
		
		/*- Diseñar un algoritmo para registrar los datos y decidir si es apto para la competencia.
			- Sólo en caso de estar apto, informar el promedio y el número de día en el que realizó el
	 		  menor tiempo.*/
		
		promedioTiempo = (double) acumuladorTiempo / contadorDia;
		
		promedioTiempo18 = promedioTiempo <= TIEMPO18;
		
		esApto = tiempoMenor15 && promedioTiempo18 && menor20;
		
		if(esApto) {
		
			System.out.println("Es apto");
			System.out.println("Promedio: " + promedioTiempo);
			System.out.println("Dia de menor tiempo: " + diaMenorTiempo);
		
		}else {
		
			System.out.println("No es apto");
		}
			
		input.close();
		
	}

}
