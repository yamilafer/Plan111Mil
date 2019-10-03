
package ejercicio1;

import java.util.List;

public class Equipo {
 
    private String nombre;
    private List<String> jugadores;
    private int max_jugadores;
    
public Equipo (String nombre, String jugadores, int max_jugadores ){
    
    this.nombre=nombre;
    this.jugadores.add(jugadores);
    this.max_jugadores=max_jugadores;
  
}

public String getNombre(){
    return nombre;
}

public void SetNombre(String nombre){
    this.nombre=nombre;
}

public List<String> getJugadores(){
    return jugadores;
}

public void  addJugadores (String jugadores){
    this.jugadores.add(jugadores);
}

public int getMax_jugadores(){
    return max_jugadores;
}

public void setMaxjugadores (int max_jugadores){
    this.max_jugadores=max_jugadores;
    
}

public void addjugador (String jugador){
    this.jugadores.add(jugador);
}
}
