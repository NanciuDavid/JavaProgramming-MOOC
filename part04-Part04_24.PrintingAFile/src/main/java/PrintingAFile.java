
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingAFile {

    public static void main(String[] args) {


    try(Scanner scanner = new Scanner(Paths.get("data.txt"))) {
  
    //check if all the rows have been read  

    while(scanner.hasNextLine()) {
        String row = scanner.nextLine();
        System.out.println(row);
    }

    }
    catch(Exception e) {
        System.out.println("Error: " + e.getMessage());
    }

    }
}
