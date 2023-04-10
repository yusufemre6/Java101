import java.util.Scanner;

public class Java101 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double km,tutar,acilis=10,min=20,perKm=2.20;

        km=input.nextDouble();

        tutar=(acilis+(perKm*km))>20?(acilis+(perKm*km)):20;

        System.out.print("Tutar: "+tutar);
    }
}