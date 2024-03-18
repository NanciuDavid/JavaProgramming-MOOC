
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //ask for file

        System.out.println("File:");
        String fileName = scan.nextLine();

        System.out.println("Team:");
        String teamName = scan.nextLine();

        
        int games = 0 ; 
        int wins = 0;
        int loses = 0;

        try (Scanner readFromFile = new Scanner(Paths.get(fileName))){
            while(readFromFile.hasNextLine()) {

                String line = readFromFile.nextLine();
                String[] parts = line.split(",");

                if(parts[0].equals(teamName))
                {
                    if(Integer.valueOf(parts[2]) > Integer.valueOf(parts[3]))
                    wins++;
                    else
                    loses++;

                    games++;
                }

                if(parts[1].equals(teamName)) {
                    if(Integer.valueOf(parts[3]) > Integer.valueOf(parts[2]))
                    wins++;
                    else
                    loses++;

                    games++;
                }
                if(line.isEmpty() == true) {
                    continue;
                }
            }
        } catch (Exception e) {
        }

        System.out.println("Games: "+games);
            System.out.println("Wins: " +wins);
            System.out.println("Losses: "+loses);
    }

}
