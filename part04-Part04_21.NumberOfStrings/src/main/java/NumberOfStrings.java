
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int i = 0 ;
        
        while(true) {
            String inputFromUser = scanner.nextLine();
            if(inputFromUser.equals("end") == true)
            {
              break;
            }
            else {
                i++;
            }
        }

        System.out.println(i);
    }
}
