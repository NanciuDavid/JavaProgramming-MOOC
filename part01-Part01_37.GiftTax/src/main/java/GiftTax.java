
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift?");
        int valueOfTheGift = Integer.valueOf(scan.nextLine());
        if (valueOfTheGift < 5000) {
            System.out.println("No tax!");
        } else if (valueOfTheGift >= 5000 && valueOfTheGift < 25000) {
            System.out.println("Tax : " + (100 + (valueOfTheGift - 5000) * 0.08));
        } else if (valueOfTheGift >= 25000 && valueOfTheGift < 55000) {
            System.out.println("Tax : " + (1700 + (valueOfTheGift - 25000) * 0.1));
        } else if (valueOfTheGift >= 55000 && valueOfTheGift < 200000) {
            System.out.println("Tax : " + (4700 + (valueOfTheGift - 55000) * 0.12));
        } else if (valueOfTheGift >= 200000 && valueOfTheGift < 1000000) {
            System.out.println("Tax : " + (22100 + (valueOfTheGift - 200000) * 0.15));
        } else if (valueOfTheGift > 1000000) {
            System.out.println("Tax : " + (142100 + (valueOfTheGift - 1000000) * 0.17));
        }
    }
}
