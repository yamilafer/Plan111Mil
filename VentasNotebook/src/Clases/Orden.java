
package Clases;

import java.util.Date;
import java.util.*;//preguntar pq saca el List



public class Orden {
    
    private int id;
    private Date creacion;
    private Date envio;
    private List <DetalleOrden> items;
    
    public Orden (int id, Date Creacion ){
        this.id=id;
        this.creacion=creacion;
        items= new ArrayList<>();
        
    }
    
    public void AgregarItem (DetalleOrden detalle ){
        items.add(detalle);
    
    }

    public int getNroItems() {
        return items.size();
    }

    public void setEnvio(Date envio) {
        this.envio = envio;
    }
    

    public float CalcularTotalOrden(){
    
        float PrecioTotal=0;
        for (Iterator <DetalleOrden>iterator= items.iterator(); iterator.hasNext();) {
          DetalleOrden netx= iterator.next();
          PrecioTotal=PrecioTotal+netx.getCantidad()*netx.getPreciounitario();
    }
        return PrecioTotal;
        
        }

    }

