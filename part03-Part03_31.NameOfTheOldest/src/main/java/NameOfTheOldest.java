
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int biggestAge = -1;
        String nameOfOldestKid = " ";
        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty() == true) {
                break;
            } else {
                String[] pieces = input.split(",");
                if (Integer.valueOf(pieces[1]) > biggestAge) {
                    biggestAge = Integer.valueOf(pieces[1]);
                    nameOfOldestKid = pieces[0];
                }
            }
        }
        System.out.println("Name of the oldest: " + nameOfOldestKid);

    }
}
