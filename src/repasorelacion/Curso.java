/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasorelacion;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author giuli
 */
public class Curso {
    
    private List<Alumno> alumnos = new ArrayList();
    private Profesor profe;

    public Curso(Profesor profe) {
        this.profe = profe;
    }

    public Curso() {
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public void setAlumnos(Alumno alumnos) {
        this.alumnos.add(alumnos);
    }
    
    public Profesor getProfe() {
        return profe;
    }

    public void setProfe(Profesor profe) {
        this.profe = profe;
    }

    @Override
    public String toString() {
        return "Curso " + profe + "\n Alumnos: " + alumnos ;
    }
    
    
}
