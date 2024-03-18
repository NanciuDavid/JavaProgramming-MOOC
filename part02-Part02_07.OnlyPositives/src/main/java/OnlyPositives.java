
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Give a number:");
            int value1 = Integer.valueOf(scanner.nextLine());
            if (value1 == 0) {
                break;
            } else if (value1 < 0) {
                System.out.println("Unsuitable number");
                continue;
            } else if (value1 > 0) {
                System.out.println(value1 * value1);
            }
        }

    }
}
