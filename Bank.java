import java.util.ArrayList;

public class Bank {

    String name;
    long accNum;

    ArrayList<AccountDetails> accounts = new ArrayList<>();

    public void addAcc(){
        accounts.add(new AccountDetails());
    }

    public void removeAcc(long accNum){

        for(int i = 0; i < accounts.size(); i++){
            if(accNum == i){
                accounts.remove(i);
            }
            else{
                System.out.println("Invalid Account Name");
            }
        }
    }

    public void showAccounts(){
        if(accounts.isEmpty()){
            System.out.println("No accounts available");
        }
        else {
            for(AccountDetails acc : accounts){
                System.out.println(acc);
            }
        }
    }
}