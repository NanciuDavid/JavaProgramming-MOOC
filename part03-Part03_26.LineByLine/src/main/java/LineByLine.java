
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String inputFromUser = scanner.nextLine();
            String words[] = inputFromUser.split(" ");
            if (inputFromUser.equals("")) {
                break;
            } else {
                for (int i = 0; i < words.length; i++) {
                    System.out.println(words[i]);
                }
            }
        }
    }
}
