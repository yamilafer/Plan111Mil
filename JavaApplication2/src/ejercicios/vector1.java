package ejercicios;
import java.util.Scanner;
public class vector1 {
    @SuppressWarnings("empty-statement")
    public static void main (String[] args){
   Scanner Teclado= new Scanner(System.in);
   int[] notas= new int [5];
   
   int i;
   for (i=0;i<notas.length;i++) {
    System.out.println("ingrese un numero = ");
    notas[i]=Teclado.nextInt ();
    }
   
    System.out.println("el array tiene " +notas.length+"elementos ");
    System.out.println(" los elementos son " );
    for (i=0; i<notas.length;i++){
        System.out.print(notas[i]+" ");
       
  }
    System.out.println();
    
}

    
    
            
}
