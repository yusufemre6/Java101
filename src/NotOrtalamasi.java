import java.util.Scanner;

public class Java101 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int mat , muzik, kimya, turkce, tarih , fizik;
        double ortalama;

        System.out.print("Matematik: ");
        mat=input.nextInt();

        System.out.print("Muzik: ");
        muzik=input.nextInt();

        System.out.print("Kimya: ");
        kimya=input.nextInt();

        System.out.print("Turkce: ");
        turkce=input.nextInt();

        System.out.print("Tarih: ");
        tarih=input.nextInt();

        System.out.print("Fizik: ");
        fizik=input.nextInt();

        ortalama=(mat+muzik+kimya+turkce+tarih+fizik)/6.0;
        System.out.println(ortalama>=50?"Sınıfı Geçtiniz":"Sınıfta Kaldınız");
    }
}    