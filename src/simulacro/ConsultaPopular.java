package simulacro;
import java.util.Scanner;

public class ConsultaPopular {

	private static final int EDAD_MINIMA = 18;
	private static final char SI = 'S';
	private static final char NO = 'N';
	private static final char BLANCO = 'B';
	private static final char FIN = 'F';
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		int edad = 0;
		char voto = ' ';
		int acumuladorSi = 0;
		int acumuladorNo = 0;
		int acumuladorEnBlanco = 0;
		char ganador = ' ';
		int contadorVotantes = 0;
		int acumuladorEdad = 0;
		int porcentajeNoPoda = 0;
		int promedioEdadVotantes = 0;

		do {

			do {
				System.out.println("Ingrese edad");

				edad = Integer.parseInt(input.next());

			} while (edad <= EDAD_MINIMA);

			contadorVotantes++;

			acumuladorEdad = acumuladorEdad + edad;

			System.out.println("Desea se poden los arboles? ('S'-Si | 'N' - NO | 'B'-Blanco | 'F'-Finalizar)");

			voto = input.next().toUpperCase().charAt(0);

			if (voto == SI) {

				acumuladorSi++;

			} else if (voto == NO) {

				acumuladorNo++;

			} else {

				acumuladorEnBlanco++;

			}

			if (acumuladorSi > acumuladorNo && acumuladorSi > acumuladorEnBlanco) {

				ganador = SI;

			} else if (acumuladorNo > acumuladorSi && acumuladorEnBlanco > acumuladorSi) {

				ganador = NO;

			} else {

				ganador = BLANCO;

			}

		} while (voto != SI && voto != NO && voto != BLANCO || voto == FIN);

		porcentajeNoPoda = acumuladorNo / contadorVotantes;

		promedioEdadVotantes = acumuladorEdad / contadorVotantes;

		System.out.println("La opcion ganadora es " + ganador);

		System.out
				.println("El porcentaje de votantes que no desean los arboles se poden es " + (porcentajeNoPoda * 100));

		System.out.println("El promedio de edad de los votantes es " + promedioEdadVotantes);
	}

}
