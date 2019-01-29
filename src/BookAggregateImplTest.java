public class BookAggregateImplTest {

    public static void main(String[] args) {

        // stworzone obiekty
        Book book1 = new Book("21-21", "harryPotter", 2002);
        Book book2 = new Book("21-1212", "Muza", 2012);
        Book book3 = new Book("55-66", "owoceSwiata", 2013);

        // stworzony BookAggregateImpl
        BookAggregate bookAggregate = new BookAggregateImpl();
        // wywolania metody addBook() aby dodac nasze ksiazki do BookAggregateImpl
        bookAggregate.addBook(book1);
        bookAggregate.addBook(book2);
        bookAggregate.addBook(book3);

        System.out.println("Book list");
        // wywolujemy metode printBook(), w ktorej przekazujemy obiekt BookAggregate wypelniony elementami Book
        printBook(bookAggregate);


        System.out.println("----book list after remove----");
        // usuwamy element
        bookAggregate.removeBook(book1);
        printBook(bookAggregate);

    }
    private static void printBook(BookAggregate bookAggregate) {
        BookIterator bookIterator = bookAggregate.getBookIterator();
        //petla while bedzie sie wykonywala az do osiagniecia ostatniego elementu
        while (!bookIterator.isLastBook()) {
            Book book = bookIterator.nextBook();
            System.out.println(book.getTitle());
        }
    }
}


