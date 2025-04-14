
class OnlineLibrary{
    String[] books;
    int no_of_books;
    OnlineLibrary(){
        this.books = new String[10];
        this.no_of_books = 0;
    }
    void addBooks(String book){
        this.books[no_of_books] = book; // add books
        no_of_books++; // increase the number of books
        System.out.println(book+" book has been added");
    }
    void showAvailableBooks(){
        System.out.println("Available books are : ");
        for (int i = 0; i < this.books.length; i++){
            if (books[i] == null){
                continue;
            }
            System.out.println(books[i]);
        }
    }

    void issueBooks(String book){
        for (int i = 0; i < this.books.length; i++){
            if (this.books[i].equalsIgnoreCase(book)){
                System.out.println(book+" : Book has been issued.");
                this.books[i] = null;
                return;
            }
        }
        System.out.println("This book issued to another person.");
    }

    void returnBook(String book){
        this.books[no_of_books] = book;
        System.out.println(book+" : book has been returned");
    }
}
public class Library {
    public static void main(String[] args) {
        // implement a library in java class library
        // Methods : issueBook, returnBook, showAvailableBooks
        // Properties : Array to store the available books,
        // Array to store the issued books

        OnlineLibrary publicLibrary = new OnlineLibrary();
        System.out.println("*********************************************************************");
        publicLibrary.addBooks("Rich Dad Poor Dad");
        publicLibrary.addBooks("DSA");
        publicLibrary.addBooks("C Programming");
        System.out.println("*********************************************************************");
        publicLibrary.showAvailableBooks();
        System.out.println("*********************************************************************");
        publicLibrary.issueBooks("DSA");
        System.out.println("*********************************************************************");
        publicLibrary.showAvailableBooks();
        System.out.println("*********************************************************************");
//        publicLibrary.issueBooks("DSA");
        System.out.println("*********************************************************************");
        publicLibrary.returnBook("DSA");
        System.out.println("*********************************************************************");
        publicLibrary.showAvailableBooks();
        System.out.println("*********************************************************************");
    }
}
