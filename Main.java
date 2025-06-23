import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean continueOrNot = true;
        int option;

        Book b1 = new Book();

        while (continueOrNot){

            System.out.println();
            System.out.println("BOOK COLLECTION PROGRAM");
            System.out.println("1. Show Collection");
            System.out.println("2. Add Books");
            System.out.println("3. Remove Books");
            System.out.println("4. Exit ");

            System.out.print("Choose an option you want to do : ");
            option = scanner.nextInt();

            switch (option){
                case 1 -> b1.collection();
                case 2 -> b1.add();
                case 3 -> b1.remove();
                case 4 -> continueOrNot = false;
                default -> System.out.println("Invalid Option!");
            }
        }
        System.out.println("Have a good day!");
    }
}