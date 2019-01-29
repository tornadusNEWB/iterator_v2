import java.util.ArrayList;
import java.util.List;

// oznaczony na uml jako ConcreteAggregate
// jest to klasa, ktora implementuje interfejs Aggregate

public class BookAggregateImpl implements BookAggregate {

     List bookList;

    public BookAggregateImpl() {
        bookList = new ArrayList();
    }

    @Override
    public void addBook(Book book) {
        bookList.add(book);
    }

    @Override
    public void removeBook(Book book) {
        bookList.remove(book);
    }

    @Override
    public BookIterator getBookIterator() {
        return new BookIteratorImpl(bookList);
    }
}

// w nadpisanych metodach addBook i removeBook bedziemy dodawac i usuwac obiekt Book przekazywany w metodzie
// w napisanej metodzie getBookIterator utworzylem klase BookIteratorImpl zainicjalizowany implementacja Listy