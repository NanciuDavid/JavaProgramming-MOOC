
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String stringVariable = scan.nextLine();
        System.out.println("Give an integer:");
        int intVariable = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        double doubleVariable = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        boolean boolVariable = Boolean.valueOf(scan.nextLine());
        System.out.println("You gave the string "+stringVariable);
        System.out.println("You gave the integer "+intVariable);
        System.out.println("You gave the double "+doubleVariable);
        System.out.println("You gave the boolean "+boolVariable);
    }
}
