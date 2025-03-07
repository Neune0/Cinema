public class GestoreCinema extends Utente {
    protected String admin;
    protected String password;


    GestoreCinema(String admin, String nome, String password) {
        super(nome, password);
        this.admin = "Admin";

    }

    public String getAdmin() {
        return admin;

    public void setAdmin(String admin) {
        this.admin = admin;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void login() {

    }

    public void logout() {}
    }
}