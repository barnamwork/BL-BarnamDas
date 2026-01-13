import java.util.Scanner;

public class Problem11 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double a=input.nextDouble();
        double b=input.nextDouble();
        input.close();
        double sum=a+b;
        double diff=a-b;
        double prod=a*b;
        double quot=a/b;
        double rem=a%b;

        System.out.println("The sum of "+a+" and "+b+" is: "+sum);
        System.out.println("The difference of "+a+" and "+b+" is: "+diff);
        System.out.println("The product of "+a+" and "+b+" is: "+prod);
        System.out.println("The quotient of "+a+" and "+b+" is: "+quot);
        System.out.println("The remainder of "+a+" and "+b+" is: "+rem);

    }
    
}
