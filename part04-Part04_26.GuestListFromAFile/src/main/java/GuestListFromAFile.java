
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class GuestListFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        ArrayList<String> list = new ArrayList<>();
        // implement reading the file here.
        System.out.println("");
        try (Scanner fileScanner = new Scanner(Paths.get(file))) {
          
            while (fileScanner.hasNextLine()) {
                 String name = fileScanner.nextLine();
                 list.add(name);
            }
        }
        catch(Exception e) {
            System.out.println("The file could not be opened.");
        }


        System.out.println("Enter names, an empty line quits.");
        while (true) {
            System.out.println("Enter a name (press Enter to exit):");
            String name = scanner.nextLine();
            
            if (name.isEmpty()) {
                break; // Exit the loop if the name is empty
            } else { 
                if (list.contains(name)) { 
                    System.out.println("The name is on the list");
                } else {
                    System.out.println("The name is not on the list");
                }
            }
        }

        System.out.println("Thank you!");
     
    }
}
