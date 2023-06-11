import static OrdenaVetor.Buscar.buscarElemento;
import static OrdenaVetor.Exibir.exibirVetor;
import static OrdenaVetor.Ordenar.ordenarVetor;
import static OrdenaVetor.Verificar.verificarVetor;

public class Main {
    /**
     * Método principal que inicia a execução do programa.
     *
     * @param args os argumentos de linha de comando
     */
    public static void main(String[] args) {
        String[] vetor = {
                "Titanic",
                "Avatar",
                "O Poderoso Chefão",
                "Interestelar",
                "Clube da Luta",
                "Pulp Fiction",
                "Matrix",
                "A Origem",
                "O Senhor dos Anéis",
                "Os Vingadores",
                "Gato de botas",
                "Tropa de elite",
                "O Auto da Compadecida",
                "Cidade de Deus",
                "Homem-Aranha: Através do Aranhaverso",
                "Me Chame Pelo Seu Nome"
        };

        System.out.println("Vetor antes da ordenação: ");
        exibirVetor(vetor);

        ordenarVetor(vetor);

        System.out.println("Vetor depois da ordenação: ");
        exibirVetor(vetor);

        String filmeBuscado = "Titanic";
        verificarVetor(vetor, filmeBuscado);
        filmeBuscado = "Lorax";
        verificarVetor(vetor, filmeBuscado);
    }

}
