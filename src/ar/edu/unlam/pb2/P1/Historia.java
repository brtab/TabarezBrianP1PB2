package ar.edu.unlam.pb2.P1;
import ar.edu.unlam.pb2.P1.interfaces.*;

public class Historia extends Libro implements Fotocopiable{

	public Historia(String codigo, String nombre, String autor) {
		super(codigo, nombre, autor);
	}

	@Override
	public String fotocopiar() {
		return "Imprimiendo " + toString();
	}

	@Override
	public String toString() {
		return "Libro de Historia";
	}
	
	
	

}
