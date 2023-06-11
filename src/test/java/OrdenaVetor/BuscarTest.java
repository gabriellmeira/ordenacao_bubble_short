package OrdenaVetor;
import org.junit.Test;
import static org.junit.Assert.*;

public class BuscarTest {
    @Test
    public void testBuscarElementoInicioVetor() {
        String[] vetor = {"amora", "banana", "laranja", "uva"};
        assertTrue(Buscar.buscarElemento(vetor, "amora"));
    }

    @Test
    public void testBuscarElementoFimVetor() {
        String[] vetor = {"amora", "banana", "laranja", "uva"};
        assertTrue(Buscar.buscarElemento(vetor, "uva"));
    }

    @Test
    public void testBuscarElementoMeioVetor() {
        String[] vetor = {"amora", "banana", "laranja", "uva"};
        assertTrue(Buscar.buscarElemento(vetor, "laranja"));
    }

}
