
package CLases;

import Interface.ComerJugar;
import javax.swing.JOptionPane;

public class Pez implements ComerJugar {
    private String animal;
    @Override
    public void comer(){
        JOptionPane.showMessageDialog(null, " El Pez "+animal+ " esta comiendo ");
    }
    @Override
    public void jugar(){
        JOptionPane.showMessageDialog(null," El Pez "+animal+ " esta jugando ");
       
    }
    
    public Pez (String animal){
        this.animal=animal;
    
    }
    
}
