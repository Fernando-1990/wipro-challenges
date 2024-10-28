package challenges;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Classe Question01 para demonstrar o uso de Stream API em Java.
 * Esta classe filtra uma lista de nomes para encontrar aqueles que
 * começam com a letra "P" e os transforma em letras maiúsculas.
 */
public class Question01 {
    /**
     * Executa o processo de filtragem e transformação dos nomes.
     * Cria uma lista de nomes, filtra aqueles que começam com "P",
     * converte-os para maiúsculas e imprime o resultado.
     */
    public static void execute() {
        System.out.println("Executing question 01.");
        List<String> names = Arrays.asList("Ana", "Pedro", "Maria", "Lucas", "Paulo");

        // Cria uma lista de nomes
        List<String> result = names.stream()
                .filter(name -> name.startsWith("P")) // Filtra nomes que começam com "P", converte para maiúsculas e armazena em uma nova lista
                .map(String::toUpperCase) // Converte os nomes filtrados para maiúsculas
                .collect(Collectors.toList()); // Coleta os resultados em uma lista

        // Imprime a lista de resultados
        System.out.println(result);
    }
}
