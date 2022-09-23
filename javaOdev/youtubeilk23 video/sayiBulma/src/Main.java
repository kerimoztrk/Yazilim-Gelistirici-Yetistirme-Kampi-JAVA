public class Main {
    public static void main(String[] args) {

        int[]sayilar=new int[]{1,2,5,7,9,0};
        int arananSayi=5;
        boolean varMi=false;

        for (int sayi:sayilar){
            if (arananSayi==sayi){
                varMi=true;
                break;

            }
        }

        if (varMi){
            System.out.println(" Aranan sayi dizide mevcuttur.");

        }else{
            System.out.println("Aranan sayi dizide yoktur.");
        }
    }
}