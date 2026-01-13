import java.util.Scanner;
public class Problem10 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int height= input.nextInt();
         double inch= height /2.54;
         double feet= inch/ 12.0;

        System.out.printf("The height in inches is %.2f ", inch );
        System.out.printf("The height in feet is %.2f ", feet );
        System.out.println("the height in cm is "+ height);
        input.close();
    }
}
