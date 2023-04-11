import java.util.Scanner;

public class Java101 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double heat;
        System.out.print("Sıcaklığı giriniz: ");
        heat=scan.nextDouble();

        if(heat<5){
            System.out.print("Kayak yapabilirsiniz.");
        }
        else if(heat>25){
            System.out.print("Yüzmeye gidebilirsiniz.");
        }
        else {
            if(heat<10){
                System.out.print("Sİnemaya gidebilirsiniz.");
            }
            else if(heat>15) {
                System.out.print("Piknik yapmaya gidebilirsiniz.");
            }
            else {
                System.out.print("Sinemaya veya pikniğe gidebilirsiniz.");
            }
        }
    }
}        