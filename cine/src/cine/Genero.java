
package cine;

public class Genero {
private Integer id;
private String nombre;

public Genero(){
    
}
public Genero (String nombre){
    this.nombre=nombre;
    
}
public String getNombre(){
    return nombre;
}

public void setNombre (String nombre){
    this.nombre=nombre;
}

public Integer getld(){
    return id;
}

public void setld(Integer id){
    this.id=id;
}
@Override
public String toString (){
    return this.nombre;
    
}
}
