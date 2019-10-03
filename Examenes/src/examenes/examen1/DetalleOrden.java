
package examenes.examen1;

public class DetalleOrden {
    private Notebook item;//se crea la relacion un atributo de tipo notebook
    private float preciounitario;
    int cantidad;

    public DetalleOrden(Notebook item, float preciounitario, int cantidad) {
        this.item = item;
        this.preciounitario = preciounitario;
        this.cantidad = cantidad;
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
