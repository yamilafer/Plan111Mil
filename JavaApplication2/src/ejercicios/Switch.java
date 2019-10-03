package ejercicios;

import javax.swing.JOptionPane;

public class Switch {
    public static void main(String[] args) {
        
        int nota;
        nota = Integer.parseInt(JOptionPane.showInputDialog("ingrese una nota: "));
                switch (nota){
                    case 1: 
                       JOptionPane.showMessageDialog(null,"tienes un 1");
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "tienes un 2");
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null,"tienes un 3");
                        break;
                    default:System.out.println("tienes una nota distinta a 1,2 o 3");
                }
    }
    
}
