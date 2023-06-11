package OrdenaVetor;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class ExibirTest {
    @Test
    public void testExibirVetorVazio() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        String[] vetor = {};
        Exibir.exibirVetor(vetor);

        String expectedOutput = "\n";
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testExibirVetorUnicoElemento() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        String[] vetor = {"amora"};
        Exibir.exibirVetor(vetor);

        String expectedOutput = "amora\n\n";
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testExibirVetorDoisElementos() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        String[] vetor = {"amora", "banana"};
        Exibir.exibirVetor(vetor);

        String expectedOutput = "amora\nbanana\n\n";
        assertEquals(expectedOutput, outContent.toString());
    }

}