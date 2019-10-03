
package examen6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Stock {
    private List <ItemStock> items;
    
  public Stock (){
      items= new ArrayList <ItemStock>();
  }

    public List<ItemStock> getItems() {
        return new ArrayList<ItemStock>(this.items);
    }

    public void setItems(List<ItemStock> items) {
        this.items = items;
    }
 
public List<ItemStock> consultarItemsFaltantes (int cantidadMaxima){
    
List<ItemStock> resultado = new ArrayList<ItemStock>();

    for (ItemStock item : this.items){
           if (item.getCantidad() <= cantidadMaxima){
               resultado.add(item);
           }
           
       }
       return resultado;
}
}
