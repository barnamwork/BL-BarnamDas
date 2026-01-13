import java.util.Scanner;

public class Problem11 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input values
        System.out.print("Enter Principal: ");
        double principal = input.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        double rate = input.nextDouble();

        System.out.print("Enter Time (in years): ");
        double time = input.nextDouble();

        // Simple Interest calculation
        double simpleInterest = (principal * rate * time) / 100;

        // Output
        System.out.printf(
            "The Simple Interest is %.2f for Principal %.2f, Rate of Interest %.2f and Time %.2f%n",
            simpleInterest,
            principal,
            rate,
            time
        );

        input.close();
    }
}
