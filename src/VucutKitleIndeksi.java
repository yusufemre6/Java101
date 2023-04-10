import java.util.Scanner;

public class Java101 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double kilo , boy , indeks;

        System.out.print("Kilo: ");
        kilo=input.nextDouble();

        System.out.print("Boy: ");
        boy=input.nextDouble();

        indeks=kilo/(boy*boy);

        System.out.print("Kitle indeksi: "+indeks);
    }
}