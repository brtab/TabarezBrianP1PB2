package ar.edu.unlam.pb2.P1;

public class Prestamo {

	private String id;
	private Estudiante alumno;
	private Libro libro;
	private Boolean activo;

	public Prestamo(String id, Estudiante alumno, Libro libro) {
		this.id = id;
		this.alumno = alumno;
		this.libro = libro;
		this.activo = Boolean.TRUE;
	}
	
	public void darDeBaja() {
		this.activo = Boolean.FALSE;
	}
	
	public Boolean estaActivo() {
		return this.activo;
	}
	
	public Libro getLibro() {
		return this.libro;
	}
	
	public Estudiante getEstudiante() {
		return this.alumno;
	}

	public String getId() {
		return this.id;
	}
}
