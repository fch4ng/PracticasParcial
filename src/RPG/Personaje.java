package RPG;

import java.util.ArrayList;

public class Personaje {
	
	private String nombre;
	private ArrayList <AtributoDivino> atributos_divinos = new ArrayList <AtributoDivino>();
	
	public Personaje(String nombre) {
		this.nombre = nombre;
		this.atributos_divinos = null;
	}

	public String getNombre() {
		return nombre;
	}

	public ArrayList<AtributoDivino> getAtributos_divinos() {
		return atributos_divinos;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private void setAtributos_divinos(ArrayList<AtributoDivino> atributos_divinos) {
		this.atributos_divinos = atributos_divinos;
	}
	
	public boolean mismoPersonaje(String atributo) {
		return this.atributos_divinos.equals(atributo);
	}


}


