
package Clases;

import Interface.OnOff;
import javax.swing.JOptionPane;


public class auto implements OnOff{
private String modelo;
    @Override
    public void encender() {
        JOptionPane.showMessageDialog(null," El auto " +modelo+ " esta encedido ");
    }

    @Override
    public void apagar() {
        JOptionPane.showMessageDialog(null, " El auto " +modelo+ " esta apagado ");
    }
    public auto(String modelo) {
        this.modelo = modelo;
    }
    
}
