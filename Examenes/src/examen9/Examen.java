
package examen9;

import java.util.List;

public class Examen {
    private String tema;
    private List <Pregunta> preguntas;
    private List <List <String>> repuestasAlumnos;
   private List <String> alumnos;

    public Examen(String tema) {
        this.tema = tema;
       
    }

public float calificarRespuestas (List <String> respuestas){
    float NotaTotal=0;
    
    Pregunta puntaje= new Pregunta();
    
    for(int i=0; i<preguntas.size(); i++){
        
        if(preguntas.get(i).equals(respuestas.get(i))){
            if(puntaje.esCorrecta(respuestas.get(i)));
          
            NotaTotal+= puntaje.getPuntaje(respuestas.get(i));
        }
    
}
return NotaTotal;    
}   


}