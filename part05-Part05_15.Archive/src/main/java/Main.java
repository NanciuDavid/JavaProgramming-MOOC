
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Item> archive = new ArrayList<>();

        while (true) {
            System.out.println("Identifier? (empty will stop)");

            String identifier = scanner.nextLine();

            if (identifier.isEmpty()) {
                break;
            } else {
                System.out.println("Name? (empty will stop)");
                String name = scanner.nextLine();
                if (name.isEmpty()) {
                    break;
                } else {
                    Item archiveIntroduced = new Item(identifier, name);
                    boolean identifierExists = false;
                    // check if the identifier is the same

                    
                    for (Item searchedArchive : archive) {
                        if (archiveIntroduced.getIdentifier().equals(searchedArchive.getIdentifier()))
                            identifierExists = true;
                    }
                    if (!(identifierExists))
                        archive.add(archiveIntroduced);
                }
            }
        }

        System.out.println("==ITEMS==");
        for (Item searchedArchive : archive) {
            System.out.println(searchedArchive);
        }
    }
}
