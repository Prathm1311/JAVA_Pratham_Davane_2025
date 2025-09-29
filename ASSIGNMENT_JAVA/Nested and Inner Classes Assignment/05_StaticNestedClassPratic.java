class Library {
    
    static class Books{
        String title;
        String author;

        public Books(String title, String author) {
            this.title = title;
            this.author = author;
        }

        public void displayBooks()
        {
            System.out.println("Title is: "+this.title);
            System.out.println("Author is: "+this.author);
        }

        
    }
}

class Maincom{
    public static void main(String[] args) {
        
        Library lib = new Library();

        Library.Books book1 = new Library.Books("Java", "James Gosling");
        Library.Books book2 = new Library.Books("C++", "Bjarne Stroustrup");
        
        book1.displayBooks();
        book2.displayBooks();
    }
}
