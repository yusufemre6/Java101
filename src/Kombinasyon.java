import java.util.Scanner;

public class Java101 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sayi,n,r,kombinasyon,nFak=1,rFak=1,nrFak=1;

        while (true){
            System.out.print("C(n,r) kombinasyonu için(n): ");
            n=scan.nextInt();
            System.out.print("C(n,r) kombinasyonu için(r): ");
            r=scan.nextInt();
            if(n>=r){
                for (int i=1,j=1,k=1;i<=n||j<=r||k<=(n-r);i++,j++,k++){
                    if(i<=n){
                        nFak*=i;
                    }
                    if(j<=r){
                        rFak*=j;
                    }
                    if(k<=(n-r)){
                        nrFak*=k;
                    }
                }
                kombinasyon=nFak / (rFak * nrFak);
                System.out.print("C(n,r) = "+kombinasyon);
                break;
            }
            else {
                System.out.print("n sayısı r sayısından büyük veya eşit olmalıdır.\n yeniden giriniz...");
            }
        }
    }
}
