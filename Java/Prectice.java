import java.lang.reflect.Array;
import java.util.Arrays;

public class Prectice {
  public static void main(String[] args) {
    // number of good pairs
    // int[] arr = { 1, 2, 3, 1, 1, 1 };
    // int count = 0;
    // for (int i = 0; i < arr.length; i++) {
    // for (int j = i + 1; j < arr.length; j++) {
    // if (arr[i] == arr[j]) {
    // count++;
    // System.out.println(arr[i] + "," + arr[j] + " count " + count);
    // }

    // }
    // }
    // search insert position
    // int[] arr = { 1, 2, 3, 4, 5, 6 };
    // int val = 6;
    // for (int i = 0; i < arr.length; i++) {
    // if (arr[i] == val) {
    // System.out.println(i);
    // }
    // }
    // Square of sorted Arrays problem
    // int[] arr={-4,-1,0,3,10};
    // for(int i=0;i<arr.length;i++){
    // arr[i]=arr[i]*arr[i];

    // }Arrays.sort(arr);
    // System.out.println(Arrays.toString(arr));

    // Contain Duplicates
    // int[] arr = { 1, 2, 3, 4 };
    // boolean foundDuplicate=false;
    // boolean[] visited = new boolean[arr.length];
    // for (int i = 0; i < arr.length; i++) {
    // if (visited[i]) {
    // continue;
    // }
    // int count = 1;
    // for (int j = i + 1; j < arr.length; j++) {
    // if (arr[i] == arr[j]) {
    // count++;
    // visited[j] = true;

    // }
    // }
    // if (count >= 2) {
    // foundDuplicate=true;
    // }
    // }
    // System.out.println(foundDuplicate);

    // kid with greatest number of candlies
    // int[] arr = { 3, 5, 1, 7, 1 };
    // int extra = 3;

    // boolean[] newarr = new boolean[arr.length];
    // int largest = arr[0];
    // for (int i = 0; i < arr.length; i++) {

    // if (arr[i] >largest) {
    // largest = arr[i];

    // }
    // int add = arr[i] + extra;

    // if (add >= largest) {
    // System.out.println(newarr[i] = true);
    // System.out.println(arr[i]);

    // } else {
    // // System.out.println(newarr[i]);
    // newarr[i] = false;
    // System.out.println(newarr[i]);
    // System.out.println(arr[i]);
    // }

    // }

    // find the number with even no.of digits
    // int[] arr={12,345,2,4652,232323};
    // int count =0;
    // for(int i=0;i<arr.length;i++){
    // int digit=0;
    // int num=arr[i];
    // while(num>0){
    // digit++;
    // num=num/10;

    // }if(digit%2==0){
    // count++;

    // }
    // }System.out.println(count );

    // Maximum consecutive onces
    // int[] arr={1,1,0,1,1,1};
    // int count=1;int max=0;

    // for(int i=0;i<arr.length;i++){
    // if(arr[i]==1){
    // count++;

    // }
    // else {
    // count=0;

    // }
    // } System.out.println("only count "+count); System.out.println("Math-Max "+
    // Math.max(max,count));

    // Two sum |
    // int[] arr = { 2,3,4 };
    // int target = 7;

    // for (int i = 0; i < arr.length; i++) {
    // for (int j = i + 1; j < arr.length; j++) {

    // int add = arr[i] + arr[j];
    // if (add == target) {
    // System.out.println(i + "," + j);
    // }
    // }
    // }
    // Two sum ||
    // int[] arr = { 2, 7, 11, 15 };
    // int target = 9;

    // for (int i = 0; i < arr.length; i++) {
    // for (int j = i + 1; j < arr.length; j++) {

    // int add = arr[i] + arr[j];
    // if (add == target) {
    // System.out.println(i + "," + j);
    // }
    // }
    // }

    // Move Zeros
    // int[] arr = { 3, 0, 5, 0, 6, 0 };
    // for (int i = 0; i < arr.length; i++) {
    // for (int j = i + 1; j < arr.length; j++) {
    // if (arr[i] == 0 && arr[j]!=0) {
    // int temp = arr[i];
    // arr[i] = arr[j];
    // arr[j] = temp;
    // break;
    // }
    // }

    // System.out.println(arr[i]); }
    // Two sum |||
    int[] arr = { -1, 0, 1, 2, -1, -4 };
    int target = 0;

    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        for (int k = j + 1; k < arr.length; k++) {
          int add = arr[i] + arr[j] + arr[k];
          if (add == target) {
            System.out.println(arr[i] + "," + arr[j] + "," + arr[k]);
          }
        }
      }
    }

  }

}
