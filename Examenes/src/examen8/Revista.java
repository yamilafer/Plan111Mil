
package examen8;

import java.util.ArrayList;
import java.util.List;

public class Revista {
    private List <Articulo> elementos;
    private String titulo;
    private int ejemplar;

    public Revista(String titulo, int ejemplar) {
        this.titulo = titulo;
        this.ejemplar = ejemplar;
        elementos= new ArrayList <>(); // no hace falta poner entre porq ya lo declare arriba, siempre va en vacio en este caso
        
    }
    
    public boolean addElemento (Articulo articulo){
        return this.elementos.add(articulo);
    }
    
    public Articulo getArticuloEnPosicion (int posicion){
      
        if (elementos.contains(posicion) ){
            
            return elementos.get(posicion);
        }
        return null;
    } 
   
    public int getCantidadArticuloDeTema(String tema){
        
        int cant=0;
        
        for(Articulo cantidad: this.elementos){
            
            if(cantidad.contieneTema(tema)){
                cant++;
            }
        }
        return cant;
    }
}
