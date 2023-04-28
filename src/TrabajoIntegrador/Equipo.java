package TrabajoIntegrador;

public class Equipo {

	String nombre, descripcion;

    public Equipo(String nombreEquipo, String descrip) {
	this.nombre = nombreEquipo;
	this.descripcion = descrip;
    }

    public Equipo() {
	
	}

	public String getNombre() {
	return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
	return descripcion;
    }

    public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
    }
}
