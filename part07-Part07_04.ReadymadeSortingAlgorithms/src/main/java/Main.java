import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void sort(int[] array){
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void sort(String[] array) {
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

    }

    public static void sortIntegers(ArrayList<Integer> integers) {
        Collections.sort(integers);
        System.out.println(integers.toString());
    }
    
    public static void sortStrings(ArrayList <String> string) {
        Collections.sort(string);
        System.out.println(string.toString());
    }
    public static void main(String[] args) {
        // insert test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        sort(array);
        
        String[] arrayString = {"dDavid", "David"};
        sort(arrayString);
        
        ArrayList<Integer> integers = new ArrayList<>(); // Initialize the ArrayList
        integers.add(3);
        integers.add(-2);
        sortIntegers(integers);


    }

}
