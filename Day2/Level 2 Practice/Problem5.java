import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input Fahrenheit temperature
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        // Conversion
        double celsiusResult = (fahrenheit - 32) * 5 / 9;

        // Output
        System.out.printf(
            "The %.2f fahrenheit is %.2f celsius%n",
            fahrenheit,
            celsiusResult
        );

        input.close();
    }
}
