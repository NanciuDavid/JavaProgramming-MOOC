import java.util.Scanner;
import java.util.*;

public class TextUI {
    private Scanner scanner = new Scanner(System.in);
    private SimpleDictionary dictionary = new SimpleDictionary();

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start() {
        while (true) {
            System.out.print("Command:");
            String command = scanner.nextLine();
            if (command.equals("end")) {

                System.out.println("Bye bye!");
                break;

            } else if (command.equals("add")) {

                System.out.print("Word:");
                String word = scanner.nextLine();
                System.out.print("Translation:");
                String translation = scanner.nextLine();
                this.dictionary.add(word, translation);

            } else if (command.equals("search")) {

                System.out.print("To be translated:");
                String wordToBeTranslated = scanner.nextLine();
                if(dictionary.containsKey(wordToBeTranslated) == true){
                System.out.println("Translation: "+this.dictionary.translate(wordToBeTranslated));
                } else {
                    System.out.println("Word " + wordToBeTranslated + " was not found");
                }
                

            } else {

                System.out.println("Unknown command");
            }

        }
    }

}
