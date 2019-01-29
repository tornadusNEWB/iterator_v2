// oznaczony na uml jako Aggregate
// interfejs, w ktorym deklarujemy metody do dodawania i zwracania iteratora

public interface BookAggregate {

    void addBook(Book book);

    void removeBook(Book book);

    BookIterator getBookIterator();
}

// w tym interfejsie zadeklarowalismy 3 metody
// addBook i removeBook- mowia same za siebie
// metoda getBookIterator-