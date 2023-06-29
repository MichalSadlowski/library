public class Library {
    private String[] books;

    public Library() {
        this.books = new String[100]; // array for 100 books
    }

    public void addBook(String title) {
        // Finding the first free slot for the book
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = title;
                System.out.println("Added book: " + title);
                return;
            }
        }
        System.out.println("Library is full!");
    }

    public void displayBooks() {
        System.out.println("Books available: ");
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                System.out.println((i + 1) + ". " + books[i]);
            }
        }
    }
}