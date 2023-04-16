import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {

        boolean asalMi=true;

        for (int i=2;i<=100;i++){
            for (int j=2;j<i;j++){
                if (i%j==0){
                    asalMi=false;
                    break;
                }
            }
            if (asalMi){
                System.out.print(i+" ");
            }
            asalMi=true;
        }
    }
}