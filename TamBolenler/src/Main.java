import java.util.Scanner;

class TamBolenler {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        System.out.println(sayi + " sayısının tam bölenleri:");

        for (int i = 1; i <= sayi; i++) {
            if (sayi % i == 0) {
                System.out.println(i);
            }
        }
    }
}
