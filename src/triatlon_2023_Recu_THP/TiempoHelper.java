package triatlon_2023_Recu_THP;

public class TiempoHelper {
	public static final int TOPE_SEXAGESIMAL = 60;

	/**
	 * Crea una instancia de la clase Tiempo solo cuando los valores ingresados son
	 * validos.
	 * 
	 * @param horas    El valor que representa a las horas.
	 * @param minutos  El valor que representa a los minutos.
	 * @param segundos El valor que representa a los segundos.
	 * @return Una instancia de Tiempo o null.
	 */
	public static Tiempo crearInstancia(int horas, int minutos, int segundos) {
		return (horas >= 0 && sexagesimalValido(minutos) && sexagesimalValido(segundos))
				? new Tiempo(horas, minutos, segundos)
				: null;
	}

	/**
	 * Indica si el valor pasado como parametro es valido como valor sexagesimal
	 * (entre 0 y 59)
	 * 
	 * @param valor Numero entero que representa minutos o segundos.
	 * @return Un booleano que indica si el valor esta dentro del rango valido.
	 */
	public static boolean sexagesimalValido(int valor) {
		return valor >= 0 && valor < TOPE_SEXAGESIMAL;
	}
}