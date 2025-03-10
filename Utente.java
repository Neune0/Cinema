

public abstract class Utente{
    protected String nome; 

    protected String password;

    public Utente(String nome, String password) {
        this.nome = nome;
        this.password = password;
    }

    public String getNome() {
        return nome;
    }

    public String getPassword() {
        return password;
    }

    public abstract void login(String x, String y);
    public abstract void logout();

}