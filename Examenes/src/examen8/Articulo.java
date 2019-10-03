
package examen8;

import java.util.List;


public class Articulo {
    private String titulo;
    private String periodista;
    private List <String> temas;
    private int palabras;
    private String texto;
    private Long idArticulo;

    public Articulo(String titulo, String periodista, int palabras, String texto, Long idArticulo) {
        this.titulo = titulo;
        this.periodista = periodista;
        this.palabras = palabras;
        this.texto = texto;
        this.idArticulo = idArticulo;
    }
 
    public boolean contieneTema (String tema){
        return temas.contains(tema); //busca en la lista si contiene lo que me pasa por parametro
    
}
    public boolean addTema (String tema){
        return temas.add(tema);
        
    }

    public String getPeriodista() {
        return periodista;
    }

    public void setPeriodista(String periodista) {
        this.periodista = periodista;
    }

    public int getPalabras() {
        return palabras;
    }

    public void setPalabras(int palabras) {
        this.palabras = palabras;
    }
    
    
    
}  

