
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Which file should have its contents printed?");
        String searchedFile = scanner.nextLine();

       try(Scanner fileScanner = new Scanner(Paths.get(searchedFile))) {
          
        while(fileScanner.hasNextLine()){
            String lyric = fileScanner.nextLine();

            System.out.println(lyric);
        }

        
       }
       catch (Exception e) {
           System.out.println("Error: " + e.getMessage());
       }


    }
}
