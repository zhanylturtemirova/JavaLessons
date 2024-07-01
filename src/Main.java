//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Author author = new Author("(Sir Arthur Conan Doyle", 1859);
        Book book = new Book("The Adventures of Sherlock Holmes", author, 1892);

        System.out.println(book.getBookInfo());
        Library library = new Library();
        library.addBook(book);
        Book[] books = library.getBookByAuthor(author).toArray(new Book[0]);
        System.out.println("Books by Sir Arthur Conan Doyle:");
        for (Book b : books){
            System.out.println(b.getBookInfo());
        }
    }
}