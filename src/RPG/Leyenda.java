package RPG;

import java.util.ArrayList;

import com.ort.entidades.Cliente;

public class Leyenda {
	
	private String titulo;
	private ArrayList <Personaje> personajes = new ArrayList <Personaje>();
	
	public Leyenda(String titulo) {
		this.titulo = titulo;
		this.personajes = null;
	}

	public String getTitulo() {
		return titulo;
	}

	public ArrayList<Personaje> getPersonajes() {
		return personajes;
	}

	private void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	private void setPersonajes(ArrayList<Personaje> personajes) {
		this.personajes = personajes;
	}
	
	public ArrayList<Personaje> obtenerPersonajePorAtributo (String atributo){
		
		ArrayList <Personaje> personajesConAtributosX = new ArrayList <Personaje>();
		
		Personaje personaje = null;
		int pos = 0;

			while (pos < personajes.size() && !personajes.get(pos).mismoPersonaje(atributo)) {
				pos++;
			}
			if (pos < personajes.size()) {
				personaje = personajes.get(pos);
			}
		
		
		personajesConAtributosX.add(personaje);
				
		return personajesConAtributosX;
		
	}

	
	

}
