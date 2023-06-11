package OrdenaVetor;

import org.junit.Test;
import static org.junit.Assert.*;

public class OrdenarTest {
    @Test
    public void testOrdenarVetorVazio() {
        String[] vetor = {};
        Ordenar.ordenarVetor(vetor);
        assertArrayEquals(new String[]{}, vetor);
    }

    @Test
    public void testOrdenarVetorUnicoElemento() {
        String[] vetor = {"banana"};
        Ordenar.ordenarVetor(vetor);
        assertArrayEquals(new String[]{"banana"}, vetor);
    }

    @Test
    public void testOrdenarVetorDoisElementos() {
        String[] vetor = {"banana", "amora"};
        Ordenar.ordenarVetor(vetor);
        assertArrayEquals(new String[]{"amora", "banana"}, vetor);
    }
}
