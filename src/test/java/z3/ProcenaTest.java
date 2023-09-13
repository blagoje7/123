package z3;

import junit.framework.TestCase;
import org.mockito.InOrder;
import z3.util.KnjigaMatcher;

import static org.mockito.Mockito.*;

public class ProcenaTest extends TestCase {

    public void testOdrediCenu() {

        Knjiga k = new Knjiga("1234","naslov","autor");

        Procenitelj procenitelj = mock(Procenitelj.class);
        Procenitelj pomocnik = mock(Procenitelj.class);

        Procena instance = new Procena(procenitelj,pomocnik);

        instance.odrediCenu(k);

        KnjigaMatcher km = new KnjigaMatcher(k.getISBN());

        InOrder inOrder = inOrder(procenitelj,pomocnik);

        inOrder.verify(procenitelj).izvrsiProcenu(argThat(km));
        inOrder.verify(procenitelj).proveriStetu(argThat(km));
        inOrder.verify(procenitelj).izvrsiProcenu(argThat(km));
        inOrder.verify(pomocnik, times(2)).detaljnaAnaliza(argThat(km));
        inOrder.verify(pomocnik).izvrsiProcenu(argThat(km));
        inOrder.verify(procenitelj).izvrsiProcenu(argThat(km));


        verify(procenitelj,times(3)).izvrsiProcenu(argThat(km));
        verify(procenitelj,times(1)).proveriStetu(argThat(km));
        verify(pomocnik,times(2)).detaljnaAnaliza(argThat(km));
        verify(pomocnik,times(1)).izvrsiProcenu(argThat(km));

    }

    public void testCena(){
        Knjiga k = new Knjiga();

        int expRes = 300;
        String result = k.getISBN();

    }
}