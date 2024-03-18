
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        // This exercise is worth five exercise points, and it is
        // gradually extended part by part.

        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about
        // the parts you haven't done, but you'll get points for the finished parts.

        Scanner scanner = new Scanner(System.in);
        // if -1 exit

        int sum = 0;
        int noOfNumbers = 0;
        double average;
        int odd = 0;
        int even = 0;
        System.out.println("Give numbers:");

        while (true) {

            int value = Integer.valueOf(scanner.nextLine());
            if (value == -1) {
                System.out.println("Thx!Bye!");
                System.out.println("Sum: " + sum);
                System.out.println("Numbers: " + noOfNumbers);
                average = 1.0 * sum / noOfNumbers;
                System.out.println("Average: " + average);
                System.out.println("Even: " + even);
                System.out.println("Odd: " + odd);
                break;
            } else if (value > 0) {
                sum += value;
                noOfNumbers++;
            }

            if (value % 2 == 0 && value > 0) {
                even++;
            } else if (value % 2 != 0) {
                odd++;
            }
        }

    }
}
