import java.util.Scanner;

class AsalCarpanlar {

    public static boolean asalMi(int sayi) {
        if (sayi < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(sayi); i++) {
            if (sayi % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void asalCarpanlar(int sayi) {
        System.out.print(sayi + " sayısının asal çarpanları: ");

        for (int i = 2; i <= sayi; i++) {

            while (sayi % i == 0 && asalMi(i)) {
                System.out.print(i + " ");
                sayi /= i;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        asalCarpanlar(sayi);
    }
}
