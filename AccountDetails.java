
public class AccountDetails {

    double balance;
    String name;
    long accNum;

    public AccountDetails() {
    }

    public void showBalance(){
        System.out.println("Balance : Rs." + balance);
    }

    public double deposit(double balance) {
        if (balance < 0) {
            System.out.println("Balance cannot be in negative");
        } else {
            balance += this.balance;
        }
        return balance;
    }

    public double withdraw(double balance){
        if(balance < this.balance){
            System.out.println("Insufficient Balance");
        }
        else {
            balance -= this.balance;
        }
        return balance;
    }

    @Override
    public String toString(){
        return "Name : " + this.name +
                "Account Number : " + this.accNum +
                "Current Balance : " + this.balance;
    }
}
