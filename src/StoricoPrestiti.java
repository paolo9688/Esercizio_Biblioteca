import java.util.ArrayList;

public class StoricoPrestiti {

    private Utente utente;
    private ArrayList<String> prestiti;

    public StoricoPrestiti(Utente utente, ArrayList<String> prestiti) {
        this.utente = utente;
        this.prestiti = prestiti;
    }

    public Utente getUtente() {
        return utente;
    }

    public void setUtente(Utente utente) {
        this.utente = utente;
    }

    public void setPrestiti(ArrayList<String> prestiti) {
        this.prestiti = prestiti;
    }

    /*public void aggiungiPrestito(Prestito prestito) {
        // aggiunge un prestito alla storia dei prestiti dell'utente
    }

    public Prestito getPrestiti() {
        return prestito;
    }*/
}
