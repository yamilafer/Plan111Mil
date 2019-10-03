
package ejercicios;

import java.util.Scanner;

public class ejer1 {
    public static void main(String[] args) {
        int x, y, total;
        Scanner fondo = new Scanner (System.in); //creo el objeto fondo
        System.out.print("Ingrese los metros de fondo del terreno= ");
        x=fondo.nextInt ();
        
        System.out.println("ingrese metros de frente del terreno" );
        y=fondo.nextInt();
        
        
        total=x+x+y+y;
        System.out.println("los metros de alambre que se necesitan son = " + total);
    }
    
}
