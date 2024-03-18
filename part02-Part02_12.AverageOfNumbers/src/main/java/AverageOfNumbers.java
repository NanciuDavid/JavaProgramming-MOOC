
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int numberOfValues = 0;
        double average;
        while (true) {
            System.out.println("Give a number:");
            int value = Integer.valueOf(scanner.nextLine());
            if (value == 0) {
                average = 1.0 * sum / numberOfValues;
                System.out.println("Average of the numbers: " + average);
                break;
            } else {
                sum += value;
                numberOfValues++;
                continue;
            }
        }
    }
}
