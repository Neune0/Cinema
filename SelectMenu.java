import java.util.ArrayList;

public class SelectMenu {
    private InputHelper inputHelper;
    private ArrayList<String> options;
    private int choice;

    public SelectMenu(String[] oprions) {
        this.inputHelper = new InputHelper();
        this.options = new ArrayList<>(options);
        this.choice = 0;
    }

    public void setChoice(int choice) {
        this.choice = choice;
    }

    public int getChoice() {
        return this.choice;
    }

    public void close() {
        this.inputHelper.close();
    }

    public void printMenu() {
        for (int i = 0; i < options.size(); i++) {
            System.out.println(i + " - " + options.get(i));
        }
    }

    public void processChoice() {
        this.setChoice(inputHelper.getInt());
    }

    public boolean checkChoice(int choice) {
        return choice >= 0 && choice < options.size();
    }

}