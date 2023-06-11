package OrdenaVetor;

import static OrdenaVetor.Buscar.buscarElemento;

public class Verificar {
    public static void verificarVetor(String[] vetor, String buscado) {
        if (buscarElemento(vetor, buscado)) {
            System.out.println(buscado + "\" encontrado.");
        } else {
            System.out.println(buscado + "\" não encontrado.");
        }
    }
}
