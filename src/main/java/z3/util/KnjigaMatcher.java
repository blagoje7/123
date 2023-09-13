package z3.util;

import org.mockito.ArgumentMatcher;
import z3.Knjiga;

public class KnjigaMatcher implements ArgumentMatcher<Knjiga> {

    public String isbn;

    public KnjigaMatcher(String isbn){
        this.isbn=isbn;
    }

    @Override
    public boolean matches(Knjiga knjiga) {
        boolean match = this.isbn.equals(knjiga.getISBN());
        return match;
    }

}
