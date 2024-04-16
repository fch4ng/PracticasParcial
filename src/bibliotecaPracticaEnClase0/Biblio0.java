package bibliotecaPracticaEnClase0;

import java.util.Scanner;

public class Biblio0 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		//La biblioteca de la ciudad necesita organizar y tener 
		//un recuento de los libros que tiene en sus 5 estantes
		
						   String nombreLibro;
							 char generoLibro;
						int cantidadDePaginas;
			   	 int libroMayorCantidadPaginas = 0;   
		String nombreLibroMayorCantidadPaginas = "";
						  int contadorInfantil = 0;
						  	int contadorNovela = 0;
						  int contadorHistoria = 0;
						int promedioPorEstante = 0;
		
							  final String FIN = "FIN";
							  	final int CERO = 0;
							  	  final char I = 'I';
							  	  final char N = 'N';
							  	  final char H = 'H';
		
		//Por cada uno de los 5 estantes, se ingresan libros:
		//Por cada uno de esos libros ingresar:
		
		 for(int estante = 1; estante < 6; estante++) {  
			 	
			 	do {
			 				 	
						//Nombre del libro (‘FIN’ = No hay más libros para ese estante)
						System.out.println("Ingrese nombre del libro (FIN para finalizar carga de estante)");
						nombreLibro = input.nextLine();
						input.nextLine();
						
								 	
			 			do {
						
							//Género (‘I’ → Infantil, ‘N’ → Novela, ‘H’ → Historia)
							System.out.println("Ingrese genero del libro (I → Infantil, N → Novela, H → Historia)");
							generoLibro = input.next().toUpperCase().charAt(0);
							
						
			 			}while(generoLibro !=I && generoLibro !=N && generoLibro !=H);
			 			
					 			switch(generoLibro) {
					 				case I:
					 					contadorInfantil++;
					 					break;
					 				case N:
					 					contadorNovela++;
					 					break;
					 				case H:
					 					contadorHistoria++;
					 					break;
					 				default:
					 			}
						
			 				do {
			 					
					 			//Cantidad de páginas que tiene el libro (mayor a 0)
								System.out.println("Ingrese cantidad de paginas que tiene el libro");
								cantidadDePaginas = Integer.parseInt(input.next());
								
							
			 				}while(cantidadDePaginas <= CERO);
			 				
				 				if(libroMayorCantidadPaginas < cantidadDePaginas) {
				 					
				 					libroMayorCantidadPaginas = cantidadDePaginas;
				 					nombreLibroMayorCantidadPaginas = nombreLibro;
				 					
				 				}
			 	
			 		}while(!nombreLibro.equals(FIN));
			 	
			 	estante++;
			 	
				//Una vez finalizado el ingreso de datos de 1 estante, 
				//se debe mostrar por pantalla el nombre del libro que más páginas tiene, con su cantidad correspondiente.
				System.out.println("El libro con mayor cantidad de paginas del " + estante + " es " + nombreLibroMayorCantidadPaginas);
		 
		 }
		 
		 promedioPorEstante = (contadorInfantil + contadorNovela + contadorHistoria)/5;
		
		//Al finalizar el ingreso de datos de todos los estantes, mostrar:
		//Cantidad de libros por género
		System.out.println("Cantidad de Libros por Genero");
		System.out.println("Infantil " + contadorInfantil);
		System.out.println("Novela " + contadorNovela);
		System.out.println("Historia " + contadorHistoria);
		
		//Promedio de libros por estante
		System.out.println("Promedio por estante " + promedioPorEstante);
	}

}
