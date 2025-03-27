import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();

        Libro libro = new Libro("Libro", LocalDate.of(1990, 5, 15), GenereEnum.HORROR, 123456789, "Libro 1", CategoriaPubblicazioneEnum.LIBRO, 1564, "Autore", "978–88–8080–123–4");
        Rivista rivista = new Rivista("Rivista", LocalDate.of(1991, 5, 15), GenereEnum.FANTASY, 123456788, "Rivista 1", CategoriaPubblicazioneEnum.RIVISTA, true);
        Rivista giornale = new Rivista("Giornale", LocalDate.of(1992, 5, 15), GenereEnum.THRILLER, 123456787, "Giornale 1", CategoriaPubblicazioneEnum.GIORNALE, true);
        Rivista documentoStorico = new Rivista("Documento storico", LocalDate.of(1900, 6, 9), GenereEnum.STORICO, 123456786, "Documento storico 1", CategoriaPubblicazioneEnum.DOCUMENTO_STORICO, false);

        Utente utente1 = new Utente(1234567890, "Mario", "Rossi", "mario.rossi@example.com", "mariorossi");
        Utente utente2 = new Utente(1234567891, "Luigi", "Verdi", "luigi.verdi@example.com", "luigiverdi");
        Utente utente3 = new Utente(1234567892, "Giovanni", "Bianchi", "giovanni.bianchi@example.com", "giovannibianchi");
        Utente utente4 = new Utente(1234567893, "Anna", "Neri", "anna.neri@example.com", "annaneri");

        biblioteca.aggiungiPubblicazione(libro);
        biblioteca.aggiungiPubblicazione(rivista);
        biblioteca.aggiungiPubblicazione(giornale);
        biblioteca.aggiungiPubblicazione(documentoStorico);

        biblioteca.registraUtente(utente1);
        biblioteca.registraUtente(utente2);
        biblioteca.registraUtente(utente3);
        biblioteca.registraUtente(utente4);

        biblioteca.mostraCatalogo();
        biblioteca.mostraUtenti();

        //biblioteca.ricercaPubblicazioni();

        libro.getDettagliSpecifici();
        giornale.getDettagliSpecifici();

        biblioteca.effettuaPrestito(libro);
        biblioteca.restituisciPubblicazione(libro);

        biblioteca.effettuaPrestito(giornale);
        biblioteca.restituisciPubblicazione(giornale);

        biblioteca.aggiungiPrenotazione(utente1, libro);
        biblioteca.aggiungiPrenotazione(utente2, rivista);
        biblioteca.aggiungiPrenotazione(utente3, giornale);
        biblioteca.aggiungiPrenotazione(utente4, documentoStorico);

        biblioteca.mostraPrenotazione();

        biblioteca.annullaPrenotazione(12);

        utente1.login("mario.rossi@example.com", "mariorossi");
    }
}