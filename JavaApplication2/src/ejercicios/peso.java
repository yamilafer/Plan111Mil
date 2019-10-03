package ejercicios;

import java.util.Scanner;

public class peso {
    public static void main(String[] args) {
        double peso, altura, imc;
        
        Scanner teclado= new Scanner (System.in);
        
        System.out.println("ingrese altura= ");
        altura= teclado.nextFloat();
        System.out.println("ingrese su peso = ");
        peso=teclado.nextFloat();
        imc=peso/Math.pow(altura, 2);
        System.out.printf("su inidice de masa colporal es: %.2f", imc);
       
        if (imc<=18.5){
            System.out.println("tienes un imc bajo");
          
        }else if (imc<=24.90){
            System.out.println("tienes imc normal");
            
        }else{
            System.out.println("tiene un imc alto ");
        }
    }
    
}
