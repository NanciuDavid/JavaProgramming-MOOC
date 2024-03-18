
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber;
        int secondNumber;
        System.out.print("First number? ");
        firstNumber = Integer.valueOf(scanner.nextLine());
        System.out.print("Second number? ");
        secondNumber = Integer.valueOf(scanner.nextLine());

        int sum = 0;
        for (int i = firstNumber; i <= secondNumber; i++) {
            sum += i;
        }

        System.out.println("The sum is: " + sum);
    }
}
