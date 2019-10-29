
package examen11;

import java.util.List;

public class Serie {
    private String nombre;
    private List <Temporada> temporadas;

    public Serie(String nombre) {
        this.nombre = nombre;
    }

    public Serie() {
        
    }
    
    public void agregarTemporada (int numero){
        temporadas.add(new Temporada(numero));
    }

    public List<Temporada> getTemporadas() {
        return temporadas;
    }
    
}
