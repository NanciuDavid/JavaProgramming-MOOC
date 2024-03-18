
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumAboveZero = 0;
        int numbersAboveZero = 0;
        double averageAboveZero = 0;
        while (true) {
            int value = Integer.valueOf(scanner.nextLine());
            if (value > 0) {
                sumAboveZero += value;
                numbersAboveZero++;
                continue;
            }
            if (value == 0) {
                if (sumAboveZero == 0) {
                    System.out.println("Cannot calculate the average");
                } else {
                    averageAboveZero = 1.0 * sumAboveZero / numbersAboveZero;
                    System.out.println(averageAboveZero);
                }
                break;
            }

        }
    }
}
