import java.util.Scanner;

public class Java101 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sayi,total=0;

        System.out.print("Sayı giriniz: ");
        sayi = scan.nextInt();

        while(sayi!=0){
            total+=(sayi%10);
            sayi/=10;
        }
        System.out.print("Toplam: "+total);
    }
}
