import java.util.ArrayList;


public class SalaFilm extends Sala {
    ArrayList<Cliente> clienti = new ArrayList<Cliente>();


    public SalaFilm(String nome, int capacita, int codice, ArrayList<Cliente> clienti){

        super(nome, capacita, codice);
        this.clienti = clienti;
    }


    public ArrayList<Cliente> getClienti() {
        return clienti;
    }

    public void addClienti(Cliente cliente) {
        clienti.add(cliente);
    }

    public void removeClienti(Cliente cliente) {
    
         clienti.remove(cliente);
    }

    public void clearSala() {
        clienti.clear();
    }
}
