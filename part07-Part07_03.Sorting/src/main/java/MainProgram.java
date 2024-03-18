import java.lang.reflect.Array;
import java.util.*;

public class MainProgram {

    public static int smallest(int[] array) {
        int smallest = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == MainProgram.smallest(array)) {
                return i;
            }
        }
        return 0;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {

        int smallest = table[startIndex];
        for (int i = startIndex + 1; i < table.length; i++) {
            if (table[i] < smallest) {
                smallest = table[i];
            }
        }

        for (int i = startIndex; i < table.length; i++) {
            if (table[i] == smallest)
                return i;
        }
        return 0;
    }

    public static void swap(int[] array, int index1, int index2) {
        int tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }

    public static void sort(int[] array) {
        int index = 0;
        System.out.println(Arrays.toString(array));

        while (index < array.length) {
            
            swap(array, index, indexOfSmallestFrom(array, index));
            System.out.println(Arrays.toString(array));
            
            index += 1;
        }

    }


    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);

    }


}
