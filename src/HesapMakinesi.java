import java.util.Scanner;

public class Java101 {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz: ");
        double n1=scan.nextDouble();
        System.out.print("İkinci sayıyı giriniz: ");
        double n2=scan.nextDouble();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz: ");
        int select= scan.nextInt();
        scan.close();

        switch (select){
            case 1:
                System.out.print("Sonuç: "+(n1+n2));
                break;
            case 2:
                System.out.print("Sonuç: "+(n1-n2));
                break;
            case 3:
                System.out.print("Sonuç: "+(n1*n2));
                break;
            case 4:
                System.out.print("Sonuç: "+(n1/n2));
                break;
        }

    }
}