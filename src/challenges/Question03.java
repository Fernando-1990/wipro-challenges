package challenges;


import java.util.Scanner;

/**
 * A classe Question03 contém métodos para realizar operações de divisão
 * com entrada do usuário e tratamento de exceções para evitar divisão por zero.
 */
public class Question03 {
    /**
     * O método execute solicita ao usuário para inserir um dividendo e um divisor,
     * e executa a divisão dos números fornecidos.
     *
     * <p>Esse método usa {@link Scanner} para capturar a entrada do usuário
     * e chama o método {@link #divide(int, int)} para calcular o resultado.</p>
     */
    public static void execute() {
        System.out.println("Executing question 03.");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a dividend");
        int a = sc.nextInt();

        System.out.println("Enter a divisor");
        int b = sc.nextInt();

        int result = divide(a,b);
        System.out.println("Result: " + result);
    }


    /**
     * O método divide realiza a divisão de dois números inteiros.
     *
     * <p>Esse método trata a exceção {@link ArithmeticException} para evitar
     * divisões por zero. Se a divisão por zero ocorrer, uma mensagem de erro
     * é exibida e o método retorna 0 como valor padrão.</p>
     *
     * @param a O dividendo (inteiro)
     * @param b O divisor (inteiro)
     * @return O resultado da divisão entre os dois números, ou 0 em caso de divisão por zero
     */
    public static int divide(int a, int b) {
        try {
            return a / b;
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
            return 0;
        }
    }
}
