public class GestoreCinema extends Utente {
    protected String admin;
    protected String password;
    protected boolean isLoggedIn;

    public GestoreCinema(String admin, String nome, String password) {
        super(nome, password);
        this.admin = "Admin";
        this.isLoggedIn = false;
    }

    public void gestisciCinema() {
        // Funzionalità per gestire il cinema (es. aggiungere una sala, aggiungere un
        // film)
        System.out.println("Gestione Cinema: aggiungi sala, aggiungi film...");
    }

    // Metodo per aggiungere una sala
    public void aggiungiSala(Sala sala) {
        System.out.println("Sala aggiunta: " + sala.getNumeroSala());
    }

    // Metodo per aggiungere un film
    public void aggiungiFilm(SalaFilm salaFilm) {
        System.out.println("Film aggiunto nella sala " + salaFilm.getNumeroSala() + ": " + salaFilm.getNome());
    }

    public void login(String admin, String inputPassword) {
        // Controlliamo se i dati inseriti sono corretti
        if (this.admin.equals(admin) && super.getPassword().equals(inputPassword)) { 
            isLoggedIn = true; // Supponiamo che isLoggedIn sia nella classe Utente
            System.out.println("Login effettuato con successo");
        } else {
            System.out.println("Nome utente o password errati");
        }
    }

    public void logout() {
        if (isLoggedIn) { 
            isLoggedIn = false;
            System.out.println("Logout effettuato con successo");
        } else {
            System.out.println("Nessun utente loggato");
        }
    }
}