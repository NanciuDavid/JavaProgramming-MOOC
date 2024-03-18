
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     
        while(true) {

            String input = scanner.nextLine();
            if(input.equals("end") == true) {
                break;
            } 
            else {

            int value = Integer.valueOf(input);
            System.out.println((int)Math.pow(value, 3));

             }

 
        } 
    }      

}
