import java.time.LocalDate;

public class Rivista extends Pubblicazione implements Prestabile, Ricercabile{

    private Boolean copertinaAColori;
    private StatoPrestitoEnum stato;

    public Rivista(String nome, LocalDate dataPubblicazione, GenereEnum genere, Integer id, String titolo, CategoriaPubblicazioneEnum categoria, Boolean copertinaAColori) {
        super(nome, dataPubblicazione, genere, id, titolo, categoria);
        this.copertinaAColori = copertinaAColori;
        this.stato = StatoPrestitoEnum.DISPONIBILE;
    }

    public Boolean getCopertinaAColori() {
        return copertinaAColori;
    }

    public void setCopertinaAColori(Boolean copertinaAColori) {
        this.copertinaAColori = copertinaAColori;
    }

    public void setStato(StatoPrestitoEnum stato) {
        this.stato = stato;
    }

    @Override
    public void mostraPubblicazione() {
        super.mostraPubblicazione();
        System.out.println("Stato: " + this.stato);
    }

    @Override
    public void getDettagliSpecifici() {
        System.out.println("Dettagli specifici:\n- copertina a colori: " + copertinaAColori + "\n");
    }

    @Override
    public void prestito() {
        if (this.stato == StatoPrestitoEnum.DISPONIBILE) {
            this.stato = StatoPrestitoEnum.PRESTATO;
            System.out.println("La rivista è stata prestata\n");
        } else {
            System.out.println("La rivista non è disponibile\n");
        }
    }

    @Override
    public void restituzione() {
        if (this.stato == StatoPrestitoEnum.PRESTATO) {
            this.stato = StatoPrestitoEnum.DISPONIBILE;
            System.out.println("La rivista è stata restituita\n");
        } else {
            System.out.println("La rivista è già disponibile\n");
        }
    }

    @Override
    public void isDisponibile() {
        if (this.stato == StatoPrestitoEnum.PRESTATO) {
            System.out.println("La rivista è attualmente in prestito\n");
        } else {
            System.out.println("La rivista è disponibile\n");
        }
    }

    @Override
    public void matchRicerca(String chiave) {
        //
    }
}
