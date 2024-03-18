import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        // implement here the program that allows the user to enter 
        // book information and to examine them
       
        ArrayList<Books> bookShelf = new ArrayList<>();
       
        while(true) { 
 
            int numberOfPages;
            int publicationYear;
            System.out.print("Title:");
            String titleName = scanner.nextLine();
            if(titleName.isEmpty() == true) {
                break;
            }
            else {
                System.out.print("Pages:");
                numberOfPages = Integer.valueOf(scanner.nextLine());
                System.out.print("Publication year:");
                publicationYear = Integer.valueOf(scanner.nextLine());

                bookShelf.add(new Books(titleName, numberOfPages, publicationYear));

            }
        }


        System.out.println();
        System.out.print("What information will be printed?");
        String prefference = scanner.nextLine();

        if(prefference.equals("everything") == true )  {
            for(int i = 0 ; i < bookShelf.size() ; i ++ ) {
                System.out.println(bookShelf.get(i).getName() + ", " +bookShelf.get(i).numberOfPages() + " pages, " +bookShelf.get(i).publicationYear());
            }
        } else if(prefference.equals("name") == true) {
            for(int i = 0 ; i < bookShelf.size() ; i ++ ) {
                System.out.println(bookShelf.get(i).getName());
        }
    }
}


}
