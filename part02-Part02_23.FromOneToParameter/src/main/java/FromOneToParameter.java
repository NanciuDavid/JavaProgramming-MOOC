
public class FromOneToParameter {

    public static void main(String[] args) {
        printUntilNumber(5);
    }

    public static void printUntilNumber(int n) {
        int i = 0;

        for (i = 1; i <= n; i++) {
            System.out.println(i);
        }

    }
}
