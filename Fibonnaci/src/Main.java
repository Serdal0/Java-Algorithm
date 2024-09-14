import java.util.Scanner;

class Fibonacci {

    public static void fibonacciSerisi(int terimSayisi) {
        int ilk = 0, ikinci = 1;

        System.out.print("Fibonacci Serisi: " + ilk + " " + ikinci);

        for (int i = 2; i < terimSayisi; i++) {
            int sonraki = ilk + ikinci;
            System.out.print(" " + sonraki);
            ilk = ikinci;
            ikinci = sonraki;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç terimlik Fibonacci serisi istiyorsunuz? ");
        int terimSayisi = scanner.nextInt();

        fibonacciSerisi(terimSayisi);
    }
}
