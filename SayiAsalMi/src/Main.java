import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı gir: "); int sayi= scanner.nextInt();



        boolean asalMi=true;

        if (sayi<1){
            System.out.println("Geçersiz Sayı");
            return;            //fonksiyona cevabı gönder ve bitir.
        }
        if (sayi==1){
            System.out.println("Asal değildir");
            return;
        }
        for(int i=2; i<sayi;i++){
            if (sayi%i==0){
                asalMi=false;
            }
        }
        if (asalMi){
            System.out.println("Sayı asaldır.");
        }
        else{
            System.out.println("Asal değildir.");
        }



    }
}