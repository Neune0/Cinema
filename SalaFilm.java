import java.util.ArrayList;

public class SalaFilm extends Sala{
    ArrayList<Clienti> clienti = new ArrayList<Clienti>();

    public SalaFilm(String nome, int capacita, int codice, ArrayList<Clienti> clienti){
        super(nome, capacita, codice);
        this.clienti = clienti;
    }

    public ArrayList<Clienti> getClienti(){
        return clienti;
    }

    public void addClienti(Clienti cliente){
        clienti.add(cliente);
    }

    public void removeClienti(Clienti cliente){
        clienti.remove(cliente);
    }

    public void clearSala(){
        clienti.clear();
    }
}
