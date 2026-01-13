import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of chocolates: ");
        int numberOfChocolates = input.nextInt();

        System.out.print("Enter number of children: ");
        int numberOfChildren = input.nextInt();

        int chocolatesEach = numberOfChocolates / numberOfChildren;
        int remainingChocolates = numberOfChocolates % numberOfChildren;

        System.out.printf(
            "The number of chocolates each child gets is %d and the number of remaining chocolates are %d%n",
            chocolatesEach,
            remainingChocolates
        );

        input.close();
    }
}
