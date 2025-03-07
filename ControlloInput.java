import java.util.Scanner;

public class ControlloInput {

    private Scanner scanner;

    public ControlloInput(Scanner scanner) {
        this.scanner = scanner;
    }

    public int leggiIntero(String messaggio) {
        int valore;
        while (true) {
            System.out.println(messaggio);
            try {
                valore = Integer.parseInt(scanner.nextLine());
                return valore; // Restituisce il valore senza controlli aggiuntivi
            } catch (NumberFormatException e) {
                System.out.println("Inserire un valore numerico");
            }
        }
    }

    public String leggiStringa(String messaggio) {
        System.out.println(messaggio);
        return scanner.nextLine();
    }

    public double leggiDouble(String messaggio) {
        double valore;
        while (true) {
            System.out.println(messaggio);
            try {
                valore = Double.parseDouble(scanner.nextLine());
                return valore;
            } catch (NumberFormatException e) {
                System.out.println("Inserire un valore numerico valido (double)");
            }
        }
    }

    public boolean leggiBoolean(String messaggio) {
        boolean valore;
        while (true) {
            System.out.println(messaggio);
            String input = scanner.nextLine().toLowerCase();
            if (input.equals("true") || input.equals("false")) {
                valore = Boolean.parseBoolean(input);
                return valore;
            } else {
                System.out.println("Inserire 'true' o 'false'");
            }
        }
    }
}
