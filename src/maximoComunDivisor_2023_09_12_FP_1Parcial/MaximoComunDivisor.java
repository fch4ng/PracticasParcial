package maximoComunDivisor_2023_09_12_FP_1Parcial;

import java.util.Scanner;

public class MaximoComunDivisor {

	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		int numeroUno;
		int numeroDos;
		int mcd = 1;
				
		System.out.println("Ingrese primer numero entero (mayor que 0)");
		numeroUno = Integer.parseInt(input.next());
		
		
		System.out.println("Ingrese segundo numero entero (mayor que 0)");
		numeroDos = Integer.parseInt(input.next());
		
		 
        int min = (numeroUno < numeroDos) ? numeroUno : numeroDos;

        for (int i = 1; i <= min; i++) {
            if (numeroUno % i == 0 && numeroDos % i == 0) {
                mcd = i; 
            }
        }

        System.out.println("El maximo comun divisor de " + numeroUno + " y " + numeroDos + " es " + mcd);

        input.close();
	}

}
