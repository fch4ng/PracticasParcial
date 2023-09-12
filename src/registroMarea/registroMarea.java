package registroMarea;//no corta con el -1 falta agregar un ciclo 

import java.util.Scanner;

public class registroMarea {
	
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		final double FIN = 0;
		int fecha;
		double mareaMinima;
		double mareaMaxima;
		double mareaMaxDisplay;
		double mareaMinDisplay;
		
	int fechaMayorDiferencia = 0;
		int fechaAntecedente = 0;
		     int fechaMinima = 0;
     double diferenciaMareas = 0;
  double diferenciaMareasMax = 0;
		
  
  		System.out.println("Ingrese la fecha en formato AAAAMMDD (ingrese -1 para finalizar carga)");
  		fecha = Integer.parseInt(input.next());
  		
  		fechaAntecedente = fecha;
  		
  		while(FIN < fecha){
													
						
				System.out.println("Ingrese altura de marea minima de la fecha (en metros y con decimales)");
				mareaMinima = Double.parseDouble(input.next());
				
						
				System.out.println("Ingrese altura de marea maxima de la fecha (en metros y con decimales)");
				mareaMaxima = Double.parseDouble(input.next());
				
				if(mareaMinima >= mareaMaxima) {
					
					mareaMaxDisplay = mareaMinima;
					mareaMinDisplay = mareaMaxima;
					
					System.out.println("Los valores de marea maxima y marea minima se han invertido");
					
				}else {
					
					mareaMaxDisplay = mareaMaxima;
					mareaMinDisplay = mareaMinima;
					
				}
				
				diferenciaMareas = mareaMaxDisplay - mareaMinDisplay;
				
				
				if(diferenciaMareas > diferenciaMareasMax) {
					
					fechaMayorDiferencia = fecha;
					diferenciaMareasMax = diferenciaMareas;
					
				}
							
				
				System.out.println("Fecha: " + fecha);
				System.out.println("Marea Minima: " + mareaMinDisplay);
				System.out.println("Marea Maxima: " + mareaMaxDisplay);
				System.out.println("La diferencia entre la marea minima y maxima de la fecha fue " + diferenciaMareas);
				
				do {
					
					System.out.println("Ingrese la fecha en formato AAAAMMDD (ingrese -1 para finalizar carga)");
					fecha = Integer.parseInt(input.next());
					
				}while(fechaAntecedente > fecha);
						
				
		}
		
		
			if(fechaMayorDiferencia == FIN) {
			
				System.out.println("No hay suficientes datos procesados");
			
			}else {
				
				System.out.println("La fecha con mayor diferencia de marea baja y marea alta fue " + fechaMayorDiferencia);
			
			}
		
		
	}

}
