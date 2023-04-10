import java.util.Scanner;

public class Java101 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double fArmut=2.14, fElma=3.67, fDomates=1.11, fMuz=0.95, fPatlican=5.0,kArmut,kElma,kDomates,kMuz,kPatlican,toplamTutar;

        System.out.println("Kaç kilo:");
        System.out.print("1-Armut: ");
        kArmut= input.nextDouble();
        System.out.print("2-Elma: ");
        kElma= input.nextDouble();
        System.out.print("3-Domates: ");
        kDomates= input.nextDouble();
        System.out.print("4-Muz: ");
        kMuz= input.nextDouble();
        System.out.print("5-Patlıcan: ");
        kPatlican= input.nextDouble();

        toplamTutar=fArmut*kArmut+fElma*kElma+fDomates*kDomates+fMuz*kMuz+fPatlican*kPatlican;
        System.out.print("Toplam tutar: "+toplamTutar);
    }
}
