
package examen2;

import java.util.ArrayList;
import java.util.List;


public class Curso {
   private String nombreCurso;
   private int cupo;
   private float notaAprobacion;
   private List <Inscripcion> inscripciones; 

    public Curso(int cupo, float notaAprobacion) {
        this.cupo = cupo;
        this.notaAprobacion = notaAprobacion;
        inscripciones= new ArrayList <Inscripcion>();
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }
   
    
}
