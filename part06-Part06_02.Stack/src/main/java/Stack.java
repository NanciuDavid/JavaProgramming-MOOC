import java.util.ArrayList;

public class Stack {
    private  ArrayList<String> valuesArray = new ArrayList<>();

    public boolean isEmpty() { 
        if(valuesArray.isEmpty() == true)
        return true;

        return false;
    }

    public void add(String value) {
        if(valuesArray.contains(value) == false) {
            valuesArray.add(value);
        }
    }

    public ArrayList<String> values() { 
        return valuesArray;
    }

    //take the last value and remove it from the arraylist

    public String take() { 
        String lastValue = valuesArray.get(valuesArray.size() - 1);
        valuesArray.remove(valuesArray.size() - 1);
        return lastValue;
    }
}
