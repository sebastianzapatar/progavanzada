package progavanzada.model;

public class Estudiante {
	private String nombre;
	private String apellido;
	private String direccion;
	private long cedula;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public long getCedula() {
		return cedula;
	}
	public void setCedula(long cedula) {
		this.cedula = cedula;
	}
	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion + ", cedula="
				+ cedula + "]";
	}
	public Estudiante(String nombre, String apellido, String direccion, long cedula) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.cedula = cedula;
	}
	
}
