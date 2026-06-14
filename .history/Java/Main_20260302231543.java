public class Main {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40};
        int number = 20;
        boolean found = false;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == number) {
                found = true;
                break;
            }
        }

        if(found)
            System.out.println("Number Found");
        else
            System.out.println("Number Not Found");
    }
}