import java.util.Scanner;

public class Problem13 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input: perimeter of the square
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = input.nextDouble();

        // Calculate side length
        double side = perimeter / 4;

        // Output
        System.out.printf(
            "The length of the side is %.2f whose perimeter is %.2f%n",
            side,
            perimeter
        );

        input.close();
    }
}
