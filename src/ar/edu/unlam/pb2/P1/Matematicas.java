package ar.edu.unlam.pb2.P1;

import ar.edu.unlam.pb2.P1.enums.TipoDeLibro;

public class Matematicas extends Libro {

	public Matematicas(String codigo, String nombre, String autor) {
		super(codigo, nombre, autor);
		this.tipo = TipoDeLibro.MATEMATICA;
	}
	
	
	
	

}
