class Account{
    public String name;
    protected String email;

}

public class Bank{
    public static void main(String args[]){
        Account account1 = new Account();
        account1.name = "Apna bank";
        account1.email="www.piyushverma.com";
        System.out.println(account1.name);
    }
}
