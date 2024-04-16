package primer_Parcial;

import java.util.Scanner;

public class votacionPodaDeArboles {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		//Nos encargan un programa para procesar 
		//los resultados de una consulta popular a realizarse entre los habitantes de un distrito
		
					char respuesta;
					int edad;
		
		             int contadorSi = 0;
		             int contadorNo = 0;
		         int contadorBlanco = 0;
		     int acumuladorVotantes = 0;
		 int acumuladorEdadVotantes = 0;
		    double porcentajeNoPoda = 0;
		double promedioEdadVotantes = 0;
				int contadorGanador = 0;
				char opcionGanadora;
		
					   final char S = 'S';
					   final char N = 'N';
					   final char B = 'B';
					   final char F = 'F';
			  final int EDAD_MINIMA = 18;
		
		do {
			
				//validar edad del votante
				System.out.println("Ingrese edad");
				
				//solo mayores de 18 años pueden votar
				edad = Integer.parseInt(input.next());
				
		}while(edad < EDAD_MINIMA);
		
		acumuladorEdadVotantes++;
		acumuladorVotantes++;
		
			do {
				
					//La pregunta que deberá responder cada ciudadano es si desea que se poden los árboles
					System.out.println("Desea que se poden los arboles? (\"S\", \"N\", \"B\" (si votan en blanco) o 'F' (para finalizar el proceso))");
					
					//Las respuestas posibles son "S", "N", "B" (si votan en blanco) o 'F' (para finalizar el proceso).
					respuesta = input.next().toUpperCase().charAt(0);
					
					
					//contar votos
					switch(respuesta) {
						case S:
							contadorSi++;
							break;
						case N:
							contadorNo++;
							break;
						case B:
							contadorBlanco++;
							break;
						default:
					}
					
			}while(respuesta !=S && respuesta !=N && respuesta !=B && respuesta !=F);
			
				//Determinar cual fue opcion ganadora
				if(contadorSi > contadorNo && contadorSi > contadorBlanco) {
					
					contadorGanador = contadorSi;
					opcionGanadora = S;
					
				}else if(contadorNo > contadorSi && contadorNo > contadorBlanco) {
					
					contadorGanador = contadorNo;
					opcionGanadora = N;
					
				}else {
					
					contadorGanador = contadorBlanco;
					opcionGanadora = B;
					
				}
			
		
				//Porcentaje de votantes que no desean que los árboles se poden
				
				porcentajeNoPoda = (double)contadorNo / acumuladorVotantes;
				
				//Promedio de edad de los votantes
				
				promedioEdadVotantes = (double)acumuladorEdadVotantes / acumuladorVotantes;
				
		System.out.println("La opcion ganadora es " + opcionGanadora + " con " + contadorGanador + " votos");
		System.out.println("El porcentaje de votantes que no desean que los arboles se poden es" + porcentajeNoPoda);
		System.out.println("El promedio de edad de los votantes es de  " + promedioEdadVotantes);
	}

}
