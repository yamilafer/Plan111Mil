
package examen12;

import java.util.ArrayList;
import java.util.List;

public class Personaje {
 
   private List<Mision> misionescompletadas;
   private List<Herramienta> inventario;
   private int nivel;
   private int experiencia=0;
   private String nombre;
  

    public Personaje(int nivel, String nombre) {
        this.nivel = nivel;
        this.nombre = nombre;
        misionescompletadas= new ArrayList<>();
        inventario= new ArrayList<>();
        
    }

    public int getNivel() {
        return nivel;
    }

    public String getNombre() {
        return nombre;
    }
   
    public void addexpericia (int exp){
        
        Mision mision= new Mision(); 
        for(int i=0;i<misionescompletadas.size();i++){
         
           if(misionescompletadas.get(i).getRequerimientos()== mision.getRequerimientos()){
               experiencia = experiencia+exp;
           } 
        }
    }
    
    public void addinventario (Herramienta herramienta){
        inventario.add(herramienta);
    }
     public void addMisionCompletada (Mision mision){
         misionescompletadas.add(mision);
     }
     
    public List<Herramienta> ObetenerListaHerramientas (String TipoHerramienta){
        List<Herramienta> herramientaspersonajes=null;
        Herramienta herramientaIngresada = new Herramienta();
        
        for (int i=0;i<inventario.size();i++){
        
              if(inventario.contains(TipoHerramienta) && nivel <= herramientaIngresada.getNivel()){
              
              herramientaspersonajes.add(herramientaIngresada);
              
              }
        
        } 
        return herramientaspersonajes;
    } 
}
//SELECT COUNT(Idherramienta) FROM herramienta, personaje WHERE personaje.idpersonaje=herramienta.idpersonaje AND personaje.nombre=
//111mil GROUP BY herramienta.tipo
