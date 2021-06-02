package ar.edu.unlam.pb2.P1;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
	
	private List<Libro> libros;
	private List<Estudiante> estudiantes;
	private List<Prestamo> prestamos;
	private final Integer PRESTAMOS_POR_ALUMNO;
	
	public Biblioteca() {
		this.libros = new ArrayList<Libro>();
		this.estudiantes = new ArrayList<Estudiante>();
		this.prestamos = new ArrayList<Prestamo>();
		this.PRESTAMOS_POR_ALUMNO = 2;
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
	
	public Boolean buscarPrestamo(String idPrestamo) {
		for(Prestamo prestamo : prestamos) {
			if(prestamo.getId().equals(idPrestamo)) {
				return true;
			}
		}
		return false;
	}
	
	public Boolean buscarSiElEstudianteTieneElMaximoDePrestamos(Estudiante alumno) {
		Integer contadorDePrestamos = 0;
		for(Prestamo prestamo : prestamos) {
			if(prestamo.estaActivo()&&prestamo.getEstudiante().equals(alumno)) {
				contadorDePrestamos++;
				if(contadorDePrestamos.equals(PRESTAMOS_POR_ALUMNO)) {
					return false;
				}
			}
		}
		return true;
	}
	
	public Boolean buscarSiElLibroEstaDisponible(Libro libro) {
		for(Prestamo prestamo : prestamos) {
			if(prestamo.estaActivo()&&prestamo.getLibro().equals(libro)) {
				return false;
			}
		}
		return true;
	}

	public Boolean agregarPrestamo(String idPrestamo, Estudiante alumno, Libro libro) {
		Prestamo nuevo = new Prestamo(idPrestamo, alumno, libro);
		Boolean sePuedePrestar = Boolean.TRUE;
		sePuedePrestar = !buscarPrestamo(idPrestamo) && buscarSiElLibroEstaDisponible(libro) && buscarSiElEstudianteTieneElMaximoDePrestamos(alumno);	
		if(sePuedePrestar) {
			this.prestamos.add(nuevo);
			libro.prestar();
		}
		return sePuedePrestar;
	}

	public Boolean devolverLibro(Libro actual) {
		
		for(Prestamo prestamo : prestamos) {
			if(prestamo.getLibro().equals(actual)) {
				actual.devuelto();
				prestamo.darDeBaja();
				return true;
			}
		}
		return false;
		
	}

}
