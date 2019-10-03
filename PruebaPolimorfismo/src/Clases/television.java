
package Clases;

import Interface.OnOff;
import javax.swing.JOptionPane;

public class television implements OnOff {
private String modelo;

    @Override
    public void encender() {
        JOptionPane.showMessageDialog(null,"El televisor " +modelo+ " esta encedido");
    }

    @Override
    public void apagar() {
        JOptionPane.showMessageDialog(null,"El televisor " +modelo+ " esta apagado");

 
    }
   public television(String modelo) {
        this.modelo = modelo;    
   }
}

    


