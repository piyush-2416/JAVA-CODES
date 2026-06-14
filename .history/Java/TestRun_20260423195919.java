class TestRun {
     int val;
    Node next;
 
    Node(int val) {
        this.val = val;

    }
    public static void main(String[] args) {

        System.out.println("Program Start");

        // Simple logic (works everywhere)
        int a = 10;
        int b = 20;

        System.out.println("Sum = " + (a + b));

        // Loop example
        System.out.print("Numbers: ");
        for(int i = 1; i <= 119; i++) {
            System.out.print(i + " ->");
        }

        System.out.println("\nProgram End");
    }
}