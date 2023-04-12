import java.util.Scanner;

public class Java101 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sayi;
        double total=0;

        System.out.print("Sayı giriniz: ");
        sayi = scan.nextInt();

        for(int i=1;i<=sayi;i++){
            total+=(1d/i);
        }

        System.out.print("Toplam: "+total);
    }
}
