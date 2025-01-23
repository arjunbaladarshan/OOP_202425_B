import java.util.Scanner;
class BankAccount{
    String accountHolderName;
    private int balance;
    int accountNumber;

    void setData(String name, int bal, int accNo){
        accountHolderName = name;
        balance = bal;
        accountNumber = accNo;
    }

    int getBalance(){
        return balance;
    }

    void setBalance(int bal){
        if(bal<0){
            System.out.println("Insuffient Balance\n Operation Stoped");
        }
        else{
            balance = bal;
        }
        
    }
    
}
public class BankDemo{
    public static void main(String[] args){
        BankAccount acc1 = new BankAccount();
        acc1.setData("arjun",12,1234);

        Scanner sc = new Scanner(System.in);

        while(true){

            System.out.println("Enter operation \n Press 1 for Deposite \n Press 2 for withdraw \n Press Any Other to Exit");
            int op = sc.nextInt();

            if(op==1){
                System.out.println("Enter Amount to Deposite");
                int amount = sc.nextInt();
                acc1.setBalance(acc1.getBalance() + amount);
                System.out.println("Updated Balance = "+acc1.getBalance());
            }
            else if(op==2){
                System.out.println("Enter Amount to Withdraw");
                int amount = sc.nextInt();
                acc1.setBalance(acc1.getBalance() - amount);
                System.out.println("Updated Balance = "+acc1.getBalance());
            }
            else{
                break;
            }

        }
    }
}