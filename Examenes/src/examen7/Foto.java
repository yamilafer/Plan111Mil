
package examen7;


public class Foto {
   private String [] personasEnFoto;
   private String NombreArchivo;
   private int tamano;
   private String Descripcion;

    public Foto(String NombreArchivo, int tamano, String Descripcion) {
        
        this.NombreArchivo = NombreArchivo;
        this.tamano = tamano;
        this.Descripcion = Descripcion;
        
    }

    public String[] getPersonasEnFoto (int posi) {
        return personasEnFoto;
    }

    public void setPersonasEnFoto(int posi, String persona) {
        this.personasEnFoto = personasEnFoto;
    }

    public int getTamano() {
        return tamano;
    }
   
   
}
