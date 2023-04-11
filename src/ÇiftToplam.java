import java.util.Scanner;

public class Java101 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sayi,toplam=0;

        do {
            System.out.print("Sayi Giriniz: ");
            sayi=scan.nextInt();
            if(sayi%4==0){
                toplam+=sayi;
            }
        }while (sayi%2==0&&sayi>=0);

        System.out.print(" Döngü bitti, girilen sayıların toplamı: " + toplam);
    }
}
