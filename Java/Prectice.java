import java.lang.reflect.Array;
import java.util.Arrays;

public class Prectice {

  public static void main(String[] args) {
   int[] arr = {1, 2, 4, 16, 17};

Arrays.sort(arr);

int largest = arr[arr.length - 1];

for (int i = 1; i <= largest; i++) {

boolean found = false;

for (int j = 0; j < arr.length; j++) {

if (arr[j] == i) {
found = true;
break;
}
}

if (!found) {
System.out.println(i);
}
} 

  }
}
 
