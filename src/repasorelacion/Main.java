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
public class Main {

    public static void main(String[] args) {

        Curso curso = new Curso();
        Alumno a = new Alumno();
        Alumno a1 = new Alumno();
        Profesor p = new Profesor();
        
        a.setApelido("Villarruel");
        a.setNombre("Julieta");

        a1.setNombre("Florencia");
        a1.setApelido("Silva");

        curso.setAlumnos(a1);
        curso.setAlumnos(a);
        curso.setAlumnos(new Alumno("Juan", "Arbona"));

p.setApelido("A");
p.setNombre("G");
curso.setProfe(p);
        curso.setProfe(new Profesor("Giuliana", "Cervan"));
        
        
        System.out.println(curso.toString());
    }

}
