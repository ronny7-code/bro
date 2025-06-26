public class BankMain {
      public static void main(String[] args) {

        AccountDetails p1 = new AccountDetails("Bijay Tamang");
        Bank c1 = new Bank();

        c1.addAccount(p1);
        System.out.println(c1.accounts);


    }
}
