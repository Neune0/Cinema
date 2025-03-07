public class GestoreCinema extends Utente {
    protected String admin;
    protected String password;

    public GestoreCinema(String admin, String nome, String password) {
        super(nome, password);
        this.admin = "Admin";
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
        System.out.println("Film aggiunto nella sala " + salaFilm.getNumeroSala() + ": " + salaFilm.getNomeFilm());
    }
}