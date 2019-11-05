
package examen12;

import java.util.List;

public class Mision {
    
    private List <String> requerimientos;
    private String nombre;

    public Mision(String nombre) {
        this.nombre = nombre;
    }

    public Mision() {
    }

    public List<String> getRequerimientos() {
        return requerimientos;
    }

    public String getNombre() {
        return nombre;
    }
    
   
    }

