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
		       
		    int pisaPianitoRojo = 0;
		   int pisaPianitoVerde = 0;
		 int cantVueltaKartRojo = 0;
		int cantVueltaKartVerde = 0;
		
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
			;
		}else {
			pisaPianitoVerde = pisaPianitoVerde + pisaPianito;
			cantVueltaKartVerde = cantVueltaKartVerde + 1;
			
		}
	}

}
