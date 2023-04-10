import java.util.Scanner;

public class Java101 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double a,b,c;
        System.out.println("Lütfen üçgenin a kenarını girin:");
        a=input.nextDouble();
        System.out.print("Lütfen üçgenin a kenarını girin:");
        b=input.nextDouble();

        c=Math.sqrt(a*a+b*b);

        System.out.print("Hipotenüs: "+ c);
    }
}