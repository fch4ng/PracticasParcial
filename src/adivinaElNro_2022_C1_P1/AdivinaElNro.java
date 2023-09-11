package adivinaElNro_2022_C1_P1;//revisar porque no hace break para pedir ambos nombres por separado

import java.util.Scanner;
import java.util.Random;

public class AdivinaElNro {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		int opcionJugadorUno;
		int opcionJugadorDos;
		int numeroIngresado;
		int cantidadDeRondas;
		int cantidadRondasPrimerLugar = 0;
		int cantidadRondasSegundoLugar = 0;
		
		int contadorDeRondas = 1;
		int contadorGanadorJugadorUno = 0;
		int contadorGanadorJugadorDos = 0;
		int diffJugadorUno = 0;
		int diffJugadorDos = 0;
		String jugadorUno = "";
		String jugadorDos = "";
		String ganadorDeRonda = "";
		
		String nombreJugador;
		String jugadorPrimerLugar = "";
		String jugadorSegundoLugar = "";
		
		final int CERO = 0;
		final int UNO = 1;
		
		Random random = new Random();
		
		
		
		do {
			
			System.out.println("Ingrese la cantidad de rondas");
			cantidadDeRondas = Integer.parseInt(input.next());
			
		}while(cantidadDeRondas < CERO);
		
			for(int x = 1; x < 3; x++){
				
				System.out.println("Ingrese el nombre del jugador " + x);//no corta para pedir nombres de jugadores por separado
				nombreJugador = input.nextLine();
				
					if(x == UNO) {
						
						jugadorUno = nombreJugador;
						
					}else {
						
						jugadorDos = nombreJugador;
						
					}
				
				}
		
		do {
			
			System.out.println(jugadorUno + "ingrese un numero");
			opcionJugadorUno = Integer.parseInt(input.next());
			
			System.out.println(jugadorDos + "ingrese un numero");
			opcionJugadorDos = Integer.parseInt(input.next());
			
			System.out.println("Opcion de " + jugadorUno + " es " + opcionJugadorUno);
			
			System.out.println("Opcion de " + jugadorDos + " es " + opcionJugadorDos);
			
			int randomNumber = random.nextInt(10) + 1;
			
			diffJugadorUno = randomNumber - opcionJugadorUno;
			diffJugadorDos = randomNumber - opcionJugadorDos;
			
					if(diffJugadorUno == diffJugadorDos) {
						
						System.out.println("Empate");
						
					}else if(diffJugadorUno > diffJugadorDos) {
						
						ganadorDeRonda = jugadorDos; 
						contadorGanadorJugadorDos++;
						
						System.out.println("Ganador de ronda " + contadorDeRondas + " es " + ganadorDeRonda);
					
					}else {
						
						ganadorDeRonda = jugadorUno;
						contadorGanadorJugadorUno++;
						
						System.out.println("Ganador de ronda " + contadorDeRondas + " es " + ganadorDeRonda);
					}
					
					contadorDeRondas++;
			
		}while(contadorDeRondas <= cantidadDeRondas);
			
		if(contadorGanadorJugadorUno > contadorGanadorJugadorDos) {
			
			jugadorPrimerLugar = jugadorUno;
			cantidadRondasPrimerLugar = contadorGanadorJugadorUno;
			
		}else {
			
			jugadorSegundoLugar = jugadorDos;
			cantidadRondasSegundoLugar = contadorGanadorJugadorDos;
		}
		
		
		System.out.println(jugadorPrimerLugar + " gano un total de " + cantidadRondasPrimerLugar);
		System.out.println(jugadorSegundoLugar + " gano un total de " + cantidadRondasSegundoLugar);
		System.out.println(jugadorPrimerLugar + " gano el juego");
	}

}
