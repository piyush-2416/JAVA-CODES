lass Student(){
    String name;
    int age;

 public void PrintInfo(){
    System.out.println(this.name);
    System.out.println(this.age);
 }

    Student() {
        System.out.println("constructor is calling in your code");
    }

    public class oops {
        public static void main(String[] args) {
            Student s1 = new Student();
            s1.name = "piyush";
            s1.age = 19;
            s1.printinfo();
        }
    } 

}