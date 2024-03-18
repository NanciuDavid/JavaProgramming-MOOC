
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        if(this.squares > compared.squares) {
            return true;
        }
        return false;
    }

    public int priceDifference(Apartment compared) {
        int priceOne = this.pricePerSquare*this.squares;
        int priceTwo = compared.pricePerSquare*compared.squares;

        int pricesDifference;
        if(this.largerThan(compared) == true) {  pricesDifference = priceOne - priceTwo;
        }
        else{ pricesDifference = priceTwo - priceOne;
        }
        return pricesDifference;
    }

    public boolean moreExpensiveThan(Apartment compared) {
         if(this.squares * this.pricePerSquare > compared.squares * compared.pricePerSquare) {
            return true; } 
     return false;
    }
}
