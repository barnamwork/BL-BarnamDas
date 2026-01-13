import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input values
        System.out.print("Enter value of a: ");
        int a = input.nextInt();

        System.out.print("Enter value of b: ");
        int b = input.nextInt();

        System.out.print("Enter value of c: ");
        int c = input.nextInt();

        // Integer operations
        int result1 = a + b * c;
        int result2 = a * b + c;
        int result3 = c + a / b;
        int result4 = a % b + c;

        // Output
        System.out.printf(
            "The results of Int Operations are %d, %d, %d, and %d%n",
            result1, result2, result3, result4
        );

        input.close();
    }
}
