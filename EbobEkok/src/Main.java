import java.util.Scanner;

class EbobEkok {

    public static int ebob(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int ekok(int a, int b) {
        return (a * b) / ebob(a, b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci sayıyı girin: ");
        int sayi1 = scanner.nextInt();

        System.out.print("İkinci sayıyı girin: ");
        int sayi2 = scanner.nextInt();


        int ebobSonuc = ebob(sayi1, sayi2);
        int ekokSonuc = ekok(sayi1, sayi2);

        System.out.println("EBOB: " + ebobSonuc);
        System.out.println("EKOK: " + ekokSonuc);
    }
}
