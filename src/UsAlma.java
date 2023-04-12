import java.util.Scanner;

public class Java101 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sayi,us;
        double total=1;

        System.out.print("Üssü alınacak sayi: ");
        sayi=scan.nextInt();
        System.out.print("Üs kat sayısı:");
        us=scan.nextInt();

        if (us<0){
            for (int i=0;i<-us;i++) {
                total *= sayi;
            }
            total=(1d/total);
        }
        else{
            for (int i=0;i<-us;i++) {
                total *= sayi;
            }
        }
        System.out.print("Sonuç:"+total);
    }
}
