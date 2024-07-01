import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    public Library() {
        this.books = new ArrayList<>();
    }
    public void addBook(Book book) {
        this.books.add(book);
    }

    public List<Book> getBookByAuthor(Author author) {
        List<Book> booksByAuthor = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().getName().equals(author.getName())) {
                booksByAuthor.add(book);
            }
        }
        return booksByAuthor;
    }

    public List<Book> getAllBooks() {
        return new ArrayList<>(books);
    }
}
