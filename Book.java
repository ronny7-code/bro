import java.util.ArrayList;
import java.util.Scanner;

public class Book {
Scanner scanner = new Scanner(System.in);
    private String title;
    private String author;
    private int ISBN;
    int noOfBooksToAdd;
    String nameOfBooksToRemove;
    int indexOfBook;

    ArrayList<Book> books = new ArrayList<>();

    public Book(){

    }

    public Book(String title, String author, int ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void add() {
        System.out.print("Enter the number of books you want to store: ");
        noOfBooksToAdd = scanner.nextInt();

        for (int i = 0; i < noOfBooksToAdd; i++) {
            System.out.print("Enter title: ");
            title = scanner.nextLine();
            title = scanner.nextLine();
            System.out.print("Enter author name: ");
            author = scanner.nextLine();
            System.out.print("Enter ISBN: ");
            ISBN = scanner.nextInt();

            books.add(new Book(title, author, ISBN));
        }
    }

    public void remove(){
        // System.out.print("Enter the number of books you want to remove: ");
        // noOfBooksToRemove = scanner.nextInt();

        // for (int i = 0; i < noOfBooksToRemove; i++) {
        //     System.out.println("Enter the index of the book to remove from the collection: ");
        //     indexOfBook = scanner.nextInt();
        //     books.remove(indexOfBook);
        // }

        System.out.println("Enter the name of the book you want to delete: ");
        nameOfBooksToRemove = scanner.nextLine();

        for(int i = 0; i < books.length(); i++){
            if(nameOfBooksToRemove.equals(i))
        }


    }

    public void collection(){
        if(books.isEmpty()){
            System.out.println("\nCollection is empty");
        }
        else{
            System.out.println("Books available :");
            for(Book collection : books){
                System.out.println("\n" + collection);
            }
        }
    }

    @Override
    public String toString(){
        return "Title : " + title +
                "\nAuthor : " + author +
                "\nISBN : " + ISBN;
    }

}
