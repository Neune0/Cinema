import java.util.ArrayList;

public class Cinema {
    ArrayList<Utente> utenti;
    ArrayList<Sala> sale1;

    public Cinema() {
        this.utenti = new ArrayList<>();
        this.sale1 = new ArrayList<>();
    }

    public void addUtente(Utente utente) {
        utenti.add(utente);
        System.out.println("Hai aggiunto " + utente + " in qualcosa che poi vediamo.");
    }

    public void addSala(Sala sale) {
        sale1.add(sale);
        System.out.println("Hai aggiunto " + sale1 + " al cinema");
    }

    public Utente trovaUtente(String nome) {
        for (Utente nome1 : utenti) {
            if (nome1.getNome().equalsIgnoreCase(nome)) {
                return nome1;
            }
        }
        return null;
    }

    public Sala trovaSala(String nome) {
        for (Sala nome2 : sale1) {
            if (nome2.getNome().equalsIgnoreCase(nome)) {
                return nome2;
            }
        }
        return null;
    }

    public void removeUtente(String nome) {
        for (Utente nomeUtenteDaEliminare : utenti) {
            if (nomeUtenteDaEliminare.getNome().equalsIgnoreCase(nome)) {
                utenti.remove(nomeUtenteDaEliminare);
            }
        }
        System.out.println("Utente rimosso correttamente.");

    }

    public void removeSala(String nome) {
        for (Sala nomeSalaDaEliminare : sale1) {
            if (nomeSalaDaEliminare.getNome().equalsIgnoreCase(nome)) {
                sale1.remove(nomeSalaDaEliminare);
            }
        }
        System.out.println("Utente rimosso correttamente.");

    }

}
