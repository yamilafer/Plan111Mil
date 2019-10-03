
package cine;

public class PaisdeOrigen {

    private Integer id;
    private String idioma;
    private String nombre;
    
    public PaisdeOrigen(){
        
    }

    public PaisdeOrigen (String idioma, String nombre){
        this.idioma=idioma;
        this.nombre=nombre;
        
    }
public String getIdioma(){
    return idioma;
}

public void setIdioma (String idioma){
    this.idioma=idioma;
    
}

public String getNombre(){
    return nombre;
    
}

public void setNombre(String nombre){
    this.nombre=nombre;
}

public Integer getId(){
    return id;
}

@Override
public String toString (){
    return this.nombre;
   
}    
}
