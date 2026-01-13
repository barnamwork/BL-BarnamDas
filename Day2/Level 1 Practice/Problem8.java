import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double km= input.nextDouble();
        double miles= km / 1.609;
        System.out.printf("The distance %.2f km in miles is %.2f%n", km, miles);
        input.close();
    }
    
}
