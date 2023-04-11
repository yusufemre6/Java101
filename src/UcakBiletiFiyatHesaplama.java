import java.util.Scanner;

public class Java101 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double perKm=0.10,km,fiyat;
        int yas,yolculukTipi;
        System.out.print("Mesafeyi km türünden giriniz: ");
        km=scan.nextDouble();
        System.out.print("Yaşınızı giriniz: ");
        yas=scan.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        yolculukTipi=scan.nextInt();

        if(0<km&&0<yas&&(yolculukTipi==1||yolculukTipi==2)){
            fiyat=km*perKm;
            if(yas<12){
                fiyat-=(fiyat*0.5);
            } else if (12<=yas&&yas<=24) {
                fiyat-=(fiyat*0.1);
            } else if (65<yas) {
                fiyat-=(fiyat*0.3);
            }

            if(yolculukTipi==2){
                fiyat=2*(fiyat-fiyat*0.2);
            }
            System.out.print("Toplam Tutar: "+fiyat+" TL");
        }
        else{
            System.out.print("Hatalı Veri Girdiniz !");
        }
    }
}
