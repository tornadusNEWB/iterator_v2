// zaczynamy od klasy Book, ktorej obiekty beda elementami przechowywanymi w ConcreteAggregare i bedziemy iterować się przez te elementy.

public class Book {
    private String isbn;
    private String title;
    private int yearOfRelease;

    public Book(String isbn, String title, int yearOfRelease) {
        this.isbn = isbn;
        this.title = title;
        this.yearOfRelease = yearOfRelease;
    }

    public String getTitle() {
        return title;
    }
}

// stworzylismy 3 zmienne do przechowywania informacji nt. ksiazki
// storzony konstruktor oraz gettera