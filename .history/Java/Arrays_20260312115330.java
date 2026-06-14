public class Arrays {
    public static void main(String[] args) {
        int [] arr={2,4,5,6,7,9};
   
 
    int largest=arr[0];
    int secondlar=arr[0];
     for (int i=0;i<arr.length;i++){
        if(arr[i]>largest){
            secondlar=largest;
            largest=arr[i];
        }
    }
System.out.println("Second largest number :" + secondlar);
    }
}
