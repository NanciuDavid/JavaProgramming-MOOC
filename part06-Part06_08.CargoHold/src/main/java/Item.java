public class Item {
    /* Create an Item class from which objects can be instantiated to represent
different items. The information to store is the name and weight of the item (kg).

Add the following methods to the class:

Constructor that takes the name and the weight of the item as parameters

Method public String getName(), which returns the item's name

Method public int getWeight(), which returns the item's weight

Method public String toString(), which returns the string "name (weight kg)"

The following is an example of the class in use: */


private String name = "";
private int weight = 0 ;

public Item(String name, int weight) { 
    this.name = name;
    this.weight = weight;
}

public String getName() { 
    if(this.name.isEmpty() == false)
    return this.name;
    return null;
}

public int getWeight() { 
    return this.weight;
}

public String toString() { 
    String itemName = this.getName();
    int itemWeight = this.getWeight();
    if(itemName != null) {
        return itemName + " (" +itemWeight+ " kg)";
    }
    return null;
}






}
