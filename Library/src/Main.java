public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook("Solaris");
        library.addBook("Catch 22");
        library.addBook("1984");

        library.displayBooks();
    }
}