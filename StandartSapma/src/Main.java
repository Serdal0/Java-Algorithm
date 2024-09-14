import java.util.Scanner;
class StandartSapma {

    public static double ortalama(double[] sayilar, int n) {
        double toplam = 0;
        for (int i = 0; i < n; i++) {
            toplam += sayilar[i];
        }
        return toplam / n;
    }

    public static double standartSapma(double[] sayilar, int n) {
        double ortalamaDegeri = ortalama(sayilar, n);
        double toplam = 0;

        for (int i = 0; i < n; i++) {
            toplam += Math.pow(sayilar[i] - ortalamaDegeri, 2);
        }

        return Math.sqrt(toplam / n);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç adet veri gireceksiniz? ");
        int n = scanner.nextInt();

        double[] sayilar = new double[n];
        System.out.println("Verileri girin:");
        for (int i = 0; i < n; i++) {
            sayilar[i] = scanner.nextDouble();
        }

        double sapma = standartSapma(sayilar, n);
        System.out.println("Verilerin standart sapması: " + sapma);
    }
}
