
package examen6;

import java.util.Date;

public class ItemStock {
  
    private Computadora computadora;
    private int cantidad;
    private Date ultimaFechaModificacion;

    public ItemStock(Computadora computadora, int cantidad, Date ultimaFechaModificacion) {
        this.computadora = computadora;
        this.cantidad = cantidad;
        this.ultimaFechaModificacion = ultimaFechaModificacion;
    }

    public Computadora getComputadora() {
        return this.computadora;
    }

    public int getCantidad() {
        return this.cantidad;
    }
    
    
    
}
