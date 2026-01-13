import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number: ");
        int number1 = input.nextInt();

        System.out.print("Enter second number: ");
        int number2 = input.nextInt();

        // Calculate quotient and remainder
        int quotient = number1 / number2;
        int remainder = number1 % number2;

        // Output
        System.out.printf(
            "The Quotient is %d and Reminder is %d of two number %d and %d%n",
            quotient,
            remainder,
            number1,
            number2
        );

        input.close();
    }
}
