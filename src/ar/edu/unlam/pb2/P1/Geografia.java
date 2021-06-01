package ar.edu.unlam.pb2.P1;
import ar.edu.unlam.pb2.P1.interfaces.*;

public class Geografia extends Libro implements Fotocopiable{

	public Geografia(String codigo, String nombre, String autor) {
		super(codigo, nombre, autor);
	}

	@Override
	public String fotocopiar() {
		return "Imprimiendo " + toString();
	}

	@Override
	public String toString() {
		return "Libro de Geografia";
	}
	
	

}
