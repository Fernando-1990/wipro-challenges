package challenges;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * A classe Question02 contém um método para calcular e exibir o número de dias restantes
 * até o final do ano a partir da data atual.
 */
public class Question02 {

    /**
     * O método execute calcula o número de dias restantes até o último dia do ano e exibe o resultado.
     *
     * <p>Este método obtém a data atual usando {@link LocalDate#now()},
     * define a data do último dia do ano e calcula a diferença em dias entre as duas datas
     * usando {@link ChronoUnit#DAYS#between(LocalDate, LocalDate)}.</p>
     *
     * <p>Exemplo de saída:</p>
     * <pre>
     * Executing question 02.
     * There are X days left until the end of the year.
     * </pre>
     */
    public static void execute() {
        System.out.println("Executing question 02.");
        // Data atual
        LocalDate currentDate = LocalDate.now();

        // Último dia do ano
        LocalDate lastDayYear = LocalDate.of(currentDate.getYear(), 12, 31);

        // Calcula a diferença em dias entre as datas
        long leftDays = ChronoUnit.DAYS.between(currentDate, lastDayYear);

        // Exibe o número de dias restantes até o fim do ano
        System.out.println("There are " + leftDays + " days left until the end of the year.");
    }
}
