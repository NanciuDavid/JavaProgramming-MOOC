import java.util.*;

public class JokeManager {
    private ArrayList<String> jokes = new ArrayList<>();

    public JokeManager() {
        this.jokes = new ArrayList<>();
    }

    public void addJoke(String joke) {
        this.jokes.add(joke);
    }

    public String drawJoke(){
        if(this.jokes.isEmpty() == true) {
            return "Jokes are in short supply.";
        } else {
            Random random = new Random();
            int index = random.nextInt(jokes.size());
            return jokes.get(index);
        }
    }

    public void printJokes() {
        for(String joke : jokes) {
            System.out.println(joke);
        }
    }
}
