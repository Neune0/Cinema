public abstract class Utente{
    private String nome; 
    private String password;

    public Utente(String nome, String password){
        this.nome = nome;
        this.password = password;
    }

    public abstract void login();
    public abstract void logout();

    public String getNome(){
        return nome;
    }

    public String getPassword(){
        return password;
    }
}