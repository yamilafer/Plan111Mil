
package ejercicios;
import java.util.Scanner;
        
public class ejer2 {
     public static void main(String[] args) {
        int n1, n2, r;
        
        Scanner Teclado= new Scanner (System.in);
        System.out.println("Ingrese primer valor= ");
        n1= Teclado.nextInt();
       
        System.out.println("Ingrese segundo valor= ");
        n2= Teclado.nextInt();
     
        r=n1+n2;
        System.out.println("El resultado de la suma de " +n1+ " mas " +n2+ "es igual a = " +r );
        
        r=n1-n2;
        System.out.println("El resultado de la resta de " +n1+ "menos " +n2+ "es igual a = " +r );
        
        r=n1*n2;
        System.out.println("El resultado del pproducto de " +n1+ "por " +n2+ "es igual a = " +r );
        
        r=n1/n2;
        System.out.println("El resultado de la division de " +n1+ "dividido " +n2+ "es igual a = " +r );
        
    }
}
