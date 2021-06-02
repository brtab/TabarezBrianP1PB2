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
	
	@Test
	public void queSePuedaImprimirUnLibroDeHistoria() {
		String codigo = "0001";
		String nombre = "Nombre ejemplo";
		String autor = "Autor generico";
		Historia actual = new Historia(codigo, nombre, autor);
		assertEquals(actual.fotocopiar(), "Imprimiendo Libro de Historia");
	}
	
	@Test
	public void queSePuedaHacerUnPrestamo() {
		Biblioteca nueva = new Biblioteca();
		String nombreEstudiante = "nombreEstudiante";
		String dni = "11111111";
		String apellido = "apellidoEstudiante";
		Estudiante nuevo = new Estudiante(apellido, nombreEstudiante, dni);
		nueva.agregarEstudiante(nuevo);
		String codigo = "0001";
		String nombreLibro = "Nombre ejemplo";
		String autor = "Autor generico";
		Libro actual = new Libro(codigo, nombreLibro, autor);
		nueva.agregarLibro(actual);
		String idPrestamo = "00001";
		assertTrue(nueva.agregarPrestamo(idPrestamo, nuevo, actual));
		assertTrue(nueva.buscarPrestamo(idPrestamo));
		assertFalse(actual.estaDisponible());
	}
	
	@Test
	public void queSePuedaDevolverUnLibro() {
		Biblioteca nueva = new Biblioteca();
		String nombreEstudiante = "nombreEstudiante";
		String dni = "11111111";
		String apellido = "apellidoEstudiante";
		Estudiante nuevo = new Estudiante(apellido, nombreEstudiante, dni);
		nueva.agregarEstudiante(nuevo);
		String codigo = "0001";
		String nombreLibro = "Nombre ejemplo";
		String autor = "Autor generico";
		Libro actual = new Libro(codigo, nombreLibro, autor);
		nueva.agregarLibro(actual);
		String idPrestamo = "00001";
		nueva.agregarPrestamo(idPrestamo, nuevo, actual);
		assertTrue(nueva.devolverLibro(actual));
		assertTrue(actual.estaDisponible());
		assertTrue(nueva.buscarSiElEstudianteTieneElMaximoDePrestamos(nuevo));
	}
	
}






