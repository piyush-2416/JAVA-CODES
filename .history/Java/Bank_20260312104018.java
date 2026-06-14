class Account{
    public String name;
}

public class Bank{
    public static void main(String args[]){
        Account account1 = new Account();
        account1.name = "Apna bank";
        System.out.println(account1.name);
    }
}