import java.util.Objects;

public class Utente {

    private Integer id;
    private String nome;
    private String cognome;
    private String email;
    private String password;

    public Utente(Integer id, String nome, String cognome, String email, String password) {
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void stampaUtente() {
        System.out.println("Utente: nome " + this.nome
                + ", cognome " + this.cognome
                + ", email " + this.email
                + ", password " + this.password
                + ", ID " + this.id);
    }

    public void login(String email, String password) {
        if (Objects.equals(email, this.getEmail()) && Objects.equals(password, this.getPassword())) {
            System.out.println("Utente loggato correttamente");
        } else {
            System.out.println("Errore: email o password errate");
        }
    }

    public void getPrenotazioni() {

    }

    /*public List getStoricoPrestiti() {
        // Restituisce la storia dei prestiti dell'utente
    }*/
}
