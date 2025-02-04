class Account{
    String name;
    int balance;
    public Account(String name, int balance){
        this.name = name;
        this.balance = balance;
    }

    public void add10Rs(){
        this.balance += 10;
    }

    public int add20Rs(){
        return this.balance + 20;
    }

}

public class BankingDemo{
    public static void main(String[] agrs){
        Account a1 = new Account("Arjun Bala",15);
        Account a2 = new Account("Darshan Uni",62);

        System.out.println("Before balance = "+a1.balance);
        int tempBal = a1.add20Rs();
        System.out.println("After balance = "+a1.balance);
        System.out.println("After temp balance = "+tempBal);
        
    }
}