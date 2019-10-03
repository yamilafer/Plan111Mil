
package examenes.examen1;

public class Notebook {
    private String marca;
    private String modelo;
    private String proceador;
    private float tamañodisco;

    public Notebook(String marca, String modelo, String proceador, float tamañodisco) {
        this.marca = marca;
        this.modelo = modelo;
        this.proceador = proceador;
        this.tamañodisco = tamañodisco;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getProceador() {
        return proceador;
    }

    public float getTamañodisco() {
        return tamañodisco;
    }
    
    
}
