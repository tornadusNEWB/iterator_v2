
// na uml jako Iterator
// intefejs z metodami, ktore pozwalaja klientowi mozliwosc iteracji oraz dają mu dostep do tych elementow

public interface BookIterator {

    Book nextBook();
    boolean isLastBook();
}

// zdeklarowalismy 2 metody do iterowania elementow sekwencyjnie