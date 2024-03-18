import java.util.*;

public class UserInterface {
    private Scanner scanner = new Scanner(System.in);
    private JokeManager jokelist =  new JokeManager();

    public UserInterface(JokeManager jokelist, Scanner scanner) { 
        this.jokelist = jokelist;
        this.scanner = scanner;
    }

    public void start() { 
        while(true) {
            System.out.println("Commands:");
            System.out.println("1 - add a joke");
            System.out.println("2 - draw a joke");
            System.out.println("3 - list jokes");
            System.out.println("X - stop");

            String command = this.scanner.nextLine();

            //check the commands : 

            switch (command) {
                case "1":
                System.out.println("Write a joke to be added");
                String joke = this.scanner.nextLine();
                this.jokelist.addJoke(joke);   
                    break;

                case "2":
                System.out.println(this.jokelist.drawJoke());
                    break;

                case "3":
                System.out.println("Printing the jokes");
                this.jokelist.printJokes();
                    
                    break;
            
                case "X":
                    return;
            }

        }
    }
}
