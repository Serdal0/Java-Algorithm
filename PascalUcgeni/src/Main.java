import java.util.Scanner;

class PascalUcgeni {

    public static void pascalUcgeni(int satirSayisi) {
        int[][] pascal = new int[satirSayisi][satirSayisi];

        for (int i = 0; i < satirSayisi; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    pascal[i][j] = 1;
                } else {

                    pascal[i][j] = pascal[i-1][j-1] + pascal[i-1][j];
                }
                System.out.print(pascal[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Pascal üçgeninin kaç satır olmasını istersiniz? ");
        int satirSayisi = scanner.nextInt();

        pascalUcgeni(satirSayisi);
    }
}
