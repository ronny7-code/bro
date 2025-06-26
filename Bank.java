import java.util.ArrayList;

public class Bank {

    double balance = 0;

    ArrayList<AccountDetails> accounts = new ArrayList<>();

    public void addAccount(AccountDetails account){
        accounts.add(account);
    }


    public void showBalance(){
        System.out.println("Balance : Rs." + balance);
    }

    public double deposit(double balance){
        balance += this.balance;
        return balance;
    }

    public double withdraw(double balance){
        balance -= this.balance;
        return balance;
    }


}
