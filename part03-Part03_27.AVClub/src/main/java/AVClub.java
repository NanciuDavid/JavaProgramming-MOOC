import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean found = true;
        while (true) {

            found = false;
            String inpuString = scanner.nextLine();

            if (inpuString.isEmpty()) {
                break;
            } else {
                String wordsInInput[] = inpuString.split(" ");
                for (int i = 0; i < wordsInInput.length; i++) {
                    if (wordsInInput[i].contains("av")) {
                        System.out.println(wordsInInput[i]);
                        found = true;
                    }
                }
            }

            if (!found) {
                continue; // This will return to the beginning of the while loop
            }
        }
    }
}
