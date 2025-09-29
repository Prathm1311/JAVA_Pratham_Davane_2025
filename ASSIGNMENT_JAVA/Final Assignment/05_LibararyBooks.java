class LibararyBooks 
{
    private final int BOOK_ID; 
    private String title;

    public LibararyBooks(int id , String title) {
        BOOK_ID = id;
        this.title = title;
    }

    public void showDetails() {
        System.out.println("Book ID: " + BOOK_ID + ", Title: " + title);
    }

    public static void main(String[] args) {
        LibararyBooks book1 = new LibararyBooks(1, "Java Programming");
        LibararyBooks book2 = new LibararyBooks(2, "Python Programming");
        
        book1.showDetails();
        book2.showDetails();

        //book2.BOOK_ID = 2;
    }
    
}
