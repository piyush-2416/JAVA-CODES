import java.lang.reflect.Array;
import java.util.Arrays;

public class Prectice {
    // Online Java Compiler
// Use this editor to write, compile and run your Java code online

    public static void main(String[] args) {

  String str="anagram";
  int start=0;
  int end=str.length()-1;
  for(int i=end;i<start;i++){
    if(start.charAt(i)==end.charAt(i)){
        System.out.println("anagrams");
    }else{
        System.out.println("No");
    }
  }
       
    }
}
