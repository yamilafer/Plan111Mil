
package Vector;

public class Cuenta {
    private String nombre;
    private Double cantidad;
    
    
    public Cuenta(String nombre, Double cantidad){ //constructor
        this.nombre=nombre;
        this.cantidad=cantidad;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "nombre=" + nombre + ", cantidad=" + cantidad + '}';
    }

//public Double Ingresar(){
    //}




}

