import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int durationOfShow;

        while(true)
        {
            System.out.print("Name:");
            String showName = scanner.nextLine();
            if(showName.isEmpty() == true ) {
                break;
            }
            else {
              System.out.print("Duration:");
               durationOfShow = Integer.valueOf(scanner.nextLine());
            }

            TelevisionProgram tvShow = new TelevisionProgram(showName, durationOfShow);
 
            programs.add(tvShow);
        }

        System.out.println();
        System.out.print("Program's maximum duration?");
        int maximumDuration = Integer.valueOf(scanner.nextLine());

        for(int i = 0 ; i < programs.size() ; i++) {
            if(programs.get(i).getDuration() <= maximumDuration)
            System.out.println(programs.get(i));
        }
    }
}
