
package examen10;

import java.util.ArrayList;
import java.util.List;


public class Poliza {
   private int idPoliza ;
   private List<ObjetoDeValor> objetoDeValor;

    public Poliza(int idPoliza) {
        this.idPoliza = idPoliza;
        objetoDeValor= new ArrayList <>();
    }

    public Poliza() {
    }

    public int getIdPoliza() {
        return idPoliza;
    }

    public List<ObjetoDeValor> getObjetoDeValor() {
        return objetoDeValor;
    }
   /**
    * 
    * @param nombre
    * @param valor 
    */
    public void agregarObjetoDeValor (String nombre, double valor){
        
        ObjetoDeValor objeto = new ObjetoDeValor();
        
        if(objetoDeValor.contains(nombre) && objetoDeValor.contains(valor)){
            
            System.out.print("El objeto ya existe");
        }else{
            objetoDeValor.add(objeto);
        }
        
    }
    
   /**
    * devuelve un valor de un objeto de valor parasando por parametro el numero de poliza y el nombre del objeto
    * @param nropoliza
    * @param nombreobjeto 
    */
   
       public void ObtenerValorDelObjetoDeValor (int nropoliza, String nombreobjeto){
        
         ObjetoDeValor objeto= new ObjetoDeValor();
         
         if (objetoDeValor.contains(nropoliza) && objetoDeValor.contains(nombreobjeto)){
             
             System.out.print(objeto.getValor());
             
             
         }
     }
}
    
    

   

