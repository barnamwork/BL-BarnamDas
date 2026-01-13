import java.util.Scanner;

public class Problem12 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input weight in pounds
        System.out.print("Enter weight in pounds: ");
        double weightInPound = input.nextDouble();

        // Conversion
        double weightInKg = weightInPound / 2.2;

        // Output
        System.out.printf(
            "The weight of the person in pound is %.2f and in kg is %.2f%n",
            weightInPound,
            weightInKg
        );

        input.close();
    }
}
