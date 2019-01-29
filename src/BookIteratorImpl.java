import java.util.List;

// na uml jako ConcreteIterator
// konkretna klasa, ktora implementuje interfejs Iterator
// obiekty tej klasy sledza elementy oraz implementuja operacje dostepu i iteracji na elementach

public class BookIteratorImpl implements BookIterator {

    List bookList;
    int position;
    Book book;

    public BookIteratorImpl(List bookList) {
        this.bookList = bookList;
    }

    @Override
    public Book nextBook() {
        System.out.println("Returning book at position: " + position);
        book = (Book) bookList.get(position);
        position++;
        return book;
    }

    @Override
    public boolean isLastBook() {
        if (position < bookList.size()) {
            return false;
        }
        return true;
    }
}

// w nadpisanej metodzie nextBook() otrzymalismy element (Book objekt) z listy poprzez dodanie indeksu
// w metodzie isLastBook sprawdzaczy czy iterator osiagnal ostatni element z listy. Ta metoda zostanie wywolana przed nextBook(), aby uniknac IndexOutOfBoundsException