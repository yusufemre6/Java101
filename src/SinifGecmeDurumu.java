import java.util.Scanner;

public class Java101 {
    public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);

        double mat , muzik, kimya, turkce, tarih , fizik, ortalama, total=0;
        int dersSayisi=0;

        System.out.print("Matematik: ");
        mat=scan.nextDouble();
        if(mat<=100&&0<=mat){
            total+=mat;
            dersSayisi++;
        }

        System.out.print("Muzik: ");
        muzik=scan.nextDouble();
        if(muzik<=100&&0<=muzik){
            total+=muzik;
            dersSayisi++;
        }

        System.out.print("Kimya: ");
        kimya=scan.nextDouble();
        if(kimya<=100&&0<=kimya){
            total+=kimya;
            dersSayisi++;
        }

        System.out.print("Turkce: ");
        turkce=scan.nextDouble();
        if(turkce<=100&&0<=turkce){
            total+=turkce;
            dersSayisi++;
        }

        System.out.print("Fizik: ");
        fizik=scan.nextDouble();
        if(fizik<=100&&0<=fizik){
            total+=fizik;
            dersSayisi++;
        }

        ortalama=total/dersSayisi;
        System.out.println("Ortalamanız: "+ortalama);
        System.out.println(ortalama>=55?"Sınıfı Geçtiniz":"Sınıfta Kaldınız");

    
    }
}