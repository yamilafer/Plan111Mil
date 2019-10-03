
package examenes.examen1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Orden {
  private List <DetalleOrden> items;  
  private  Date creacion;
  private  Date envio;
  private int id;

    public Orden(Date creacion, int id) {
        this.creacion = creacion;
        this.id = id;
        items= new ArrayList<>();//inicializar la la lista
    }
  
  public void agregarItem (DetalleOrden detalle){
   items.add(detalle);
   
  }
  
  public int getNroitems () { //metodso creado para traer la cantidad de items
    return items.size();
    
}

    public void setEnvio(Date envio) {
        this.envio = envio;
    }
  
 public void CalcularTotalOrden (){
     int cantidad=this.getNroitems();
     float total=0;
     
     for(int i=0; i<cantidad; i++){
         total=total+(items.get(i).cantidad*items.get(i).getPreciounitario());
     }
     
     System.out.println("El numero de Items es : "+cantidad+" y " + " el precio total es : "+total);
 }

}


