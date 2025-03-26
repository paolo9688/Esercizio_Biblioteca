import java.time.LocalDate;

public abstract class Pubblicazione {

    private String nome;
    private LocalDate dataPubblicazione;
    private GenereEnum genere;
    private Integer id;
    private String titolo;
    private CategoriaPubblicazioneEnum categoria;

    public Pubblicazione(String nome, LocalDate dataPubblicazione, GenereEnum genere, Integer id, String titolo, CategoriaPubblicazioneEnum categoria) {
        this.nome = nome;
        this.dataPubblicazione = dataPubblicazione;
        this.genere = genere;
        this.id = id;
        this.titolo = titolo;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataPubblicazione() {
        return dataPubblicazione;
    }

    public GenereEnum getGenere() {
        return genere;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataPubblicazione(LocalDate dataPubblicazione) {
        this.dataPubblicazione = dataPubblicazione;
    }

    public void setGenere(GenereEnum genere) {
        this.genere = genere;
    }

    public Integer getId() {
        return id;
    }

    public String getTitolo() {
        return titolo;
    }

    public CategoriaPubblicazioneEnum getCategoria() {
        return categoria;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public void setCategoria(CategoriaPubblicazioneEnum categoria) {
        this.categoria = categoria;
    }

    public void mostraPubblicazione() {
        System.out.println("Pubblicazione: nome " + nome +
                " - data di pubblicazione " + dataPubblicazione +
                " - genere " + genere +
                " - ID " + id +
                " - titolo " + titolo +
                " - categoria " + categoria);
    }

    public abstract void getDettagliSpecifici();
}
