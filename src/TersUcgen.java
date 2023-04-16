import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.print("Basamak Sayısı: ");
        int sayi=scan.nextInt();

        for (int i=sayi-1;i>=0;i--){
            for (int j=0;j<sayi-i-1;j++){
                System.out.print(" ");
            }
            for (int k=0;k<2*i+1;k++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }
}