package ar.edu.unlam.pb2.P1;

import static org.junit.Assert.*;

import org.junit.Test;

public class BibliotecaTest {

	
	@Test
	public void queSePuedaCrearUnLibro() {
		String codigo = "0001";
		String nombre = "Nombre ejemplo";
		String autor = "Autor generico";
		Libro actual = new Libro(codigo, nombre, autor);
		assertNotNull(actual);
	}
	
	@Test
	public void queSePuedaCrearUnEstudiante() {
		String nombre = "nombreEstudiante";
		String dni = "11111111";
		String apellido = "apellidoEstudiante";
		Estudiante nuevo = new Estudiante(apellido, nombre, dni);
		assertNotNull(nuevo);
	}
}
