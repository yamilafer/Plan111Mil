
package examenes.examen1;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
 
   private List<Orden> ordenes; //lista de las ordenes
   private String nombre;
   private int dni;
   
   public Cliente (String nombre, int dni){
       this.nombre=nombre;
       this.dni=dni;
       ordenes=new ArrayList<>();
   
   }
  public void addOrden (Orden o){
      ordenes.add(o);
  } 

    public String getNombre() {
        return nombre;
    }

    public int getDni() {
        return dni;
    }
  
  
}
