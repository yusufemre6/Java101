import java.util.Scanner;

public class Java101 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b, c;

        System.out.print("A:");
        a=scan.nextInt();
        System.out.print("B:");
        b=scan.nextInt();
        System.out.print("C:");
        c=scan.nextInt();

        if(a<b&&a<c){
            if (c<b){
                System.out.print("A<C<B");
            }
            else{
                System.out.print("A<B<C");
            }
        } else if(b<a&&b<c) {
            if (c<a){
                System.out.print("B<C<A");
            }
            else{
                System.out.print("B<A<C");
            }
        }
        else {
            if (b<a){
                System.out.print("C<B<A");
            }
            else{
                System.out.print("C<A<B");
            }
        }
    }
}
