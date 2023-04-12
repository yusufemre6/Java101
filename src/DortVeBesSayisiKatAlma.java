import java.util.Scanner;

public class Java101 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sayi,toplam=0;
        System.out.print("Sayi Giriniz: ");
        sayi=scan.nextInt();

        for (int i=1,j=1;i<=sayi||j<=sayi;i*=4,j*=5){
            if(i<=sayi){
                System.out.print(i);
            }

            if (j<=sayi){
                System.out.print(" "+j);
            }
            System.out.print("\n");
        }
    }
}
