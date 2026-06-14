class Main {
    public static void main(String[] args) {
    StringBuilder sb=new StringBuilder("My Name is");
    sb.append("piyush");
    sb.insert(5,"verma");
    sb.delete(0, 5);
    sb.reverse( );
    String s=sb.toString();
    sb.append("And i am learing python  ");
    System.out.println(sb);


    }  

}