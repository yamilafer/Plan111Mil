
package cine;

public class Actor {
    private boolean animado;
    private String apellido;
    private String nombre;
    private Sexo sexo; //atributos y constructores
    
    //Constructor por defecto
    public Actor(){
    
}
//este constructor incluye todos los atributos de la clase actor
    public Actor (boolean animado,String apellido,String nombre,Sexo sexo){
      this.animado=animado;
      this.apellido=apellido;
      this.nombre= nombre;
      this.sexo=sexo;//this me muestra los atributos que tengo ahora
      
    }

public boolean isAnimado(){

return animado;//get
}

public void setAnimado(boolean animado){
this.animado=animado;//set
}

public String getApellido(){
    return apellido;
}

public void SetApellido(String apellido){
    this.apellido=apellido;
}
public String getNombre (){
    return nombre;
}
public void setNombre(String nombre){
    this.nombre=nombre;
}

public Sexo getSexo(){
return sexo;
}
public void setSexo(Sexo sexo){
    this.sexo=sexo;
}

@Override
public String toString(){
    return nombre + "" + apellido;
    
}

}//cierra la clase
