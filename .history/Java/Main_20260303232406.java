class Main {
    public static void main(String[] args) {
          int rowSum = 0;
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},{9,7,8}

        };

        for(int i = 0; i < arr.length; i++) {
          

            for(int j = 0; j < arr[i].length; j++) {
               
            }for (int k=0;k<arr[i].length;k++){
             rowSum += arr[i][k];}


            System.out.println(   " Sum = " + rowSum);
        }
    }
}