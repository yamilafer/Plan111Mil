
package cine;

import java.util.Calendar;
import java.util.Date;

public class HorarioFuncion {

    private int diaDeSemana;
    private int duracionIntervalo;
    private int duracionPublicidad;
    private boolean esTrasnoche;
    private Date horaPrimeraFuncion;
    private Date horaUltimaFuncion; 
    
    public HorarioFuncion(){
        
    }
public HorarioFuncion (int diaDeSemana, int duracionIntervalo, int duracionPublicidad,
        boolean esTrasnoche, Date horaPrimeraFuncion, Date horaUltimaFuncion){
    this.diaDeSemana=diaDeSemana;
    this.duracionIntervalo=duracionIntervalo;
    this.duracionPublicidad=duracionPublicidad;
    this.esTrasnoche=esTrasnoche;
    this.horaPrimeraFuncion=horaPrimeraFuncion;
    this.horaUltimaFuncion=horaUltimaFuncion;
}



private String obtenerDescrpicionDia(){
String dia;
switch (this.diaDeSemana)
{
case Calendar.MONDAY:
dia="Lunes";
break;
case Calendar.TUESDAY:
dia="Martes";
break;
case Calendar.WEDNESDAY:
dia="Miercoles";
break;
case Calendar.THURSDAY:
dia="Jueves";
case Calendar.FRIDAY:
dia="Viernes";
break;
case Calendar.SATURDAY:
dia="Sabado";
break;
case Calendar.SUNDAY:
dia="Domingo";
break;
default:
dia="No es un dia";
}
return dia;
}
}