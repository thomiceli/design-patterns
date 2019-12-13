package Iterator;

import java.util.Iterator;

public class IterateurConcret<T> implements Iterator {

    @Override
    public T next() {
        return null;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public void remove() {
        //...
    }
}
