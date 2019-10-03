
package Clases;

import Interface.OnOff;
import javax.swing.JOptionPane;


public class computadora implements OnOff {
private String modelo;
    @Override
    public void encender() {
        JOptionPane.showMessageDialog(null," La computadora " +modelo+ "esta encendida" );
    }

    @Override
    public void apagar() {
         JOptionPane.showMessageDialog(null," La computadora " +modelo+ "esta apagada" );
    }

    public computadora(String modelo) {
        this.modelo = modelo;
    }
    
}
