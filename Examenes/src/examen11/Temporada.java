
package examen11;

import java.util.Iterator;
import java.util.List;

public class Temporada {
  
        private int numero;
        private List <Episodio> episodios;

    public Temporada(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public List<Episodio> getEpisodios() {
        return episodios;
    }
        
    public void agregarEpisodio (int numero, String titulo, boolean visto){
        episodios.add(new Episodio(numero, titulo, visto));
    }
    
    public Episodio obtenerEpisodio ( int numEpi, int numTemp){
        Serie NumTemp = new Serie();
      
        for (Iterator<Episodio>iterator=this.episodios.iterator(); iterator.hasNext();){
           Episodio episod=iterator.next();
           
           if(episod.getNumero()==numEpi && NumTemp.getTemporadas().equals(numTemp)) {
               return episod;
           
        }
    }
        return null;
}
}
