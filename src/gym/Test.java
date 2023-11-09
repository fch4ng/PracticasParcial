
public class Test {

	public static void main(String[] args) {
		Gimnasio gym = new Gimnasio("On Fit");
		gym.inscribirSocio(15484778, "Juan", 1, 100);
		gym.inscribirSocio(15484778, "Juan", 1, 100);
		gym.inscribirSocio(17484775, "Pablo", 2, 0);
		gym.inscribirSocio(18484776, "Juan", 2, 500);
		gym.inscribirSocio(19484773, "Néstor", 2, 200);
		gym.inscribirSocio(22548771, "Pedro", 1, 100);

		gym.ponerMoroso(19484773);
		gym.ponerMoroso(18484776);
		gym.ponerMoroso(17484775);
		gym.ponerMoroso(111);
		
		gym.quitarSocio(18484776);
		gym.quitarSocio(17484775);
		gym.quitarSocio(111);
		
		gym.listarDeudoresCategoria();

		

	}

}
