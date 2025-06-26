
import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        long accNum;
        boolean exit = true;

        Bank c1 = new Bank();
        AccountDetails acc = new AccountDetails();

        while (exit) {
            System.out.println("WELCOME TO THE BANK");
            System.out.println("1. Show Accounts");
            System.out.println("2. Add Account");
            System.out.println("3. Remove Account");
            System.out.println("4. Withdraw");
            System.out.println("5. Deposit");
            System.out.println("6. Show Balance");
            System.out.println("7. Exit");

            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice){
                case 1 -> c1.showAccounts();
                case 2 ->{
                    System.out.print("Enter the name of the account: ");
                    name = scanner.nextLine();
                    scanner.nextLine();
                    System.out.print("Enter account number: ");
                    accNum = scanner.nextLong();

                    c1.addAcc();

                }
                case 3 ->{
                    System.out.print("Enter the account number you want to remove: ");
                    accNum = scanner.nextLong();
                    c1.removeAcc(accNum);
                }
                case 4 -> acc.withdraw(acc.balance);
                case 5 ->{
                    acc.deposit(acc.balance);
                }
                case 6 -> acc.showBalance();
                case 7 -> exit = false;

                default -> System.out.println("Enter a valid option");
            }



        }

        scanner.close();
    }
}
