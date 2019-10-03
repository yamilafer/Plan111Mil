
package examen7;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Album {
    private List <Foto> fotos;
    private String nombre;
    private int CantidadMaxima;
    private Date FechaCreacion;

    public Album(String nombre, int CantidadMaxima, Date FechaCreacion) {
       
        this.nombre = nombre;
        this.CantidadMaxima = CantidadMaxima;
        this.FechaCreacion = FechaCreacion;
        fotos= new ArrayList<>();
        
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidadMaxima() {
        return CantidadMaxima;
    }

    public Date getFechaCreacion() {
        return FechaCreacion;
    }
    
    public void addFoto (Foto foto){
      fotos.add(foto);
    }
    
    public boolean TieneFotoConTamañoMenor (int umbral){ // el boleano retorna verdadero o falso nomas
    
      for (Foto calidad: this.fotos){
          if(calidad.getTamano()<umbral){
              System.out.println("Foto de tañano manor");
          }
          if (calidad.getTamano()==0){
              System.out.println("Foto mal cargador");
          
              return true;
          }
          
      }
      return false;
    }
    
}
