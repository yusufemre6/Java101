import java.util.Scanner;

public class Java101 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double r,alan,cevre,pi=3.14;

        r= input.nextDouble();

        alan=pi*r*r;
        cevre=2*pi*r;

        System.out.print("Alan: "+alan+" Çevre: "+cevre);
    }
}