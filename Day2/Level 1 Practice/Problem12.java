import java.util.Scanner;

public class Problem12 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input base and height (in inches)
        System.out.print("Enter base in inches: ");
        double base = input.nextDouble();

        System.out.print("Enter height in inches: ");
        double height = input.nextDouble();

        // Area in square inches
        double areaInSqInches = 0.5 * base * height;

        // Conversion: 1 inch = 2.54 cm
        double areaInSqCm = areaInSqInches * 2.54 * 2.54;

        // Output
        System.out.printf(
            "Area of the triangle is %.2f square inches and %.2f square centimeters%n",
            areaInSqInches,
            areaInSqCm
        );

        input.close();
    }
}

  