
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999

        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times

        ArrayList<Integer> valuesList = new ArrayList<>();

        while (true) {
            int values = Integer.valueOf(scanner.nextLine());
            if (values == 9999) {
                break;
            }
            valuesList.add(values);

        }
        // compute min
        int min = 9999;
        for (int i = 0; i < valuesList.size(); i++) {
            if (valuesList.get(i) < min) {
                min = valuesList.get(i);
            }
        }

        System.out.println("Smallest number: " + min);

        for (int i = 0; i < valuesList.size(); i++) {
            if (valuesList.get(i) == min) {
                System.out.println("Found at index: " + i);
            }
        }
    }
}
