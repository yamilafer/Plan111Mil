
package Clases;

public class Notebook {
    private String marca;
    private String modelo;
    private String procesador;
    private Float tamañoDisco;
    
    
    public Notebook(String marca, String modelo, String procesador, Float tamañodisco){
        this.marca=marca;
        this.modelo=modelo;
        this.procesador=procesador;
        this.tamañoDisco=tamañodisco;
    
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getProcesador() {
        return procesador;
    }

    public Float getTamañodisco() {
        return tamañoDisco;
    }
    
}
