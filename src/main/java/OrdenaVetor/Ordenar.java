package OrdenaVetor;

public class Ordenar {

    /**
     * Ordena o vetor em ordem crescente
     *
     * @param vetor o vetor a ser ordenado
     */
    public static void ordenarVetor(String[] vetor) {
        int n = vetor.length;
        for (int i = 0; i < n - 1; i++) {
            // Loop externo para controlar o número de iterações
            // Cada iteração coloca o maior elemento restante na posição correta

            for (int j = 0; j < n - i - 1; j++) {
                // Loop interno para comparar elementos adjacentes e fazer trocas se necessário

                if (vetor[j].compareTo(vetor[j + 1]) > 0) {
                    // Comparação entre elementos adjacentes do vetor
                    // Se o elemento atual for maior que o próximo elemento, uma troca é necessária

                    String temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                    // Troca entre os elementos adjacentes usando uma variável temporária
                }
            }
        }

    }

}
