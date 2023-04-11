import java.util.Scanner;

public class Java101 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int yil;
        System.out.print("Yıl Giriniz: ");
        yil=scan.nextInt();

        if(yil%4==0&&yil%100!=0){
            System.out.print(yil+" bir artık yıldır !");
        } else if (yil%100==0&&yil%400==0) {
            System.out.print(yil+" bir artık yıldır !");
        }
        else{
            System.out.print(yil+" bir artık yıl değildir !");
        }
    }
}
