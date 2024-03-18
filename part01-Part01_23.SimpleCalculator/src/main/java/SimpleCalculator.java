
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int firstValue = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int secondValue = Integer.valueOf(scanner.nextLine());

        System.out.println(firstValue + " + " + secondValue + " = " + (int)(firstValue+secondValue));
        System.out.println(firstValue + " - " + secondValue + " = " + (int)(firstValue-secondValue));
        System.out.println(firstValue + " * " + secondValue + " = " + (int)(firstValue*secondValue));
        System.out.println(firstValue + " / " + secondValue + " = " + (double)(1.0*firstValue/secondValue));
    }
}

