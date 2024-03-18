
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        int noBetween = 0 ;


        try (Scanner fileOpened = new Scanner(Paths.get(file))) {
            while(fileOpened.hasNextLine() == true) {
                int number = Integer.valueOf(fileOpened.nextLine());
                if(number >= lowerBound && number <= upperBound) {
                    noBetween ++ ;
                }
            }
        } catch (Exception e) {
           System.out.println("File could not be opened. Try again.");
        }

        System.out.println("Numbers: "+noBetween);
    }
    
   
}
