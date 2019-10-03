
package examen5;

public class PaqueteProyectores {
   private int codPaqueteDeProyectores;
   private String destinatario;
   private String destino;
   private float costoEnvio;
   private boolean enTransito;

    public PaqueteProyectores(int codPaqueteDeProyectores, String destinatario, String destino, float costoEnvio, boolean enTransito) {
        this.codPaqueteDeProyectores = codPaqueteDeProyectores;
        this.destinatario = destinatario;
        this.destino = destino;
        this.costoEnvio = costoEnvio;
        this.enTransito = enTransito;
    }

    public PaqueteProyectores() {
        
    }

    public int getCodPaqueteDeProyectores() {
        return this.codPaqueteDeProyectores;
    }

    public void setCodPaqueteDeProyectores(int codPaqueteDeProyectores) {
        this.codPaqueteDeProyectores = codPaqueteDeProyectores;
    }

    public boolean isEnTransito() {
        return this.enTransito; //EL THIS ES PAra indicar que es de esta clase
    }

    public void setEnTransito(boolean enTransito) {
        this.enTransito = enTransito;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }
   
   
   
}
