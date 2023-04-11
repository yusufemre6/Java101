import java.util.Scanner;

public class Java101 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sayi,toplam=0,sayac=0;
        double ortalama;
        System.out.print("Sayi Giriniz: ");
        sayi=scan.nextInt();

        for(int i=1;i<sayi;i++){
            if(i%3==0&&i%4==0){
                toplam+=i;
                sayac++;
            }
        }
        ortalama=toplam/sayac;
        System.out.print("Girilen sayıya kadar 3 ve 4 bölünebilen sayıların ortalaması:"+ortalama);
    }
}
