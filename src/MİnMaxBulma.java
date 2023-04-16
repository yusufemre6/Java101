import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceksiniz: ");
        int sayi=scan.nextInt();
        int min=0,max=0;

        for(int i=1;i<=sayi;i++){
            System.out.print(i+". sayıyı giriniz: ");
            int input=scan.nextInt();
            if(i==1){
                min=input;
            }

            if(input>=max){
                max=input;
            }
            else if (input<=min) {
                min=input;
            }
        }
        System.out.println("En büyük sayı: "+max);
        System.out.print("En küçük sayı: "+min);
    }
}