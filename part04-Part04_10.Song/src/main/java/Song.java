public class Song {
    private String nameOfTheSong = " '";
    private int lengthOfTheSong = 0; 
    

    public Song(String nameOfTheSong, int length) {
        this.nameOfTheSong = nameOfTheSong ; 
        this.lengthOfTheSong = length;
    }

    public String name() {
        return this.nameOfTheSong;
    }

    public int length() {
         return this.lengthOfTheSong;
    }

}
