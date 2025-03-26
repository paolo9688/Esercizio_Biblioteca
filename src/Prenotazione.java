import java.time.LocalDate;

public class Prenotazione {

    private Integer id;
    private Utente utente;
    private Pubblicazione pubblicazione;
    private LocalDate dataPrenotazione;

    public Prenotazione(Integer id, Utente utente, Pubblicazione pubblicazione, LocalDate dataPrenotazione) {
        this.id = id;
        this.utente = utente;
        this.pubblicazione = pubblicazione;
        this.dataPrenotazione = dataPrenotazione;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Utente getUtente() {
        return utente;
    }

    public void setUtente(Utente utente) {
        this.utente = utente;
    }

    public Pubblicazione getPubblicazione() {
        return pubblicazione;
    }

    public void setPubblicazione(Pubblicazione pubblicazione) {
        this.pubblicazione = pubblicazione;
    }

    public LocalDate getDataPrenotazione() {
        return dataPrenotazione;
    }

    public void setDataPrenotazione(LocalDate dataPrenotazione) {
        this.dataPrenotazione = dataPrenotazione;
    }

    @Override
    public String toString() {
        return "Prenotazione{" +
                "id=" + id +
                ", utente=" + utente +
                ", pubblicazione=" + pubblicazione +
                ", dataPrenotazione=" + dataPrenotazione +
                '}';
    }

    public void annullaPrenotazione(Prenotazione prenotazione) {
        // annulla una prenotazione
    }
}
