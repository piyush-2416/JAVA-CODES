import java.lang.reflect.Array;
import java.util.Arrays;

public class Prectice {
  public static void main(String[] args) {
    int[] arr = { 3,5,2,6,7 };

    for (int i = 0; i < arr.length ; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i]%2!= 0) {
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;

        }

      }
      System.out.println(arr[i]);

    }

  }
}
