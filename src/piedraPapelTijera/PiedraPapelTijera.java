package piedraPapelTijera;//trabado en loop piendo seleccion de Ana

import java.util.Scanner;

public class PiedraPapelTijera {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		
		   int puntajeDeLaRonda;
		String seleccionAna;
		String seleccionBartolo;
		String ganadorRonda = "";
		String ganadorJuego;
		
	     int puntosBartolo = 0;
		     int puntosAna = 0;
   int puntajeFinalDeRonda = 0;
		
		     final int CERO = 0;
		final String PIEDRA = "PIEDRA";
		 final String PAPEL = "PAPEL";
		final String TIJERA = "TIJERA";
		   final String ANA = "ANA";
	   final String BARTOLO = "BARTOLO";
		
		
		/*Al comenzar el juego el programa deberá solicitar a cuántos puntos se jugará. Este debe ser un número
		mayor a cero y el participante que primero alcance dicho puntaje será el vencedor.*/
		
		do {
		
			System.out.println("Ingrese puntaje de la ronda (numero mayor a 0)");
			puntajeDeLaRonda = Integer.parseInt(input.next());
		
		}while(puntajeDeLaRonda < CERO);
		
			do {
		
				do {
					
				System.out.println("Ana ingresa seleccion (Piedra, Papel, Tijera)");
				seleccionAna = input.nextLine().toUpperCase();
				
				}while(!seleccionAna.equals(PIEDRA) || !seleccionAna.equals(PAPEL) || !seleccionAna.equals(TIJERA));
				
				do {
					
					System.out.println("Bartolo ingresa seleccion (Piedra, Papel, Tijera)");
					seleccionBartolo = input.nextLine();
					
				}while(!seleccionAna.equals(PIEDRA) || !seleccionAna.equals(PAPEL) || !seleccionAna.equals(TIJERA));
				
						/*El ganador de cada ronda sumará un punto, el cual se
						determina de acuerdo a las siguientes reglas:
						Piedra vence a Tijera (Es posible desafilar una tijera
						con una piedra común y corriente. Otra buena
						estrategia es romper la tijera a piedrazos).
						Tijera vence a Papel (Es muy fácil cortar papeles con
						una tijera).
						Papel vence a Piedra (Porque la envuelve. Bueno...
						a alguien le tenía que ganar, pobre Papel).
						Si ambos jugadores eligen la misma opción, la ronda
						resulta en empate y ninguno sumará punto.*/
				
					if (seleccionAna.equals(seleccionBartolo)) {
			            
						//System.out.println("Empate");
			            	            
			        } else if (
			        		
			            (seleccionAna.equals(PIEDRA) && seleccionBartolo.equals(TIJERA)) ||
			            (seleccionAna.equals(PAPEL) && seleccionBartolo.equals(PIEDRA)) ||
			            (seleccionAna.equals(TIJERA) && seleccionBartolo.equals(PAPEL))	          )  
			         {
			        	
			            //System.out.println("Player 1 wins!");
			        	 ganadorRonda = ANA;
				            
				         puntosAna++;
			            
			        } else {
			        	
			        	//System.out.println("Player 2 wins!");
			        	ganadorRonda = BARTOLO;
			            
				         puntosBartolo++;
			            
			        }
					
					puntajeFinalDeRonda = puntosBartolo + puntosAna;
				
				System.out.println("Ganador de la ronda " + ganadorRonda);
				
			}while(puntajeFinalDeRonda != puntajeDeLaRonda);
		
		if(puntosAna > puntosBartolo) {
			
			ganadorJuego = ANA;
		}else {
			
			ganadorJuego = BARTOLO;
		}
		
		System.out.println("Ganador del juego " + ganadorJuego);
		
		
		
		
		
		
	}

}
