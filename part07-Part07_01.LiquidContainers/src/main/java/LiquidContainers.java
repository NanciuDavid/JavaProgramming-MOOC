
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstContainerValue = 0;
        int secondContainerValue = 0;
        int maximumCapacity = 100;

        while (true) {

            System.out.println("First:" + firstContainerValue + "/" + maximumCapacity);
            System.out.println("Second:" + secondContainerValue + "/" + maximumCapacity);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            } else {
                String[] parts = input.split(" ");
                String command = parts[0];
                int value = Integer.valueOf(parts[1]);

                if (command.equals("add")) {
                    if (value < 0) {
                        continue;
                    } else if (firstContainerValue + value <= maximumCapacity) {
                        firstContainerValue += value;
                    } else
                        firstContainerValue = maximumCapacity;
                }

                if (command.equals("move")) {
                    if (value < 0 || value > firstContainerValue && firstContainerValue == 0) {
                        continue;
                    } else if (value > firstContainerValue && firstContainerValue != 0) {
                        secondContainerValue = firstContainerValue;
                        firstContainerValue = 0;
                    } else if (value + secondContainerValue >= maximumCapacity) {
                        secondContainerValue = maximumCapacity;
                    } else {
                        firstContainerValue -= value;
                        secondContainerValue = value;
                    }
                }

                // remove only works on second container
                if (command.equals("remove")) {
                    if (value < 0) {
                        continue;
                    }
                    if (value > secondContainerValue) {
                        secondContainerValue = 0;
                    } else {
                        secondContainerValue -= value;
                    }
                }
            }

        }
    }

}
