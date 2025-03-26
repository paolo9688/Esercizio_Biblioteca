public enum StatoPrestitoEnum {
    DISPONIBILE("La pubblicazione è disponibile"),
    PRESTATO("La pubblicazione è stata data in prestito ad un utente"),
    SMARRITO("La pubblicazione è stata smarrita da un utente");

    private final String descrizione;

    StatoPrestitoEnum(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getDescrizione() {
        return descrizione;
    }
}
