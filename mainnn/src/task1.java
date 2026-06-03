import java.util.TreeSet;

  class LibraryManager {
    private TreeSet<String> books;

    public LibraryManager() {
        books = new TreeSet<>();
    }

    public void addBook(String title) {
        books.add(title);
    }

    public void removeBook(String title) {
        books.remove(title);
    }

    public boolean isBookAvailable(String title) {
        return books.contains(title);
    }

    public void displayAllBooks() {
        System.out.println("Library Books:");
        for (String book : books) {
            System.out.println(book);
        }
    }
    public void findBooksStartingWith(char letter) {
        System.out.println("Books starting with '" + letter + "':");
        for (String book : books) {
            if (book.startsWith(String.valueOf(letter))) {
                System.out.println(book);
            }
        }
    }}
public class task1{

    public static void main(String[] args) {
        LibraryManager library = new LibraryManager();

        library.addBook("Java Programming");
        library.addBook("Data Structures");
        library.addBook("Algorithms");
        library.addBook("Computer Networks");
        library.addBook("Java Programming"); // Duplicate

        library.displayAllBooks();

        System.out.println("\nAvailable: "
                + library.isBookAvailable("Algorithms"));

        library.removeBook("Computer Networks");

        System.out.println("\nAfter Removal:");
        library.displayAllBooks();

        System.out.println();
        library.findBooksStartingWith('J');

}}