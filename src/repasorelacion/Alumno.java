package repasorelacion;

public class Alumno {

    private String nombre;
    private String apelido;
    
    
    public Alumno() {
    }

    public Alumno(String nombre, String apelido) {
        this.nombre = nombre;
        this.apelido = apelido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    @Override
    public String toString() {
        return "\n Nombre y Apellido: " + nombre + " " + apelido;
    }

}
