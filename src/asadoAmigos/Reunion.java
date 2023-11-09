package asadoAmigos;

import java.util.ArrayList;

public class Reunion {

	private String motivo;
	private ArrayList<Amigo> amigos;
	private ArrayList<PropuestaReunion> propuestasExistentes;

	public Reunion(String tema) {
		// TODO - Completar constructor
		this.motivo = tema;
		this.amigos = new ArrayList<>();
		this.propuestasExistentes = new ArrayList<>();
	}

	public ResultadoOperacion anotarAmigo(String nombre, String domicilio) {
		Amigo amigo = buscarAmigo(nombre);
		ResultadoOperacion res = ResultadoOperacion.AMIGO_YA_EXISTENTE;
		if (amigo == null) {
			amigos.add(new Amigo(nombre, domicilio));
			res = ResultadoOperacion.OPERACION_OK;
		}
		return res;
	}

	private ResultadoOperacion bajarDePropuesta(Amigo amigo, DiaSemana diaSemana, MomentoDia momento) {
		// TODO - Completar la baja de un amigo de una propuesta.
		/* Si la propuesta quedara sin ningun amigo, eliminarla de la coleccion de
		 * propuestas existentes.
		 */
		ResultadoOperacion res = ResultadoOperacion.PROPUESTA_NO_EXISTENTE;
		
		PropuestaReunion propuestaAmigoBajar = buscarPropuesta(diaSemana, momento);
			
			if(propuestaAmigoBajar != null) {
				
				res = propuestaAmigoBajar.borrarAmigo(amigo); 
				
				if(propuestaAmigoBajar.sinAnotados() && res == ResultadoOperacion.OPERACION_OK) {
					
					this.propuestasExistentes.remove(propuestaAmigoBajar);
				}
			}
		
			
		return res; // <- puesto para que no de error, reemplazar por lo que corresponda
	}

	public ResultadoOperacion bajarDePropuesta(String nombre, DiaSemana diaSemana, MomentoDia momento) {
		ResultadoOperacion res = ResultadoOperacion.AMIGO_NO_EXISTENTE;
		Amigo amigo = buscarAmigo(nombre);
		if (amigo != null) {
			res = bajarDePropuesta(amigo, diaSemana, momento);
		}
		return res;
	}
	
	private Amigo buscarAmigo(String nombre) {
		Amigo amigo = null;
		int pos = 0;
		while (pos < amigos.size() && !amigos.get(pos).mismoNombre(nombre)) {
			pos++;
		}
		if (pos < amigos.size())
			amigo = amigos.get(pos);
		return amigo;
	}

	private PropuestaReunion buscarPropuesta(DiaSemana diaSemana, MomentoDia momento) {
		PropuestaReunion propuesta = null;
		// TODO - Completar busqueda de la propuesta
		int pos = 0;
		while (pos < propuestasExistentes.size() && !propuestasExistentes.get(pos).mismaPropuesta(diaSemana, momento)) {
			pos++;
		}
		if (pos < propuestasExistentes.size())
			propuesta = propuestasExistentes.get(pos);
		
		return propuesta;
	}

	public ResultadoOperacion cambiarDePropuesta(String nombre, DiaSemana diaOriginal, MomentoDia momentoOriginal, DiaSemana diaNuevo, MomentoDia momentoNuevo) {
		ResultadoOperacion res = ResultadoOperacion.AMIGO_NO_EXISTENTE;
		Amigo amigo = buscarAmigo(nombre);
		if (amigo != null) {
			res = unirAPropuesta(diaNuevo, momentoNuevo, amigo);
			if (res.equals(ResultadoOperacion.OPERACION_OK))
				res = bajarDePropuesta(amigo, diaOriginal, momentoOriginal);
		}
		return res;
	}

	public ResultadoOperacion crearPropuesta(String nombre, DiaSemana diaSemana, MomentoDia momento) {
		ResultadoOperacion res = ResultadoOperacion.PROPUESTA_NO_EXISTENTE;
		Amigo amigo = buscarAmigo(nombre);
		if (amigo != null) {
			PropuestaReunion propuesta = buscarPropuesta(diaSemana, momento);
			if (propuesta == null) {
				propuesta = new PropuestaReunion(diaSemana, momento);
				propuestasExistentes.add(propuesta);
			}
			res = propuesta.anotarAmigo(amigo);
		}
		return res;
	}

	public void listar() {
		listarAmigos();
		listarPropuestas();
		// TODO - Desarrollar listarAmigosFaltantes();
		/*
		 * Debe mostrar los nombres de aquellos amigos que no se han adherido a ninguna
		 * de las propuestas existentes (ni propia ni ajena).
		 */
		listarAmigosFaltantes();
		
		System.out.println();
	}

	private void listarAmigos() {
		System.out.println("Amigos registrados para " + motivo);
		for (Amigo amigo : amigos) {
			System.out.println(amigo.getNombre());
		}		
	}

	private void listarPropuestas() {
		System.out.println("Propuestas registradas para " + motivo);
		for (PropuestaReunion propuesta : propuestasExistentes) {
			propuesta.listar();
		}		
	}

	private void listarAmigosFaltantes() {
		ArrayList<Amigo> amigosFaltantes = new ArrayList<>();
		boolean figuraEnPropuesta = false;
		int index = 0;
		PropuestaReunion propuestaBuscada;
		for (Amigo amigo: amigos) {
			figuraEnPropuesta = false;
			while( !figuraEnPropuesta && index < this.propuestasExistentes.size()) {
				propuestaBuscada = this.propuestasExistentes.get(index);
				if (propuestaBuscada.estaAnotado(amigo)) {
					figuraEnPropuesta = true;
				} else {
					index++;
				}
			}
			if(!figuraEnPropuesta) {
				amigosFaltantes.add(amigo);
			}
		}
		
		System.out.println("Amigos sin registrarse en ningun evento");
		for (Amigo amigoSinReunion : amigosFaltantes) {
			System.out.println(amigoSinReunion.getNombre());
		}	
	}
	
	private ResultadoOperacion unirAPropuesta(DiaSemana diaSemana, MomentoDia momento, Amigo amigo) {
		ResultadoOperacion res = ResultadoOperacion.PROPUESTA_NO_EXISTENTE;
		PropuestaReunion fechaReunion = buscarPropuesta(diaSemana, momento);
		if (fechaReunion != null) {
			res = fechaReunion.anotarAmigo(amigo);
		}
		return res;
	}

	public ResultadoOperacion unirAPropuesta(DiaSemana diaSemana, MomentoDia momento, String nombre) {
		// TODO - Completar el agregado de un amigo a una propuesta existente
		Amigo amigo = buscarAmigo(nombre);
		ResultadoOperacion resultado = ResultadoOperacion.AMIGO_NO_EXISTENTE;
		if (amigo != null) {			
			resultado = this.unirAPropuesta(diaSemana, momento, amigo);
		}
		return resultado; // <- puesto para que no de error, reemplazar por lo que corresponda
	}

}