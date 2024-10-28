package challenges;


import java.util.Scanner;

public class Question03 {
    public static void execute() {
        System.out.println("Executing question 03.");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a dividend");
        int a = sc.nextInt();

        System.out.println("Enter a divisor");
        int b = sc.nextInt();

        divide(a,b);
    }


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
