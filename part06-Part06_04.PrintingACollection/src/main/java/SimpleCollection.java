
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

    public String toString() {
        if (this.getElements().isEmpty()) {
            return "The collection " + this.name + " is empty.";
        } else {

            String elementsInList = "";
            for (String element : this.elements) {
                if (elements.size() <= 1) {
                    elementsInList = element;
                } else {
                    elementsInList = elementsInList + element + "\n";
                }
            }

            if (this.getElements().size() > 1)
                return "The collection " + this.name + " has " + this.getElements().size() + " elements:\n"
                        + elementsInList;

            return "The collection " + this.name + " has " + this.getElements().size() + " element:\n" + elementsInList;
        }
    }

}
