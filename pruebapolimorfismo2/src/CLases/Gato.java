
package CLases;

import Interface.ComerJugar;
import javax.swing.JOptionPane;


public class Gato implements ComerJugar {
    private String animal;
    @Override
    public void comer(){
        JOptionPane.showMessageDialog(null, " El gato "+animal+ " esta comiendo ");
    }
    @Override
    public void jugar(){
        JOptionPane.showMessageDialog(null," El gato "+animal+ " esta jugando ");
       
    }
    
    public Gato (String animal){
        this.animal=animal;
    
    }
    
    
}
