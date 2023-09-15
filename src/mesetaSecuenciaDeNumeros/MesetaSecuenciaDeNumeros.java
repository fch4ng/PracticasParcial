package mesetaSecuenciaDeNumeros;

import java.util.Scanner;

public class MesetaSecuenciaDeNumeros {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		
                        int numX;
        
              int contadorMeseta = 0;
           int longitudMesetaMax = 0;
        int longitudMesetaActual = 0;
              int mesetaValorMax = 0;
              int numeroAnterior = -1;
              
        System.out.println("Ingrese numeros en el rango (0-100). Ingrese 0 para finalizar.");

        do {
        	
            System.out.print("Ingrese un número: ");
            numX = Integer.parseInt(input.next());

	            if (numX < 0 || numX > 100) {
	            	
	                System.out.println("Numero fuera de rango. Rango correcto (0-100).");
	                continue;
	            }
	            
	
	            if (numX == numeroAnterior) {
	            	
	                 longitudMesetaActual++;
	                 contadorMeseta++;
	                	                
	            } else {
	                
	                if (longitudMesetaActual > longitudMesetaMax) {
	                    
	                	longitudMesetaMax = longitudMesetaActual;
	                       mesetaValorMax = numeroAnterior;
	                    
	                }
	                
	                longitudMesetaActual = 1;
	            }

	            numeroAnterior = numX;
	            

        } while (numX != 0);

	     
	        if (longitudMesetaActual > longitudMesetaMax) {
	        	
	            longitudMesetaMax = longitudMesetaActual;
	            	            
	        }
	        
	      
	        if (contadorMeseta > 0) {
	        	
	            System.out.println("Cantidad de mesetas detectadas: " + contadorMeseta);
	            System.out.println("La meseta más extensa fue " + mesetaValorMax + " con una longitud de " + longitudMesetaMax + " números.");
	       
	        } else {
	        	
	            System.out.println("No se detectaron mesetas.");
	            
	        }
		
		
		
		
		
		

	}

}
