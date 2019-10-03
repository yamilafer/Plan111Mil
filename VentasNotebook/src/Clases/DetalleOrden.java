
package Clases;


public class DetalleOrden {
    private Notebook item;
    private float preciounitario;
    private int cantidad;
    
   
    public DetalleOrden(float preciounitario, int cantidad, Notebook item ){
       this.preciounitario=preciounitario;
       this.cantidad=cantidad;
       this.item=item;
      
   }

    public Notebook getItem() {
        return item;
    }

    public float getPreciounitario() {
        return preciounitario;
    }

    public int getCantidad() {
        return cantidad;
    }
   
   
   }

