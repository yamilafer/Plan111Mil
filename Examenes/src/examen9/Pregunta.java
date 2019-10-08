
package examen9;


public class Pregunta {
    private String consigna;
    private String respuesta;
    private float Puntaje;

    public Pregunta(String consigna, String respuesta, float Puntaje) {
        this.consigna = consigna;
        this.respuesta = respuesta;
        this.Puntaje = Puntaje;
    }

    public Pregunta() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public boolean esCorrecta (String Respuesta){
        if (Respuesta==respuesta){
            return true;
            
        }
        return false; 
            
                   
    }

    public float getPuntaje(String respuesta) {
        return Puntaje;
    }
    
    
    
}
