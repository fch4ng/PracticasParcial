package biblioteca_2_recu_THP_2023_11_23;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Fecha {
	
	public static String getFechaHoy() {
        // Obtengo la fecha de hoy
        LocalDate fechaHoy = LocalDate.now();

        // Creo un formateador de fecha
        DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Formateo la fecha como una cadena
        String fechaHoyCadena = fechaHoy.format(formateador);
        
        return fechaHoyCadena;
    }
}
