import java.time.LocalDate;
import java.util.*;

public class Biblioteca implements Notifica {

    private ArrayList<Pubblicazione> pubblicazioni;
    private HashSet<Utente> utenti;
    private ArrayList <Prenotazione> prenotazioniUtente;

    public Biblioteca() {
        this.pubblicazioni = new ArrayList<>();
        this.utenti = new HashSet<>();
        this.prenotazioniUtente = new ArrayList<>();
    }

    public void aggiungiPubblicazione(Pubblicazione pubblicazione) {
        pubblicazioni.add(pubblicazione);
    }

    public void aggiungiPrenotazione(Utente utente, Pubblicazione pubblicazione) {
        Random random = new Random();
        Integer idRandom = random.nextInt(0, 100);
        Prenotazione prenotazione = new Prenotazione(idRandom,utente,pubblicazione, LocalDate.now());
        prenotazioniUtente.add(prenotazione);
    }

    public void annullaPrenotazione(Prenotazione prenotazione) {
        prenotazioniUtente.remove(prenotazione);
    }

    public void mostraPrenotazione() {
        for (Prenotazione prenotazione : prenotazioniUtente) {
            prenotazione.stampaPrenotazione();
        }
    }

    public void mostraCatalogo() {
        System.out.println("Catalogo biblioteca:");
        for (Pubblicazione pubblicazione : pubblicazioni) {
            pubblicazione.mostraPubblicazione();
        }
        System.out.println("\n");
    }

    public void ricercaPubblicazioni() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il nome della pubblicazione di cui vuoi fare la ricerca: ");
        String nome = scanner.nextLine();
        Integer counter = 0;

        for (Pubblicazione pubblicazione : pubblicazioni) {
            if (pubblicazione.getNome().equals(nome)) {
                counter++;
            }
        }

        if (nome.isEmpty()) {
            System.out.println("Nome non inserito");
        } else if (counter == 0) {
            System.out.println("Nessuna pubblicazione trovata col nome " + nome);
        } else {
            System.out.println("Pubblicazioni col nome " + nome + ":");
            for (Pubblicazione pubblicazione : pubblicazioni) {
                if (pubblicazione.getNome().equals(nome)) {
                    pubblicazione.mostraPubblicazione();
                }
            }
        }

        System.out.println("\n");
        scanner.close();
    }

    public void effettuaPrestito(Libro libroDaPrestare) {
        for (Pubblicazione pubblicazione : pubblicazioni) {
            if (pubblicazione.getId().equals(libroDaPrestare.getId())) {
                libroDaPrestare.prestito();
            }
        }
    }

    public void effettuaPrestito(Rivista rivistaDaPrestare) {
        for (Pubblicazione pubblicazione : pubblicazioni) {
            if (pubblicazione.getId().equals(rivistaDaPrestare.getId())) {
                rivistaDaPrestare.prestito();
            }
        }
    }

    public void restituisciPubblicazione(Libro libroDaRestituire) {
        for (Pubblicazione pubblicazione : pubblicazioni) {
            if (pubblicazione.getId().equals(libroDaRestituire.getId())) {
                libroDaRestituire.restituzione();
            }
        }
    }

    public void restituisciPubblicazione(Rivista rivistaDaRestituire) {
        for (Pubblicazione pubblicazione : pubblicazioni) {
            if (pubblicazione.getId().equals(rivistaDaRestituire.getId())) {
                rivistaDaRestituire.restituzione();
            }
        }
    }

    public void registraUtente(Utente utente) {
        utenti.add(utente);
    }

    public void mostraUtenti() {
        System.out.println("Utenti registrati:");
        for (Utente utente : utenti) {
            System.out.println(utente.toString());
        }
        System.out.println("\n");
    }

    /*public void prenotaPubblicazione(Pubblicazione pubblicazione, Utente utente) {
        prenotazioniUtente.put(utente, pubblicazione);
    }*/

    public void notificaUtente(Utente utente, Notifica notifica) {
        // Notifica un utente di una prenotazione disponibile
    }
}
