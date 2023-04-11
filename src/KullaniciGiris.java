import java.util.Scanner;

public class Java101 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String iUserName,iPassword,userName="Patika",password="Java123",newPassword;

        System.out.print("Kullanıcı adını giriniz: ");
        iUserName=scan.nextLine();

        System.out.print("Şifrenizi giriniz: ");
        iPassword=scan.nextLine();

        if(iUserName.equals(userName)&&iPassword.equals(password)){
            System.out.println("Giriş yaptınız.");
        }
        else{
            System.out.println("Hatalı şifre girdiniz,");
            System.out.print("şifrenizi sıfırlamak ister misiniz(E / H): ");
            String control=scan.nextLine();
            if(control.equals("E")){
                while(true){
                    System.out.print("Yeni şifre: ");
                    newPassword=scan.nextLine();
                    if(newPassword.equals(password)){
                        System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz.\n");
                    }
                    else{
                        password=newPassword;
                        System.out.print("Şifre oluşturuldu.");
                        break;
                    }
                }
            }
        }
    }
}