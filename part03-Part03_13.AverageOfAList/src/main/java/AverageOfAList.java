
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        ArrayList<Integer> list = new ArrayList<>();

        while (true) {
            int values = Integer.valueOf(scanner.nextLine());
            if (values == -1) {
                break;
            }

            list.add(values);

        }

        double sum = 0.0;
        for (int i = 0; i < list.size(); i++) {
            sum += 1.0 * list.get(i);
        }

        System.out.println("Average: " + sum / list.size());
    }
}
