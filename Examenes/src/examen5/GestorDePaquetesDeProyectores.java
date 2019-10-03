
package examen5;

import java.util.ArrayList;
import java.util.List;

public class GestorDePaquetesDeProyectores {
    private List<PaqueteProyectores> paquetes;
    private String nombreEmpresa;

    public GestorDePaquetesDeProyectores(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
        paquetes = new ArrayList <PaqueteProyectores>();
        
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }
    
    public void agregarPaquete (PaqueteProyectores paquetenuevo){
        paquetes.add(paquetenuevo);
        
    }
    
  public PaqueteProyectores BuscarPaqueteDeProyecto (int CodPaq){
      
      for(int i=0; i<paquetes.size(); i++){
          
          PaqueteProyectores paq= new PaqueteProyectores();
          
          
          if (paq.getCodPaqueteDeProyectores()==CodPaq){
              
              return paq;  
          }
      
          }
      
        return null;  
      }
  } 
    
