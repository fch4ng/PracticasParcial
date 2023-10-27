package parcial1;

import java.util.Scanner;

public class Mesetas {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		final int MINIMO = 0;
		final int MAXIMO = 100;
		final int FIN = 0;
		final String MENSAJE = "Ingrese un numero [" + MINIMO + "-" + MAXIMO + "] o " + FIN + " para terminar: ";

		int nro, nroAnterior = 999;
		int cantMesetas = 0;
		int largoMeseta = 0;
		int mesetaMasLarga = 0;

		do {
			System.out.println(MENSAJE);
			nro = Integer.parseInt(entrada.nextLine());
		} while ((nro < MINIMO || nro > MAXIMO) && nro != FIN);

		while (nro != FIN) {
			if (nro == nroAnterior) {
				largoMeseta++;
			} else if (largoMeseta > 0) {
				if (largoMeseta > mesetaMasLarga)
					mesetaMasLarga = largoMeseta;
				cantMesetas++;
				largoMeseta = 0;
			}
			nroAnterior = nro;
			do {
				System.out.println(MENSAJE);
				nro = Integer.parseInt(entrada.nextLine());
			} while ((nro < MINIMO || nro > MAXIMO) && nro != FIN);
		}
		if (largoMeseta > 0) {
			cantMesetas++;
			if (largoMeseta > mesetaMasLarga)
				mesetaMasLarga = largoMeseta;
		}

		System.out.println("La cantidad de mesetas es " + cantMesetas);
		if (cantMesetas > 0)
			System.out.println("La mayor extension de una meseta fue de " + (mesetaMasLarga + 1) + " numeros");
		entrada.close();
	}

}