/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasorelacion;

public class Profesor {

    private String nombre;
    private String apelido;

    public Profesor(String nombre, String apelido) {
        this.nombre = nombre;
        this.apelido = apelido;
    }

    public Profesor() {
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
        return "Profesor " + "\n Nombre y Apellido " + nombre + " " + apelido;
    }

}
