public enum GenereEnum {
    HORROR("Genere horror"),
    FANTASY("Genere fantasy"),
    THRILLER("Genere thriller"),
    ROMANTICO("Genere romantico"),
    STORICO("Genere storico"),
    COMMEDIA("Genere commedia"),
    AZIONE("Genere azione");

    private final String descrizione;

    GenereEnum(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getDescrizione() {
        return descrizione;
    }
}
