public class Problem7 {
    public static void main(String[] args){
    int radiusKm= 6378;
    int radiusMiles= radiusKm*62/100;
    double pi=3.14;
    double volumeKm = 4/3*pi*radiusKm*radiusKm*radiusKm;
    double volumeMiles= 4/3*pi*radiusMiles*radiusMiles*radiusMiles;
    System.out.println("Volume of earth in cubic kilometers is "+ String.format("%.2f",volumeKm)+" and volume of earth in cubic miles is "+ String.format("%.2f",volumeMiles));
    }
}
