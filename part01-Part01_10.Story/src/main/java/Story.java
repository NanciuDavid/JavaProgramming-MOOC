
import java.util.Scanner;

public class Story {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("I will tell you a story, but I need some information first.");
        System.out.println("What is the main character called?");
        String nameString = scanner.nextLine();
        System.out.println("What is their job?");
        String jobString = scanner.nextLine();
        System.out.println("Here is the story:");
        System.out.println("Once upon a time there was "+nameString+", who was "+jobString+".");
        System.out.println("On the way to work, "+nameString+" reflected on life.");
        System.out.println("Perhaps "+nameString+" will not be "+jobString +" forever.");

        // Write your program here

    }
}
