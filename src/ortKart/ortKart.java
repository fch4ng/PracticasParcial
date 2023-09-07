package ortKart;

import java.util.Scanner;


public class ortKart {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		final int TOTALVUELTAS = 5;
		final char         FIN = 'F';
		final char    KARTROJO = 'R';  
		final char   KARTVERDE = 'V';
		
		            char kartX;
		       int pisaPianito;
		
	   int promedioPianitoVerde = 0;       
		int promedioPianitoRojo = 0;
		    int pisaPianitoRojo = 0;
		   int pisaPianitoVerde = 0;
		 int cantVueltaKartRojo = 0;
		int cantVueltaKartVerde = 0;
		  int acumuladorVueltas = 0;
		 int cantidadVueltasMax = 0;
		  
		  
		do {
		
			do {
			
				System.out.println("Ingrese el color de su karting ('R' , 'V' , 'F'si se debe suspender la carrera) ");
				kartX = input.next().toUpperCase().charAt(0);
			
			} while(kartX != KARTROJO || kartX != KARTVERDE || kartX != FIN);
		
				do {
					
					System.out.println("Cuantas veces piso el 'pianito'?");
					pisaPianito = Integer.parseInt(input.next());
				
				}while(pisaPianito >= 0);
				
				if(kartX == KARTROJO) {
					pisaPianitoRojo = pisaPianitoRojo + pisaPianito;
					cantVueltaKartRojo = cantVueltaKartRojo + 1;
					promedioPianitoRojo = pisaPianitoRojo / cantVueltaKartRojo;
				}else {
					pisaPianitoVerde = pisaPianitoVerde + pisaPianito;
					cantVueltaKartVerde = cantVueltaKartVerde + 1;
					promedioPianitoVerde = pisaPianitoVerde / cantVueltaKartVerde;
				}
	
				acumuladorVueltas++;
				
		}while(TOTALVUELTAS != acumuladorVueltas || kartX != FIN );
		
			if(TOTALVUELTAS < 5) {
				
				System.out.println("Indefinido");
				
			}else if(cantVueltaKartVerde == TOTALVUELTAS){
				
				System.out.println("Kart Verde Ganador ");
			
			}else{
			
				System.out.println("Kart Rojo Ganador");
				
			}
			
			if(TOTALVUELTAS < 5) {
				
				System.out.println("Indefinido");
				
			}else if(promedioPianitoVerde > promedioPianitoRojo){
				
				System.out.println("Kart Verde piso menos veces el pianito ");
			
			}else{
			
				System.out.println("Kart Rojo piso menos veces el pianito ");
				
			}
			
		
	}
}
