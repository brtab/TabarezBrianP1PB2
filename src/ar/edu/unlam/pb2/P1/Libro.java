package ar.edu.unlam.pb2.P1;

public class Libro {
	
	private String codigo;
	private String nombre;
	private String autor;
	private Boolean disponible;
	
	public Libro(String codigo, String nombre, String autor) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.autor = autor;
		this.disponible = Boolean.TRUE;
	}
	
	public Boolean estaDisponible() {
		return this.disponible;
	}
	
	public void devuelto() {
		this.disponible = true;
	}
	
	public void prestar() {
		this.disponible = false;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
	

}
