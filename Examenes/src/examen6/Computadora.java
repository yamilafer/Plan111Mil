package examen6;

public class Computadora {
    
    private String nombre;
    private int precio;

    public Computadora(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return this.precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
}
