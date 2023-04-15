import java.util.Scanner;

public class Java101 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        int number=scan.nextInt();
        int sayi=number/2;

        for (int i=0;i<sayi;i++){
            for(int j=0;j<sayi-i;j++){
                System.out.print(" ");
            }
            for (int k=0;k<2*i+1;k++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

        for (int i=(sayi%2==0?sayi-1:sayi);i>=0;i--){
            for(int j=0;j<sayi-i;j++){
                System.out.print(" ");
            }
            for (int k=0;k<2*i+1;k++){
                System.out.print("*");
            }
            System.out.print("\n");
        }




    }
}