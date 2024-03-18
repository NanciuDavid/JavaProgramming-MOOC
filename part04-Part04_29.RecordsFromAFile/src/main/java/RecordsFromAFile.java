
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //read the name of the file

        System.out.println("Name of the file:");
        String nameOfTheFile = scanner.nextLine();

        //store the names 

         ArrayList<String> namesFromFile = new ArrayList<>();

        //store ages 

        ArrayList<Integer> agesFromFile = new ArrayList<>();

        //open the file to read from it

        try (Scanner readFromFile = new Scanner(Paths.get(nameOfTheFile))){

            while(readFromFile.hasNextLine()) {

                String line = readFromFile.nextLine();
                String[] parts = line.split(",");

                namesFromFile.add(parts[0]);

                agesFromFile.add(Integer.valueOf(parts[1]));


            //skip possible empty lines from the .txt
                if(line.isEmpty() == true) { 
                    continue;
                }
            }


        } catch (Exception e) {
           System.out.println("File name is incorrect. Try again");
        }


        for(int i = 0 ; i < namesFromFile.size() ; i ++) {
            if(agesFromFile.get(i) != 1)
            System.out.println(namesFromFile.get(i) +", age: "+agesFromFile.get(i)+" years");
            else
            System.out.println(namesFromFile.get(i) +", age: "+agesFromFile.get(i)+" year");
        }
    }
}
