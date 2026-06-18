import java.lang.reflect.Array;
import java.util.Arrays;

public class Prectice {
    // Online Java Compiler
// Use this editor to write, compile and run your Java code online
public static void main(String[] args) {

String s1="silent";
String s2="listen";

char[] arr1=s1.toCharArray();
char[] arr2=s2.toCharArray();

Arrays.sort(arr1);
Arrays.sort(arr2);

if(Arrays.equals(arr1, arr2)){
    System.out.println("Anagrams");

}else{
    System.out.println("NO");
}

}
}