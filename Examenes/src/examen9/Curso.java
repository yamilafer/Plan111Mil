/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen9;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author capacitacion05
 */
public class Curso {
    private String nombre;
    private List <String> alumnos;
    private List <Examen> examenes;

    public Curso(String nombre) {
        this.nombre = nombre;
        alumnos = new ArrayList <>();
        examenes= new ArrayList <>();
        
    }
    
    public boolean addAlumno (String Alumno){
        if(alumnos.contains(Alumno)){
            return true;
            
        }else{
             alumnos.add(Alumno);
            
        } return false;
       
    }
    
    public boolean addExamen (Examen examen){
        if(examenes.contains(examen)){
            return true;
        }else{
            examenes.add(examen);
        }return false;
    }
    
   public boolean addRespuesta (String temaExamen, String Alumno, List <String> respuestas){
      
       Examen AlumnoRespuesta= new Examen();
       
       if (alumnos.contains(Alumno) && examenes.contains(temaExamen)){
           
           return true; //si si contiene el alumno con el tema de examen, retorna verdadero (si esta)
       } else{ //si no lo contiene adiciona el alumno, adiciona respuesta en la lista de respuestas en la clase examen y retorna falso
           alumnos.add(Alumno);
          
           AlumnoRespuesta.addRespuestas(respuestas);
       }
       return false;
   }

}