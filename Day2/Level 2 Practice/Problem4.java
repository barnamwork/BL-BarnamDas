import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input Celsius temperature
        System.out.print("Enter temperature in Celsius: ");
        double celsius = input.nextDouble();

        // Conversion
        double fahrenheitResult = (celsius * 9 / 5) + 32;

        // Output
        System.out.printf(
            "The %.2f celsius is %.2f fahrenheit%n",
            celsius,
            fahrenheitResult
        );

        input.close();
    }
}
