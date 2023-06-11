package OrdenaVetor;

public class Buscar{
    /**
     * Busca um elemento no vetor usando o algoritmo de busca binária.
     *
     * @param vetor    o vetor onde realizar a busca
     * @param elemento o elemento a ser buscado
     * @return true se o elemento for encontrado, false caso contrário
     */
    public static boolean buscarElemento(String[] vetor, String elemento) {
        int esquerda = 0;
        int direita = vetor.length - 1;

        while (esquerda <= direita) {
            int meio = esquerda + (direita - esquerda) / 2;
            int resultadoComparacao = elemento.compareTo(vetor[meio]);

            if (resultadoComparacao == 0) {
                return true;
            }

            if (resultadoComparacao < 0) {
                direita = meio - 1;
            } else {
                esquerda = meio + 1;
            }
        }

        return false;
    }
}
