import java.time.LocalDate;

public class Libro extends Pubblicazione implements Prestabile, Ricercabile{

    private Integer numeroPagine;
    private String autore;
    private String isbn;
    private StatoPrestitoEnum stato;

    public Libro(String nome, LocalDate dataPubblicazione, GenereEnum genere, Integer id, String titolo, CategoriaPubblicazioneEnum categoria, Integer numeroPagine, String autore, String isbn) {
        super(nome, dataPubblicazione, genere, id, titolo, categoria);
        this.numeroPagine = numeroPagine;
        this.autore = autore;
        this.isbn = isbn;
        this.stato = StatoPrestitoEnum.DISPONIBILE;
    }

    public Integer getNumeroPagine() {
        return numeroPagine;
    }

    public void setNumeroPagine(Integer numeroPagine) {
        this.numeroPagine = numeroPagine;
    }

    public String getAutore() {
        return autore;
    }

    public String getIsbn() {
        return isbn;
    }

    public StatoPrestitoEnum getStato() {
        return stato;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setStato(StatoPrestitoEnum stato) {
        this.stato = stato;
    }

    @Override
    public void mostraPubblicazione() {
        super.mostraPubblicazione();
        System.out.println("Autore: " + autore + ", isbn: " + isbn + ", stato: " + stato);
    }

    @Override
    public void getDettagliSpecifici() {
        System.out.println("Dettagli specifici:\n- numero pagine: " + numeroPagine + "\n");
    }

    @Override
    public void prestito() {
        if (this.stato == StatoPrestitoEnum.DISPONIBILE) {
            this.stato = StatoPrestitoEnum.PRESTATO;
            System.out.println("Il libro è stato prestato\n");
        } else {
            System.out.println("Il libro non è disponibile\n");
        }
    }

    @Override
    public void restituzione() {
        if (this.stato == StatoPrestitoEnum.PRESTATO) {
            this.stato = StatoPrestitoEnum.DISPONIBILE;
            System.out.println("Il libro è stato restituito\n");
        } else {
            System.out.println("Il libro è già disponibile\n");
        }
    }

    @Override
    public void isDisponibile() {
        if (this.stato == StatoPrestitoEnum.PRESTATO) {
            System.out.println("Il libro è attualmente in prestito\n");
        } else {
            System.out.println("Il libro è disponibile\n");
        }
    }

    @Override
    public void matchRicerca(String chiave) {
        //
    }
}
