public enum CategoriaPubblicazioneEnum {
    LIBRO("Libro di diverse categorie"),
    RIVISTA("Rivista di gossip"),
    GIORNALE("Giornale di cronaca"),
    DOCUMENTO_STORICO("Documento molto datato");

    private final String descrizione;

    CategoriaPubblicazioneEnum(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getDescrizione() {
        return descrizione;
    }
}
