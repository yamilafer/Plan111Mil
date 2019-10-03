

package Clases;

import java.util.ArrayList;
import java.util.List;
/**
 * 
 * @author Capacitacion13
 */
public class Estudiante extends Persona {
    private List<String> cursos; 
    private List<String> calificaciones;
    
    public Estudiante (String nombre, String direccion){
        super (nombre, direccion);
        cursos= new ArrayList<>();
        calificaciones= new ArrayList<>();
        
    }
@Override
public String toString(){
}  

}


