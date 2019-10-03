
package Principal;

import CLases.Gato;
import CLases.Pez;

public class Principal {
    public static void main(String[] args) {
        Gato Gato= new Gato (" Felipe ");
        Pez Pez = new Pez (" Pepe ");
        
        Gato.comer();
        Gato.jugar();
        Pez.comer();
        Pez.jugar();
        
        
    }
}
