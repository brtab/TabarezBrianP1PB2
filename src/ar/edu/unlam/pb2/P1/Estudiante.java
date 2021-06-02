package ar.edu.unlam.pb2.P1;

public class Estudiante {

	private String dni;
	private String apellido;
	private String nombre;
	
	public Estudiante(String apellido, String nombre, String dni) {
		this.apellido = apellido;
		this.nombre = nombre;
		this.dni = dni;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estudiante other = (Estudiante) obj;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		return true;
	}
	
	
}
