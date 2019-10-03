
package ejercicio1;

import java.util.Scanner;

public class FuncionesAnidadas {

public static void saludar (String nombre) {
    System.out.println("Hola, bienvenido "+nombre);
    
}

public static void error (String nombre){
    System.out.println("Error de validacion= "+nombre+ "¿Seguro que es tu usuario? ");
}


public static void verificar(String  usuario, String contraseña){
    String usu, clave;
    usu="Admin";
    clave="123";
    
    
    if(usuario.equals(usu) && contraseña.equals(clave)){
        saludar(usuario);
   }else
        error(usuario);
}
public static void main (String[]args){
    String x,y;
    Scanner mostrar = new Scanner (System.in);
        System.out.print("Ingrese usuario = ");
        x=mostrar.next();
        System.out.print("Ingrese contraseña = ");
        y=mostrar.next();
        verificar(x,y);
        
}
}

