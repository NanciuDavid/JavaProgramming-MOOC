
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String longest() {
        String toReturn = "null";
        if(elements.isEmpty())
        return null;
        else {
        int size = 0 ;
        for(String element : elements) {
            if(element.length() > size) {
                size = element.length();
                toReturn = element;
            }
        }
    }
    return toReturn;

}
}
