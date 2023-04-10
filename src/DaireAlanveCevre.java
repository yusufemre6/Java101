import java.util.Scanner;

public class Java101 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double r,alan,cevre,pi=3.14;
        System.out.print("Daire yarıçapı: ");
        r= input.nextDouble();

        alan=pi*r*r;
        cevre=2*pi*r;

        System.out.println("Alan: "+alan+" Çevre: "+cevre);

        double aci, dilimAlan;

        System.out.print("Merkez Açısı Ölçüsü: ");
        aci= input.nextDouble();

        dilimAlan=(*pi(r*r)*aci)/360;
         System.out.print(aci+" derece açılı dilim alanı: "+dilimAlan);
    }
}