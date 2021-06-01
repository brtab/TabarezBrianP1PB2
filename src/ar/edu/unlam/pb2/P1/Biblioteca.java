package ar.edu.unlam.pb2.P1;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
	
	List<Libro> libros;
	List<Estudiante> estudiantes;
	List<Prestamo> prestamos;
	
	public Biblioteca() {
		this.libros = new ArrayList<Libro>();
		this.estudiantes = new ArrayList<Estudiante>();
		this.prestamos = new ArrayList<Prestamo>();
	}

	public List getLibros() {
		return libros;
	}

	public void agregarLibro(Libro libro) {
		this.libros.add(libro);
	}

	public List getEstudiantes() {
		return estudiantes;
	}

	public void agregarEstudiante(Estudiante estudiante) {
		this.estudiantes.add(estudiante);
	}

	public List getPrestamos() {
		return prestamos;
	}

	public void agregarPrestamo(Prestamo prestamo) {
		this.prestamos.add(prestamo);
	}

}
