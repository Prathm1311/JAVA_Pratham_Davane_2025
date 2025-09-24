class Library
{
    static int totalBooks = 0;
    
    static void addBook(int count) 
    {
        totalBooks += count;
        
    } 

    static int getBook() 
    {
        totalBooks -= 1;
        return totalBooks;
    }

    static void displayBooks() 
    {
        System.out.println("Total Books: " + totalBooks);
    }
}


public class LibraryTest {
    public static void main(String[] args) {

        System.out.print("addBook(5) called:  ");
        Library.addBook(5);
        Library.displayBooks(); 
        
        System.out.println();
        
        System.out.print("addBook(3) called:  ");
        Library.addBook(3);
        Library.displayBooks(); 

        System.out.println();
        // if getBook is used totalBook decrease by 1 
        System.out.print("getBook() called:  ");
        Library.getBook();
        Library.displayBooks(); 
    }
}
