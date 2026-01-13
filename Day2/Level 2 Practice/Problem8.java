import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input details
        System.out.print("Enter name: ");
        String name = input.nextLine();

        System.out.print("Enter from city: ");
        String fromCity = input.nextLine();

        System.out.print("Enter via city: ");
        String viaCity = input.nextLine();

        System.out.print("Enter to city: ");
        String toCity = input.nextLine();

        System.out.print("Enter distance from source to via city (miles): ");
        double fromToVia = input.nextDouble();

        System.out.print("Enter distance from via to destination city (miles): ");
        double viaToFinalCity = input.nextDouble();

        System.out.print("Enter time taken (hours): ");
        double timeTaken = input.nextDouble();

        double totalDistance = fromToVia + viaToFinalCity;
        double speed = totalDistance / timeTaken;

        System.out.printf(
            "%s travelled from %s to %s via %s covering %.2f miles in %.2f hours with an average speed of %.2f mph%n",
            name,
            fromCity,
            toCity,
            viaCity,
            totalDistance,
            timeTaken,
            speed
        );

        input.close();
    }
}
