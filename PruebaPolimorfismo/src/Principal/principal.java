
package Principal;

import Clases.auto;
import Clases.computadora;
import Clases.television;



public class principal {
    public static void main(String[] args) {
        auto auto = new auto ("Nissan");
        computadora compu= new computadora("Vaio");
        television tel = new television ("Samsung");
        
        auto.apagar();
        auto.encender();
        compu.apagar();
        compu.encender();
        tel.apagar();
        tel.encender();
        
        
    }
    
}
