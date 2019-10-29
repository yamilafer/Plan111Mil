
package examen10;

import java.util.ArrayList;
import java.util.List;

public class Aseguradora {
    private int idAseguradora;
    private String nombre;
    private String ciudad;
    private List <Poliza> polizas;

    public Aseguradora(String nombre) {
      
        this.nombre = nombre;
        polizas= new ArrayList <>();
        
    }

    public List<Poliza> getPolizas() {
        return polizas;
    }
     public void agregarPoliza(int idpoliza){
      
        polizas.add(new Poliza(idpoliza));
          
     }
     
  
    
}
