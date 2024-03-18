import java.util.ArrayList;

public class Suitcase  {
    private ArrayList<Item> items = new ArrayList<>();
    private int maximumWeight = 0 ; 

    public Suitcase(int maximumWeight) {
        this.items =  new ArrayList<Item>();
        this.maximumWeight = maximumWeight;
    }

    public void addItem(Item item) {
        if(this.maximumWeight - item.getWeight() >= 0) {
        this.items.add(item);
        maximumWeight -= item.getWeight();
    }
    }

    public void printItems(){
        for(Item items : items) { 
            System.out.println(items);
        }
    }

    public Item heaviestItem() {
        Item heaviest = null;
        for(Item item : items) { 
            if (item.getWeight() > maximumWeight) {
            heaviest = item;
            }
        }
        return heaviest;
    }

    public int totalWeight() {
        int sumOfWeights = 0;
        for (Item entry : items) {
            sumOfWeights += entry.getWeight();
        }

        return sumOfWeights;
    }


    public String toString() {
        
        String itemString = "";
        
        if(items.size() == 0){
            itemString = "no items" + " (" + this.totalWeight() + " kg)";
        }
        else if(items.size() == 1){
            itemString = this.items.size() + " item (" + this.totalWeight() + " kg)";
        } else {
            itemString = this.items.size() + " items (" + this.totalWeight() + " kg)";
        }
        
        return itemString;
    }

}
