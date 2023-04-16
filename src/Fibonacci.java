import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Fibonacci serisi eleman sayısını giriniz:");
        int n = inp.nextInt();
        int prev0=0,prev1=1;

        System.out.print(prev0+" "+prev1+" ");

        for (int i=0;i<n-2;i++){
            System.out.print((prev0+prev1)+" ");
            int tmp=prev0;
            prev0=prev1;
            prev1=tmp+prev1;
        }
    }
}