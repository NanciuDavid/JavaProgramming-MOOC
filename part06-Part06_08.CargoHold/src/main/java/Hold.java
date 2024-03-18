import java.util.ArrayList;

public class Hold {
    /*
Make a Hold class with the following methods:

a constructor, to which the maximum weight is given

method public void addSuitcase(Suitcase suitcase) 
that adds the specified luggage to the hold

method public String toString() that returns the string "x suitcases (y kg)"

Store your suitcases in a suitable ArrayList structure.

The class Hold has to ensure that the total weight 
of the suitcases it contains does not exceed the maximum weight.
Should the maximum weight be exceeded due to the addition of new luggage, 
the addSuitcase method should not add the new suitcase.

     */
    private ArrayList<Suitcase> suitcases = new ArrayList<>();
    private int maximumWeight;

    public Hold(int maximumWeight) {
        suitcases = new ArrayList<>();
        this.maximumWeight = maximumWeight;
    }

    public void addSuitcase(Suitcase suitcase) {
        if(this.maximumWeight - suitcase.totalWeight() >= 0) {
            this.suitcases.add(suitcase);
            this.maximumWeight-=suitcase.totalWeight();
        } else {
            System.out.println("Weight exceeded");
        }
    }


    public void printItems() { 

        for(Suitcase suitcase : suitcases) {
            {
                suitcase.printItems();
            }
        }
    }


    public int totalWeight() { 
        int weight = 0 ;
        for(Suitcase suitcase : suitcases) {
            weight+=suitcase.totalWeight();
        }
        return weight;
    }
    public String toString() { 
        return this.suitcases.size() +" suitcases" + " ("+this.totalWeight()+"kg)";
    }
}
