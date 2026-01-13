public class Problem6 {
    public static void main(String[] args){
        int fee=125000;
        int discountPercentage=10;
        double discount =  fee*discountPercentage/100;
        double finalFee=fee-discount;
        System.out.println("The final fee after discount is Rs."+finalFee + "and discounted amount is Rs."+discount);
    }
}
