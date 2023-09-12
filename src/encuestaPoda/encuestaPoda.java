package encuestaPoda;
import java.util.Scanner;

public class encuestaPoda {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		final int EDADMINIMA = 18;
		
		   int acumuladorEdad = 0;
		     int contadorEdad = 0;
		   boolean votoValido = true;
		     int acumuladorSi = 0;
		     int acumuladorNo = 0;
	   int acumuladorEnBlanco = 0;
		  int acumuladorTotal = 0;
	   int contadorDeVotantes = 0;
		  
		int votantesNoQuierenPoda;
		int promedioEdadVotantes;
		int edadIngresada;
		char votoIngresado;
		String opcionGanadora = "";
		
				
		do {
			
			System.out.println("Desea que se poden los arboles? (Opciones 'S' Si, 'N' No, 'B' Voto en Blanco, 'F' Fin de la encuesta)");
			votoIngresado = input.nextLine().charAt(0);
			
			votoValido = (votoIngresado == 'S' || votoIngresado == 'N' || votoIngresado == 'B' || votoIngresado == 'F');
						
		}while(!votoValido);
				
		
		while(votoIngresado != 'F') { 
			
			do{
					
					System.out.println("Ingrese su edad");
					edadIngresada = Integer.parseInt(input.nextLine());
					
				}while(edadIngresada < EDADMINIMA);
				
				acumuladorEdad =+ edadIngresada;
				System.out.println("acumuladorEdad " +acumuladorEdad);
				contadorDeVotantes++;
				System.out.println("contadorDeVotantes " +contadorDeVotantes);
				
					switch(votoIngresado) {
			 	   
				 	   case 'S':
				 		   acumuladorSi++;
				 		   break;
				 	   
				 	   case 'N':
				 		   acumuladorNo++;
				 	   		break;
				 	   		
				 	   case 'B':
				 		   acumuladorEnBlanco++;
				 		   break;
			 		  }
			   
				
				
			do {
					
					System.out.println("Desea que se poden los arboles? (Opciones 'S' Si, 'N' No, 'B' Voto en Blanco, 'F' Fin de la encuesta)");
					votoIngresado = input.nextLine().charAt(0);
					
					votoValido = (votoIngresado == 'S' || votoIngresado == 'N' || votoIngresado == 'B' || votoIngresado == 'F');
								
				}while(!votoValido);
		}
				
		acumuladorTotal = acumuladorSi + acumuladorNo + acumuladorEnBlanco;
		
		if(acumuladorSi > acumuladorNo && acumuladorSi > acumuladorEnBlanco) {
			
			opcionGanadora = "Si";
			
		}else if(acumuladorNo > acumuladorSi && acumuladorNo > acumuladorEnBlanco) {
			
			opcionGanadora = "No";
		}else {
			
			opcionGanadora = "Indeterminada";
		}
		
		votantesNoQuierenPoda = (acumuladorNo / contadorDeVotantes) * 100;
		promedioEdadVotantes = (acumuladorEdad / contadorDeVotantes) * 100;
		
		System.out.println("La opcion ganadora es " + opcionGanadora);
		System.out.println("Porcentaje de votantes que no desean que los arboles se poden " + votantesNoQuierenPoda);
		System.out.println("Promedio de edad de los votantes " + promedioEdadVotantes);
		}
	}
