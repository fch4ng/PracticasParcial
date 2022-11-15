
import java.util.Scanner;

public class casino {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		     final int DINEROMINIMO = 500;
		   final String NOMBREVACIO = "";
		final int DINEROCOSTORULETA = 100;
		   final int DINEROCOSTOBJK = 200;
		   final int DINEROCOSTOPKR = 500;
		         final int TOPE5000 = 5000;
		
		         int contadorRuleta = 0;
		      int contadorBlackJack = 0;
		          int contadorPoker = 0;
		          int acumDineroRul = 0;
		          int acumDineroBjk = 0;
		          int acumDineroPkr = 0;
		         int dineroRestante = 0;
		         int contadorJuegos = 0;
		             int porcRuleta = 0;
		          int porcBlackJack = 0;
		              int porcPoker = 0;
		   boolean dineroRest20Porc = true;
		    boolean dineroParaJugar = true;
		         boolean dinero5000 = true;
		
		    String nombreJugador;
		       int dineroInicial;
		    String juegoElegido;
		          int resultado;
		       
			       do {
			       
			       System.out.println("Ingrese nombre del jugador");
			       nombreJugador = input.nextLine();
			       
			       }while(nombreJugador.equals(NOMBREVACIO));
			       
			       do {
			    	   
			       System.out.println("Ingrese cantidad de dinero inicial (minio $500)");
			       dineroInicial = Integer.parseInt(input.nextLine());
	
			       }while(dineroInicial < DINEROMINIMO);
			       
			       
			       
			       do {
			       
					       do {
					    	   
					       System.out.println("Selecione juego ($100 Ruleta 'RUL', $200 Black Jack 'BJK', $500 Pocker 'PKR')");
					       juegoElegido = input.nextLine();
					       
					       }while(!(juegoElegido.equals("RUL")) || !(juegoElegido.equals("BJK"))  || !(juegoElegido.equals("PKR")) );
					       
						       switch(juegoElegido) {
						       
						       case "RUL":
						    	   
						    	   contadorRuleta++;
						    	   System.out.println("Ingrese resultado (2, 1, 0)");
						    	   resultado = Integer.parseInt(input.nextLine());
						    	   
							    	   switch(resultado) {
							    	   
							    	   case 2:
							    		   acumDineroRul = (dineroInicial + (DINEROCOSTORULETA * 2)- DINEROCOSTORULETA);
							    		   break;
							    	   
							    	   case 1:
							    		   acumDineroRul = dineroInicial + DINEROCOSTORULETA;
							    	   		break;
							    	   		
							    	   case 0:
							    		   acumDineroRul = dineroInicial - DINEROCOSTORULETA;
							    		   break;
							    	   	}
						    	   
						    	   break;
						    	
						       case "BJK":
						    	   
						    	   contadorBlackJack++;
						    	   System.out.println("Ingrese resultado (2, 1, 0)");
						    	   resultado = Integer.parseInt(input.nextLine());
						    	   
							    	   switch(resultado) {
							    	   
							    	   case 2:
							    		   acumDineroBjk = (dineroInicial + (DINEROCOSTOBJK * 2)- DINEROCOSTOBJK);
							    		   break;
							    	   
							    	   case 1:
							    		   acumDineroBjk = dineroInicial + DINEROCOSTOBJK;
							    	   		break;
							    	   		
							    	   case 0:
							    		   acumDineroBjk = dineroInicial - DINEROCOSTOBJK;
							    		   break;
							    	   	}
						    	   
						    	   break;
						    	
						       case "PKR":
						    	   
						    	   contadorPoker++;
						    	   System.out.println("Ingrese resultado (2, 1, 0)");
						    	   resultado = Integer.parseInt(input.nextLine());
						    	   
							    	   switch(resultado) {
							    	   
							    	   case 2:
							    		   acumDineroPkr = (dineroInicial + (DINEROCOSTOPKR * 2)- DINEROCOSTOPKR);
							    		   break;
							    	   
							    	   case 1:
							    		   acumDineroPkr = dineroInicial + DINEROCOSTOPKR;
							    	   		break;
							    	   		
							    	   case 0:
							    		   acumDineroPkr = dineroInicial - DINEROCOSTOPKR;
							    		   break;
							    	   	}
						    	   
						    	   break;
						    	   default:
						       }
						       
						         dineroRestante = acumDineroRul + acumDineroBjk + acumDineroPkr;
						       dineroRest20Porc = dineroRestante < (dineroInicial * 0.2);
						        dineroParaJugar = dineroRestante < DINEROCOSTORULETA;
						             dinero5000 = dineroRestante <= TOPE5000;
						             
						        contadorJuegos = contadorRuleta + contadorBlackJack + contadorPoker;
						            porcRuleta = (contadorRuleta / contadorJuegos) * 100;
						         porcBlackJack = (contadorBlackJack / contadorJuegos) * 100;
						             porcPoker = (contadorPoker / contadorJuegos) * 100;
					
			       }while(!dineroRest20Porc && !dineroParaJugar && !dinero5000);
			       
			       System.out.println("El dinero restante es " + dineroRestante);
			       System.out.println("La cantidad de veces que se jugo a la ruleta " + contadorRuleta + " representa " + porcRuleta + " del total");
			       System.out.println("La cantidad de veces que se jugo al black jack " + contadorBlackJack  + " representa " + porcBlackJack + " del total");
			       System.out.println("La cantidad de veces que se jugo al poker " + contadorPoker  + " representa " + porcPoker + " del total");
				        
	}

}
