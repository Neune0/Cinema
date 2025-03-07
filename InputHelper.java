import java.util.Scanner;

public class InputHelper {
    Scanner intScanner = null;
    Scanner stringScanner = null;
    // vanno messi dei controlli sull'input utente per gestire le eccezzioni

    public InputHelper() {
        this.intScanner = new Scanner(System.in);
        this.stringScanner = new Scanner(System.in);
    }

    public void close() {
        this.intScanner.close();
        this.stringScanner.close();
    }

    public int getInt() {
        return this.intScanner.nextInt();
    }

    public String getString() {
        return this.stringScanner.nextLine();
    }
}

