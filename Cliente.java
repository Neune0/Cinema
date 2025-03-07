public class Cliente extends Utente{
    private String indirizzo;
    private String telefono;
    private String email;
    private boolean isLoggedIn = false;

    public Cliente(String nome, String password, String indirizzo, String telefono, String email){
        super(nome, password);
        this.indirizzo = indirizzo;
        this.telefono = telefono;
        this.email = email;
        this.isLoggedIn = false;
    }

    
    public void login(String indirizzo, String inputPassword) {
        if (this.getIndirizzo().equals(indirizzo) && this.getPassword().equals(inputPassword)) {
            isLoggedIn = true;
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

    public void visualizzaDati(){
        System.out.println("Nome: " + nome);
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

    private String getPassword(){
        return password;
    }

}
