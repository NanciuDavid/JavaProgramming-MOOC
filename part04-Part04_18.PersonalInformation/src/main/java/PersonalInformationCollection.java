
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("First name:");
            String firstName = scanner.nextLine();
            if(firstName.isEmpty() == true) {
                break;
            }
            else { 
                System.out.print("Last name:");
                String lastName = scanner.nextLine();
                System.out.print("Identification number:");
                String indentificationNumber = scanner.nextLine();

                PersonalInformation person = new PersonalInformation(firstName, lastName, indentificationNumber);
                infoCollection.add(person);
            }
        }

        System.out.println();
        for(int i = 0 ; i < infoCollection.size() ; i++) {
            System.out.println(infoCollection.get(i).getFirstName() + " " + infoCollection.get(i).getLastName());
        }

    }
}
