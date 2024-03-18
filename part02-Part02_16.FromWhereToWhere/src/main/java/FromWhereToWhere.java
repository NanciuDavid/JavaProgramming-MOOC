
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Where to?");
        int value = Integer.valueOf(scanner.nextLine());
        System.out.print("Where from?");
        int value2 = Integer.valueOf(scanner.nextLine());
        for (int i = value2; i <= value; i++) {
            System.out.println(i);
        }
    }
}
