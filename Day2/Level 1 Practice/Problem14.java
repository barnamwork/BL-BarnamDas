import java.util.Scanner;

public class Problem14 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input distance in feet
        System.out.print("Enter distance in feet: ");
        double distanceInFeet = input.nextDouble();

        // Conversions
        double distanceInYards = distanceInFeet / 3;          // 1 yard = 3 feet
        double distanceInMiles = distanceInYards / 1760;      // 1 mile = 1760 yards

        // Output
        System.out.printf(
            "The distance is %.2f yards and %.5f miles%n",
            distanceInYards,
            distanceInMiles
        );

        input.close();
    }
}
