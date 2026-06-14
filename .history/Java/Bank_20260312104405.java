class Account{
    public String name;
    protected String email;
   private String password;
}

public class Bank{
    public static void main(String args[]){
        Account account1 = new Account();
        account1.name = "Apna bank";
        account1.email="www.piyushverma.com";
        account1.password="234213";
        System.out.println(account1.password);
    }
}
