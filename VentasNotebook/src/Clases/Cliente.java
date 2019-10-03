
package Clases;

import java.util.*;

public class Cliente {
    private String nombre;
    private int dni;
    private List <Orden> ordenes;  
   

public Cliente (String nombre, int dni){
    this.nombre=nombre;
    this.dni=dni;
    ordenes= new ArrayList<>();

}

public void addorden(Orden o){
    ordenes.add(o);
    
}

    public String getNombre() {
        return nombre;
    }

    public Integer getDni() {
        return dni;
    }

        public float ordenarOrdenesPorMasCantidadDeItems(){
        
        int n=ordenes.size();//guarda en n el tamaño del array list
        int k; //define variable
        for(int m=n; m>=0; m--){ //a m le guarda lo que tierne n, si m es mayor oigual a 0, decrementa m
            for(int i=0; i<n; i++ ){ //define i=o, i , menor que n, incrementa i
                k=i+1; // a k le asigna lo que tiene i incrementado
                
                if(ordenes.get(i).getNroItems()>ordenes.get(k).getNroItems()){ // si lo que trae de ordenes en la posicion i y el numero de items es menos que lo que esta en la posicion k jumto con la cantidad de item
                   Orden temp = ordenes.set(i, ordenes.get(k));
                   ordenes.set(k, temp);
                   
                }
                
            }
            
            
        }
        }
}
        





