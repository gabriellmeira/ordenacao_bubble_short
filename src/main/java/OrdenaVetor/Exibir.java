package OrdenaVetor;

public class Exibir {

    /**
     * Exibe os elementos do vetor.
     *
     * @param vetor o vetor a ser exibido
     */
    public static void exibirVetor(String[] vetor) {
        for (String elemento : vetor) {
            System.out.println(elemento);
        }
        System.out.println();
    }
}
