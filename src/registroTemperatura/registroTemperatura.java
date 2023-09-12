package registroTemperatura;

import java.util.Scanner;

public class registroTemperatura {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		final int FECHAMINIMAINICIAL = 19010101;
		            final double FIN = 0;
		                     int fecha;
		                  double temperaturaUno;
		                  double temperaturaDos;
		                  double temperaturaMaxDisplay;
		                  double temperaturaMinDisplay;
		
	     int fechaMayorDiferencia = 0;
		     int fechaAntecedente = 0;
   	              int fechaMinima = 0;
    double diferenciaTemperaturas = 0;
  double diferenciaTemperaturaMax = 0;
  
  					
  
  					do {
  						
				    System.out.println("Ingrese la fecha en formato AAAAMMDD (ingrese -1 para finalizar carga)");
					fecha = Integer.parseInt(input.next());
					
					fechaAntecedente = fecha;
					
  					}while(fecha == FECHAMINIMAINICIAL);
					
					while(FIN != fecha){
						
						
						System.out.println("Ingrese primer temperatura de la fecha (en grados centigrados y con decimales)");
						temperaturaUno = Double.parseDouble(input.next());
						
								
						System.out.println("Ingrese segunda temperatura de la fecha (en grados centigrados y con decimales)");
						temperaturaDos = Double.parseDouble(input.next());
						
						if(temperaturaUno >= temperaturaDos) {
							
							temperaturaMaxDisplay = temperaturaUno;
							temperaturaMinDisplay = temperaturaDos;
																				
						}else {
							
							temperaturaMaxDisplay = temperaturaDos;
							temperaturaMinDisplay = temperaturaUno;
							
						}
						
						diferenciaTemperaturas = temperaturaMaxDisplay - temperaturaMinDisplay;
						
						
						if(diferenciaTemperaturas > diferenciaTemperaturaMax) {
							
							fechaMayorDiferencia = fecha;
							diferenciaTemperaturaMax = diferenciaTemperaturas;
							
						}
									
						
						System.out.println("Fecha: " + fecha);
						System.out.println("Temperatura Minima: " + temperaturaMinDisplay);
						System.out.println("Temperatura Maxima: " + temperaturaMaxDisplay);
						System.out.println("La diferencia entre la temperatura minima y maxima de la fecha fue " + diferenciaTemperaturas);
						
						do {
							
							System.out.println("Ingrese la fecha en formato AAAAMMDD (ingrese -1 para finalizar carga)");
							fecha = Integer.parseInt(input.next());
							
						}while(fechaAntecedente > fecha && fecha != FIN);
								
						
				}//no estoy logrando que corte el ciclo para finalizar y muestre la diferencia final
				
				
					if(fechaMayorDiferencia == FIN) {
					
						System.out.println("No hay suficientes datos procesados");
					
					}else {
						
						System.out.println("La fecha con mayor diferencia de marea baja y marea alta fue " + fechaMayorDiferencia);
					
					}
				
				
			}
					

	}


