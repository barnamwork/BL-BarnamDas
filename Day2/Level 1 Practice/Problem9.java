import java.util.Scanner;
public class Problem9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int fee= input.nextInt();
        int discountPercentage=10;
        double discount =  fee*discountPercentage/100;
        double finalFee=fee-discount;
        System.out.println("The final fee after discount is Rs."+finalFee + "and discounted amount is Rs."+discount);
        input.close();
    }
}
