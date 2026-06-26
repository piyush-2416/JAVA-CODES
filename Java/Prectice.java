import java.lang.reflect.Array;
import java.util.Arrays;

public class SmallestElement {
    public static void main(String[] args) {

        int[] arr = {25, 8, 45, 10, 30};

        int smallest = arr[0];

        for (int num : arr) {

            if (num < smallest) {
                smallest = num;
            }

        }

        System.out.println("Smallest Element = " + smallest);

    }
}
