import java.util.Scanner;

public class Problem16 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input unit price and quantity
        System.out.print("Enter unit price (INR): ");
        double unitPrice = input.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();

        // Calculate total price
        double totalPrice = unitPrice * quantity;

        // Output
        System.out.printf(
            "The total purchase price is INR %.2f if the quantity %d and unit price is INR %.2f%n",
            totalPrice,
            quantity,
            unitPrice
        );

        input.close();
    }
}
