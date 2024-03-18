
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sumBirthYear = 0.0;
        String longestName = " ";
        int inputCount = 0;

        while (true) {

            String input = scanner.nextLine();
            if (input.isEmpty() == true) {
                break;
            } else {

                // split the input
                String[] words = input.split(",");

                // increase the count of inputs

                inputCount++;

                // add the birth-years and then divide the sum by inputCount
                sumBirthYear += Double.valueOf(words[1]);

                // set the longest name
                if (words[0].length() > longestName.length()) {
                    longestName = words[0];
                }
            }
        }

        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + sumBirthYear / inputCount * 1.0);
    }
}
