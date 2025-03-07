abstract class Sala{
    private String nome;
    private int capacita;
    private int codice;

    public Sala(String nome, int capacita, int codice){
        this.nome = nome;
        this.capacita = capacita;
        this.codice = codice;
    }

    public String getNome(){
        return nome;
    }

    public int getCapacita(){
        return capacita;
    }

    public int getCodice(){
        return codice;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCapacita(int capacita){
        this.capacita = capacita;
    }

    public void setCodice(int codice){
        this.codice = codice;
    }

}