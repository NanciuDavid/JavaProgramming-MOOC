
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int biggestAge = -1;
        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty() == true || input.contains(",") == false) {
                break;
            } else {
                String[] words = input.split(",");
                if (Integer.valueOf(words[1]) > biggestAge) {
                    biggestAge = Integer.valueOf(words[1]);
                }
            }
        }
        System.out.println("Age of the oldest: " + biggestAge);
    }
}
