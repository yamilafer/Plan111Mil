
package examen12;

public class Herramienta {
  
    private String tipo;
    private int nivel;
    private String nombre;

    public Herramienta(String tipo, int nivel, String nombre) {
        this.tipo = tipo;
        this.nivel = nivel;
        this.nombre = nombre;
    }

    public Herramienta() {
    }

    public String getTipo() {
        return tipo;
    }

    public int getNivel() {
        return nivel;
    }

    public String getNombre() {
        return nombre;
    }
    
    
}
