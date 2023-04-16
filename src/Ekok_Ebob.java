import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int ebob=1,ekok;

        System.out.print("Birinci Sayı: ");
        int n1=scan.nextInt();

        System.out.print("İkinci Sayı: ");
        int n2=scan.nextInt();

        int i=1;
        while (i<=(n1>n2?n2:n1)){
            if(n1%i==0&&n2%i==0){
                ebob=i;
            }
            i++;
        }
        System.out.println("EBOB: "+ebob);

        ekok=(n1>n2?n1:n2);
        int k=(n1>n2?n1:n2);
        while(true){
            if(ekok%n1==0&&ekok%n2==0){
                break;
            }
            ekok+=k;
        }
        System.out.print("EKOK: "+ekok);
    }
}