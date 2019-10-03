
package Vector;

import javax.swing.JOptionPane;

public class vector2 {
   
    public static void main(String[] args) {
        double array[]=new double [6];
        
        for (int i=0; i<6; i++){
            array[i]=Double.parseDouble(JOptionPane.showInputDialog(null," INGRESE VALORES DEL VECTOR")); 
        }
        
        for (int i=0; i<array.length; i++ ) {
            array[i]= array[i]+(array [i]/ array[0]);
        }
        
        for (int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
    
}
