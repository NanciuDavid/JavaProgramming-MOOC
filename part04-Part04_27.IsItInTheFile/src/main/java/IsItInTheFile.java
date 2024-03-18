
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();


        ArrayList<String> namesFromFile = new ArrayList<>();

        try(Scanner fileScanner = new Scanner(Paths.get(file))) {
    
        while(fileScanner.hasNextLine() == true) { 
            namesFromFile.add(fileScanner.nextLine());
        }

        }
       catch(Exception e) { 
        System.out.println("Reading the file " + file +" failed.");
       }

       if(namesFromFile.contains(searchedFor) == true) {
        System.out.println("Found!");
       } else {
        System.out.println("Not found.");
       }
    }
}
