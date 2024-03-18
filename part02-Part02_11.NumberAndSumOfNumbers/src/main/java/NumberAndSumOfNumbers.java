
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int numberOfValues = 0;
        while (true) {
            System.out.println("Give a number:");
            int value = Integer.valueOf(scanner.nextLine());
            if (value == 0) {
                System.out.println("Number of numbers: " + numberOfValues);
                System.out.println("Sum of the numbers: " + sum);
                break;
            } else {
                sum += value;
                numberOfValues++;
                continue;
            }
        }
    }
}
