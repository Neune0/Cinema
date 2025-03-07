public class Cliente extends Utente{
    private String indirizzo;
    private String telefono;
    private String email;

    public Cliente(String nome, String password, String indirizzo, String telefono, String email){
        super(nome, password);
        this.indirizzo = indirizzo;
        this.telefono = telefono;
        this.email = email;
    }

    public void login(){
        System.out.println("Login effettuato con successo");
    }

    public void logout(){
        System.out.println("Logout effettuato con successo");
    }

    public void visualizzaDati(){
        System.out.println("Nome: " + getNome());
        System.out.println("Indirizzo: " + indirizzo);
        System.out.println("Telefono: " + telefono);
        System.out.println("Email: " + email);
    }

    public String getIndirizzo(){
        return indirizzo;
    }

    public String getTelefono(){
        return telefono;
    }

    public String getEmail(){
        return email;
    }
}
