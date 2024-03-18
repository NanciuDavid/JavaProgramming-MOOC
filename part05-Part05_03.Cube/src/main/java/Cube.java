public class Cube {
    private int value;

    public Cube(int value) {
        this.value = value;
    }

    public int getEdge(){
        return this.value;
    }

    public int volume(){
        return this.value*this.value*this.value;
    }

    public String toString(){
        return "The length of the edge is "+this.getEdge()+" and the volume is "+this.volume();
    }
}
