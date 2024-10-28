package challenges;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question01 {
    public static void execute() {
        System.out.println("Executing question 01.");
        List<String> names = Arrays.asList("Ana", "Pedro", "Maria", "Lucas", "Paulo");

        List<String> result = names.stream()
                .filter(name -> name.startsWith("P"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
