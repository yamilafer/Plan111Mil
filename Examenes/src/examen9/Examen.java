
package examen9;

import java.util.List;

public class Examen {
    private String tema;
    private List <Pregunta> preguntas;
    private List <List <String>> respuestasAlumnos;
   private List <String> alumnos;

public Examen(String tema) {
    this.tema = tema;
       
    }

public Examen() {   
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
public void addRespuestas (List<String> RespuestasAlumnos){
    respuestasAlumnos.add(RespuestasAlumnos);
}
public boolean addPreguntas(String consigna){
   
    Pregunta addconsigna= new Pregunta(); 
    
    if(preguntas.contains(consigna)){
        
        return true;
    } else{
        //preguntas.add(consigna);
        return false;
    }
}

public boolean Desaprobados (float PunMinimo, String TemaExamen){
 
return true;//sacar    
}

}