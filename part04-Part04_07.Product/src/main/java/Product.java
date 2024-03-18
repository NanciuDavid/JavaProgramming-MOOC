public class Product {
    private double price ;
    private int quantity ; 
    private String name ;

    public Product(String initialName, double inititalPrice, int initialQuantity) {
        this.name = initialName ;
        this.quantity = initialQuantity; 
        this.price = inititalPrice;
    }

    public void printProduct() { 
        System.out.println(this.name+","+this.price+","+this.quantity);
    }
}
