
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
    
    public Episodio buscarEpisodio(int numtemporada, int numepisodio){
        
        for(int i=0; i<=temporadas.size(); i++){
                      
            if(temporadas.contains(numtemporada) ){
                
                Temporada numero = new Temporada();
                
               numero.obtenerEpisodio(numepisodio);
                
            }
        }
    return null;
}
}
