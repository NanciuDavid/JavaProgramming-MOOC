public class Gift {
private String name = "";
private int weight = 0 ; 

public  Gift(String name, int weight) {
    this.name = name;
    this.weight = weight;
}

public String getName() {
    if(name != null ) {
        return this.name;
    }
    return "";
}

public int getWeight() {
    return this.weight;
}


}


