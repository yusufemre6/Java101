import java.util.Scanner;

public class Java101 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double tutar, kdvTutari, toplamTutar;
        System.out.print("Ücret tutarını giriniz: ");
        tutar=input.nextDouble();

        kdvTutari=(tutar>=1000?tutar*0.08:tutar*0.18);

        toplamTutar=kdvTutari+tutar;
        
        System.out.println("KDV tutarı: "+kdvTutari);
        System.out.print("KDV'li toplam tutar: "+toplamTutar);
    }
}