public class Main {
    public static void main(String[] args) {
        int[] sayilar={2,4,9,5,6,3,2,7};
        int aranacak=5;
        boolean varMi=false;
        for(int sayi:sayilar){
            if (sayi==aranacak){
                varMi=true;
            }
        }
        if(varMi){
            System.out.println("Aranan sayı Listede vardır.");
        }
        else{
            System.out.println("Aranan sayı listede yoktur.");
        }
    }
}