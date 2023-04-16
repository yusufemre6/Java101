import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int sayi=scan.nextInt();
        int sum=0;

        for (int i=1;i<sayi;i++){
            if(sayi%i==0){
                sum+=i;
            }
        }

        if (sum==sayi){
            System.out.print(sayi+" Mükemmel sayıdır.");
        }
        else {
            System.out.print(sayi+" Mükemmel sayı değildir.");
        }
    }
}